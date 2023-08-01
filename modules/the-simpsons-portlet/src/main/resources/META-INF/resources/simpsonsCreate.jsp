<%@ include file="/init.jsp" %>

<liferay-portlet:actionURL var="createCharacterURL1" name="/simpsonsCreate">
</liferay-portlet:actionURL>

<a href="<%= createCharacterURL1 %>">Create Character Action </a>

<h2 class="simpsonsButton">Create Character</h2>

<div>
    <label>Name:</label>
    <input type="text" id="name" name="<portlet:namespace/>name" required /><br />

    <label>Description:</label>
    <input type="text" id="description" name="<portlet:namespace/>description" required /><br />

    <label>Image:</label>
    <input type="text" id="image" name="<portlet:namespace/>image" required /><br />

    <label>Genre:</label>
    <input type="text" id="genre" name="<portlet:namespace/>genre" required /><br />

    <button onclick="createCharacter()">Create Character</button>
</div>

<script>
    function createCharacter() {
     var name = document.getElementById("name").value;
        var description = document.getElementById("description").value;
        var image = document.getElementById("image").value;
        var genre = document.getElementById("genre").value;

   jQuery.ajax({
             type: 'GET',
             url : '${createCharacterURL1}',
             cache:false,
             async:true,
             error: function(){
                         alert('error');
                    },
            dataType: "text",
            data: {
             <portlet:namespace/>name: name,
             <portlet:namespace/>description: description,
             <portlet:namespace/>image: image,
             <portlet:namespace/>genre: genre
            },

             success: function(status) {
    console.log("status ",status);
             }
        });
 }
</script>
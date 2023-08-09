<%@ include file="/init.jsp" %>

<%
long characterId = (long) request.getAttribute("characterId");
%>

<%= characterId %>

<liferay-portlet:actionURL var="editCharacterURL" name="/simpsonsEditAction">
    <liferay:param name='characterId' value='${character.characterId}' />
</liferay-portlet:actionURL>

<%-- Display the character information to be edited --%>
<div class="filmContainer mt-3">
    <div class="card cardWidth simpsonsCard">
        <img
            alt="${character.name} poster"
            src="${character.image}"
            class="card-img-top"
        />
        <div class="card-body">
            <h4 class="card-title">${character.name}</h4>
            <form action="<portlet:actionURL name='/updateCharacter' var='updateCharacterURL' />"
                  method="post">
                <div class="form-group">
                    <label for="name">Name</label>
                    <input type="text" class="form-control" id="name" name="<portlet:namespace/>name" value="${character.name}" required>
                </div>
                <div class="form-group">
                    <label for="description">Description</label>
                    <textarea class="form-control" id="description" name="<portlet:namespace/>description" required>${character.description}</textarea>
                </div>
                <div class="form-group">
                    <label for="image">Image URL</label>
                    <input type="text" class="form-control" id="image" name="<portlet:namespace/>image" value="${character.image}" required>
                </div>
                <div class="form-group">
                    <label for="genre">Genre</label>
                    <input type="text" class="form-control" id="genre" name="<portlet:namespace/>genre" value="${character.genre}" required>
                </div>
                <input type="hidden" id="characterId" name="<portlet:namespace/>characterId" />
                <button class="btn simpsonsButton" onclick="editCharacter(<%= characterId %>)">Update Character</button>
            </form>
        </div>
    </div>
</div>

<script>
    function editCharacter(characterId) {
    console.log("characterId", characterId);

     var characterIdInput = document.querySelector('#characterId');

     characterIdInput.value = characterId;
     var name = document.getElementById("name").value;
    var description = document.getElementById("description").value;
    var image = document.getElementById("image").value;
    var genre = document.getElementById("genre").value;

   jQuery.ajax({
             type: 'GET',
             url : '${editCharacterURL}',
             cache:false,
             async:true,
             error: function(){
                         alert('error');
                    },
            dataType: "text",
            data: {
            <portlet:namespace/>characterIdInput: characterIdInput.value,
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
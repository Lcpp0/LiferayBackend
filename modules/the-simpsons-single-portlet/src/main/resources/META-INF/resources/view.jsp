<%@ include file="/init.jsp" %>

<liferay-portlet:actionURL var="deleteCharacterURL" name="deleteCharacter">
</liferay-portlet:actionURL>

<%
List<Character> characters = (List<Character>) request.getAttribute("characters");
%>

<liferay-ui:success key="success" message="Personaje eliminado exitosamente" />
<liferay-ui:error key="error" message="Lo sentimos, el personaje no pudo ser eliminado" />

<div class="filmContainer mt-3">
    <%-- Use JSTL to iterate through the characters list and display them --%>
    <input type="hidden" id="characterId_${character.characterId}" name="<portlet:namespace/>characterId"/>
     <c:forEach var="character" items="${characters}">
       <div class="card cardWidth simpsonsCard" key={character.characterId}>
           <img
               alt="${character.name} poster"
               src=${character.image}
               class="card-img-top"
           />
           <div class="card-body">
               <h4 class="card-title">${character.name}</h4>
               <p class="card-text">${character.description}</p>
               <div>
               </div>
               <div>
                    <button class="btn simpsonsButton" onclick='deleteCharacter(${character.characterId})'>Delete Character</button>
               </div>
           </div>
       </div>
    </c:forEach>
</div>

<script>
    function deleteCharacter(characterId) {
    console.log("characterId ", characterId);
    var characterIdInput = document.querySelector('#characterId_' + characterId);
    characterIdInput.value = characterId;
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
            <portlet:namespace/>characterIdInput: characterIdInput.value
        },
         success: function(status) {
            console.log("status ",status);
         }
        });
    }
</script>
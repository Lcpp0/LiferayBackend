<%@ include file="/init.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.the.simpsons.sb.model.Character" %>


<liferay-portlet:renderURL var="editCharacterURL">
    <liferay-portlet:param name="mvcRenderCommandName" value="/simpsonsEdit"/>
</liferay-portlet:renderURL>

<liferay-portlet:actionURL var="deleteCharacterURL" name="/simpsonsDeleteAction">
</liferay-portlet:actionURL>

<%
List<Character> characters = (List<Character>) request.getAttribute("characters");
%>

<div class="filmContainer mt-3">
    <%-- Use JSTL to iterate through the characters list and display them --%>
     <c:forEach var="character" items="${characters}">
     <input type="hidden" id="characterId_${character.characterId}" name="<portlet:namespace/>characterId"/>
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
                  <a href="<%= editCharacterURL.toString() %>&characterId=${character.characterId}" class=" btn simpsonsButton">Edit</a>
               </div>
               <div>
                    <button class="btn simpsonsButton mt-1" onclick='deleteCharacter(${character.characterId})'>Delete Character</button>
               </div>
           </div>
       </div>
    </c:forEach>
</div>

<script>
function deleteCharacter(characterId) {
    var characterIdInput = document.querySelector('#characterId_' + characterId);
    characterIdInput.value = characterId;
    jQuery.ajax({
        type: 'GET',
        url : '${deleteCharacterURL}',
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
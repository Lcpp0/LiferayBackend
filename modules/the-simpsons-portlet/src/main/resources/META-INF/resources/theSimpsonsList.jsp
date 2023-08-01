<%@ include file="/init.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.the.simpsons.sb.model.Character" %>

<%
List<Character> characters = (List<Character>) request.getAttribute("characters");
%>

<div class="filmContainer mt-3">
    <%-- Use JSTL to iterate through the characters list and display them --%>
     <c:forEach var="character" items="${characters}">
       <div class="card cardWidth simpsonsCard" key={character.characterId}>
                               <img
                                   alt={`${character.name} poster`}
                                   src=${character.image}
                                   class="card-img-top"
                               />
                               <div class="card-body">
                                   <h4 class="card-title">${character.name}</h4>
                                   <p class="card-text">${character.description}</p>
                                   <div>
                                       <button class="simpsonsButton">Edit</button>
                                   </div>
                                   <div>
                                       <button class="simpsonsButton">Delete</button>
                                   </div>
                               </div>
                           </div>
    </c:forEach>
</div>
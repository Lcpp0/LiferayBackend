<%@ include file="/init.jsp" %>

    <liferay-portlet:renderURL var="theSimpsonsListURL">
     <liferay-portlet:param name="mvcRenderCommandName" value="/simpsonsList"/>
    </liferay-portlet:renderURL>


    <a href="<%= theSimpsonsListURL %>" class="btn simpsonsButtonMain">List The Simpsons</a>


    <liferay-portlet:renderURL var="createCharacterURL">
     <liferay-portlet:param name="mvcRenderCommandName" value="/simpsonsCreate"/>
    </liferay-portlet:renderURL>

    <a href="<%= createCharacterURL %>" class="btn simpsonsButtonMain">Create Character Command </a>
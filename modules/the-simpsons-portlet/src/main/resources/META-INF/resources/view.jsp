<%@ include file="/init.jsp" %>

<p>
	<p>
     <b><liferay-ui:message key="proyectosemillero.caption"/></b>
    </p>
    <p>
     <b>ASD</b>
    </p>
    <p>
     <b>JDK</b>
    </p>

    <!-- <portlet:renderURL var="theSimpsonsListURL">
        <portlet:param name="mvcPath" value="/simpsonsList" />
    </portlet:renderURL> -->

    <liferay-portlet:renderURL var="theSimpsonsListURL">
     <liferay-portlet:param name="mvcRenderCommandName" value="/simpsonsList"/> <!-- el nombre del render -->
    </liferay-portlet:renderURL>


    <a href="<%= theSimpsonsListURL %>">List The Simpsons</a>

    <!-- <portlet:actionURL var="createCharacterURL">
        <portlet:param name="javax.portlet.action" value="/simpsonsCreate" />
    </portlet:actionURL> -->

    <!-- <liferay-portlet:actionURL var="createCharacterURL1" name="/simpsonsCreate">
    </liferay-portlet:actionURL>

    <a href="<%= createCharacterURL1 %>">Create Character Action </a>-->


    <liferay-portlet:renderURL var="createCharacterURL">
     <liferay-portlet:param name="mvcRenderCommandName" value="/simpsonsCreate"/> <!-- el nombre del render -->
    </liferay-portlet:renderURL>

    <a href="<%= createCharacterURL %>">Create Character Command </a>
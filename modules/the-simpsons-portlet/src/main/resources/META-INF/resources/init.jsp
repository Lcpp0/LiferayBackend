<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %><%@
taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %><%@
taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %><%@
taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<%@ page import="com.the.simpsons.portlet.configuration.TheSimpsonsPortletConfiguration" %>
<%@ page import="com.the.simpsons.portlet.constants.TheSimpsonsPortletKeys" %>

<liferay-theme:defineObjects />

<portlet:defineObjects />

<%
String title=portletPreferences.getValue(TheSimpsonsPortletKeys.PREFERENCE_TITLE, "");
%>
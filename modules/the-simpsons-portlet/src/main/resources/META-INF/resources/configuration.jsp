<%@ include file="/init.jsp" %>
<liferay-portlet:actionURL portletConfiguration="<%=true%>" var="configActionURL" />
<aui:form action="<%=configActionURL%>" method="post" name="fm">
    <aui:input name="<%=com.liferay.portal.kernel.util.Constants.CMD%>" type="hidden"
        value="<%=com.liferay.portal.kernel.util.Constants.UPDATE%>" />
    <aui:fieldset cssClass="sheet sheet-lg" label="Configuracion general">
        <aui:input name="<%=TheSimpsonsPortletKeys.PREFERENCE_TITLE%>" value="<%=title%>" />
    </aui:fieldset>
    <aui:button-row>
        <aui:button type="submit"></aui:button>
    </aui:button-row>
</aui:form>
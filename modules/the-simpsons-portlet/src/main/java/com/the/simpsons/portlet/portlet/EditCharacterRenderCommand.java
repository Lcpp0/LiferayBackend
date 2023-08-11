package com.the.simpsons.portlet.portlet;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.util.PortalUtil;
import com.the.simpsons.portlet.constants.TheSimpsonsPortletKeys;
import org.osgi.service.component.annotations.Component;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.servlet.http.HttpServletRequest;

@Component(immediate = true,
        property = {
            "javax.portlet.name=" + TheSimpsonsPortletKeys.THESIMPSONS,
            "mvc.command.name=/simpsonsEdit"},
        service = MVCRenderCommand.class)
public class EditCharacterRenderCommand implements MVCRenderCommand {

    private final Log log = LogFactoryUtil.getLog(EditCharacterRenderCommand.class);
    @Override
    public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
        // Retrieve HttpServletRequest
        HttpServletRequest httpReq = PortalUtil.getOriginalServletRequest(PortalUtil.getHttpServletRequest(renderRequest));

        // Get the character ID from the request
        long characterId = Long.parseLong(httpReq.getParameter("characterId"));

        // Set the character details as attributes in renderRequest
        renderRequest.setAttribute("characterId", characterId);

        // Return the path of the JSP for editing the character details
        return "/simpsonsEdit.jsp";
    }
}


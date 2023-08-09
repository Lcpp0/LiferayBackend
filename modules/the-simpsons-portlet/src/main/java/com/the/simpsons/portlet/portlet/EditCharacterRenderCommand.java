package com.the.simpsons.portlet.portlet;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.the.simpsons.portlet.constants.TheSimpsonsPortletKeys;
import org.osgi.service.component.annotations.Component;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.servlet.http.HttpServletRequest;

@Component(
        immediate = true,
        property = {
                "javax.portlet.name=" + TheSimpsonsPortletKeys.THESIMPSONS,
                "mvc.command.name=/simpsonsEdit"
        },
        service = MVCRenderCommand.class
)
public class EditCharacterRenderCommand implements MVCRenderCommand {

    private final Log log = LogFactoryUtil.getLog(EditCharacterRenderCommand.class);

    public String render1(RenderRequest renderRequest, RenderResponse renderResponse)
            throws PortletException {
        // Get the character ID from the request
        long characterId1 = ParamUtil.getLong(renderRequest, "characterIdInput");
        log.info("characterId render input" + characterId1);

        String characterId = ParamUtil.getString(renderRequest, "characterId");
        log.info("characterId render input" + characterId);

        log.info(renderRequest.getAttribute("characterId"));

        renderRequest.setAttribute("characterId", characterId1);
        // Fetch the character details from the database using service builder methods
        // Set the character details as attributes in renderRequest
        // Return the path of the JSP for editing the character details
        return "/simpsonsEdit.jsp";
    }

    @Override
    public String render(RenderRequest renderRequest, RenderResponse renderResponse)
            throws PortletException {
        // Retrieve HttpServletRequest
        HttpServletRequest httpReq = PortalUtil.getOriginalServletRequest(PortalUtil.getHttpServletRequest(renderRequest));

        // Get the character ID from the request
        long characterId = Long.parseLong(httpReq.getParameter("characterId"));
        log.info("characterId from URL: " + characterId);

        renderRequest.setAttribute("characterId", characterId);
        // Fetch the character details from the database using service builder methods
        // Set the character details as attributes in renderRequest
        // Return the path of the JSP for editing the character details
        return "/simpsonsEdit.jsp";
    }
}


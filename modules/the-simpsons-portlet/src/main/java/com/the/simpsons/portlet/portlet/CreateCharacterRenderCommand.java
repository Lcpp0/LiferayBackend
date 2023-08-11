package com.the.simpsons.portlet.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.the.simpsons.portlet.constants.TheSimpsonsPortletKeys;
import org.osgi.service.component.annotations.Component;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

@Component(
        immediate = true,
        property = {
                "javax.portlet.name=" + TheSimpsonsPortletKeys.THESIMPSONS,
                "mvc.command.name=/simpsonsCreate"
        },
        service = MVCRenderCommand.class
)
public class CreateCharacterRenderCommand implements MVCRenderCommand {

    @Override
    public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
        // Return the path of the JSP to render
        return "/simpsonsCreate.jsp";
    }
}

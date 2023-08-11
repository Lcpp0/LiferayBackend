package com.the.simpsons.portlet.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.the.simpsons.portlet.constants.TheSimpsonsPortletKeys;
import com.the.simpsons.sb.service.CharacterLocalServiceUtil;
import org.osgi.service.component.annotations.Component;

import javax.portlet.*;
import java.util.List;

@Component(
        immediate = true,
        property = {
                "javax.portlet.name=" + TheSimpsonsPortletKeys.THESIMPSONS,
                "mvc.command.name=/simpsonsList" // Change this to the desired URL mapping
        },
        service = MVCRenderCommand.class
)
public class CharactersRenderCommand implements MVCRenderCommand {

    @Override
    public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
        // Get the list of characters
        List<com.the.simpsons.sb.model.Character> characters = CharacterLocalServiceUtil.getAllCharacters();
        renderRequest.setAttribute("characters", characters);

        // Return the path of the JSP to render
        return "/theSimpsonsList.jsp";
    }
}
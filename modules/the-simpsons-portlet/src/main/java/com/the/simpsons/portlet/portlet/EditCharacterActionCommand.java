package com.the.simpsons.portlet.portlet;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.the.simpsons.portlet.constants.TheSimpsonsPortletKeys;
import com.the.simpsons.sb.service.CharacterLocalServiceUtil;
import org.osgi.service.component.annotations.Component;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

@Component(
        immediate = true,
        property = {
                "javax.portlet.name=" + TheSimpsonsPortletKeys.THESIMPSONS,
                "mvc.command.name=/simpsonsEditAction"
        },
        service = MVCActionCommand.class
)
public class EditCharacterActionCommand implements MVCActionCommand {

    private final Log log = LogFactoryUtil.getLog(EditCharacterActionCommand.class);
    @Override
    public boolean processAction(ActionRequest actionRequest, ActionResponse actionResponse)
            throws PortletException {
        // Get the character ID from the request
        //long characterId = ParamUtil.getLong(actionRequest, "characterId", 0);
        log.info("++++++++En el action ++++++");
        long characterId = ParamUtil.getLong(actionRequest, "characterIdInput");

        log.info("msg edit characterId "+ characterId);

        // Perform the edit operation based on the character ID
        log.info("msg edit");
        String name = ParamUtil.getString(actionRequest, "name");
        String description = ParamUtil.getString(actionRequest, "description");
        String image = ParamUtil.getString(actionRequest, "image");
        String genre = ParamUtil.getString(actionRequest, "genre");

        log.info("name  edit" + name);
        log.info("description edit" + description);
        log.info("image edit" + image);
        log.info("genre edit" + genre);

        // Create a ServiceContext
        ServiceContext serviceContext = new ServiceContext();
        ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
        serviceContext.setScopeGroupId(themeDisplay.getScopeGroupId());
        serviceContext.setUserId(themeDisplay.getUserId());


        log.info("serviceContext " + serviceContext);
        try {
            log.info("Try ");
            CharacterLocalServiceUtil.updateCharacter(characterId, name, description, image, genre, serviceContext);
            //CharacterLocalServiceUtil.createCharacter(name, description, image, genre, serviceContext);
            return true; // Return true on successful processing
        } catch (PortalException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false; // Return false on failure
        }
    }
}


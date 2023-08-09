package com.the.simpsons.portlet.portlet;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
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
                "mvc.command.name=/simpsonsDeleteAction"
        },
        service = MVCActionCommand.class
)
public class DeleteCharacterActionCommand implements MVCActionCommand {
    private final Log log = LogFactoryUtil.getLog(DeleteCharacterActionCommand.class);

    @Override
    public boolean processAction(ActionRequest actionRequest, ActionResponse actionResponse) throws PortletException {

        log.info("info" + ParamUtil.getString(actionRequest, "characterIdInput"));

        long characterId = ParamUtil.getLong(actionRequest, "characterIdInput");
        try {
            CharacterLocalServiceUtil.deleteCharacter(characterId);
            SessionMessages.add(actionRequest, "success");
            return true;
        } catch (PortalException e) {
            SessionErrors.add(actionRequest, "error");
            log.error("An error occurred while deleting the character.", e);
            return false;
        }
    }
}

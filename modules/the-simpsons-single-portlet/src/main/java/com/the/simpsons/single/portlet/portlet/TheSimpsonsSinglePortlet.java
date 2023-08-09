package com.the.simpsons.single.portlet.portlet;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.the.simpsons.sb.service.CharacterLocalServiceUtil;
import com.the.simpsons.single.portlet.constants.TheSimpsonsSinglePortletKeys;
import org.osgi.service.component.annotations.Component;

import javax.portlet.*;
import java.io.IOException;
import java.util.List;

/**
 * @author lalis
 */
@Component(
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=TheSimpsonsSingle",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + TheSimpsonsSinglePortletKeys.THESIMPSONSSINGLE,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class TheSimpsonsSinglePortlet extends MVCPortlet {

	private final Log log = LogFactoryUtil.getLog(TheSimpsonsSinglePortlet.class);
	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {
		List<com.the.simpsons.sb.model.Character> characters = CharacterLocalServiceUtil.getAllCharacters();
		renderRequest.setAttribute("characters", characters);
		super.doView(renderRequest, renderResponse);
	}
	@ProcessAction(name = "deleteCharacter")
	public void deleteCharacter(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException, PortletException{
		log.info("info" + ParamUtil.getString(actionRequest, "characterIdInput"));

		long characterId = ParamUtil.getLong(actionRequest, "characterIdInput");
		try {
			CharacterLocalServiceUtil.deleteCharacter(characterId);
			SessionMessages.add(actionRequest, "success");
		} catch (PortalException e) {
			SessionErrors.add(actionRequest, "error");
			throw new RuntimeException(e);
		}
		super.processAction(actionRequest,actionResponse);
	}
}

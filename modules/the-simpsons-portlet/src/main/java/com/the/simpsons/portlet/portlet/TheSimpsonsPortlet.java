package com.the.simpsons.portlet.portlet;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.the.simpsons.portlet.constants.TheSimpsonsPortletKeys;
import org.osgi.service.component.annotations.Component;

import javax.portlet.*;
import java.io.IOException;
import java.util.Enumeration;

/**
 * @author Laura
 */
@Component(
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=TheSimpsons",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + TheSimpsonsPortletKeys.THESIMPSONS,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class TheSimpsonsPortlet extends MVCPortlet {

	private final Log log = LogFactoryUtil.getLog(TheSimpsonsPortlet.class);
	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {
		super.doView(renderRequest, renderResponse);
	}

	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException, IOException {
		//Get Preferences
		PortletPreferences prefs = renderRequest.getPreferences();

		//Get Title Preference
		String title = prefs.getValue(TheSimpsonsPortletKeys.PREFERENCE_TITLE, "");


		//Check if the preference is being set
		Enumeration<String> preferenceNames = prefs.getNames();
		while (preferenceNames.hasMoreElements()) {
			String preferenceName = preferenceNames.nextElement();
			String preferenceValue = prefs.getValue(preferenceName, null);
			log.info("Preference Name: " + preferenceName + ", Value: " + preferenceValue);
		}

		renderRequest.setAttribute(TheSimpsonsPortletKeys.PREFERENCE_TITLE, title);
		super.render(renderRequest, renderResponse);
	}
}
package com.the.simpsons.portlet.configuration;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.ConfigurationAction;
import com.liferay.portal.kernel.portlet.DefaultConfigurationAction;
import com.liferay.portal.kernel.util.ParamUtil;
import com.the.simpsons.portlet.constants.TheSimpsonsPortletKeys;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;

@Component(
        configurationPolicy = ConfigurationPolicy.OPTIONAL,
        immediate = true,
        property = {
                "javax.portlet.name=" + TheSimpsonsPortletKeys.THESIMPSONS
        },
        service = ConfigurationAction.class
)
public class TheSimpsonsPortletConfiguration extends DefaultConfigurationAction {

    private final Log log = LogFactoryUtil.getLog(TheSimpsonsPortletConfiguration.class);

    @Override
    public void processAction(PortletConfig portletConfig, ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
        String title = ParamUtil.getString(actionRequest, TheSimpsonsPortletKeys.PREFERENCE_TITLE);
        setPreference(actionRequest, TheSimpsonsPortletKeys.PREFERENCE_TITLE, title);

        super.processAction(portletConfig, actionRequest, actionResponse);
    }
}

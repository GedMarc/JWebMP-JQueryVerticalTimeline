/*
 * Copyright (C) 2017 GedMarc
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.jwebmp.plugins.jqui.verticaltimeline;

import com.jwebmp.core.Page;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.plugins.PluginStatus;
import com.jwebmp.core.services.IPageConfigurator;

import jakarta.validation.constraints.NotNull;

/**
 * @author GedMarc
 */
@PluginInformation(pluginName = "Vertical Timeline",
		pluginUniqueName = "vertical-timeline",
		pluginDescription = "We all are quite familiar with vertical timelines: all instant messaging applications use them. A current trend in web design is to use a similar structure, but to show a process rather than a sequence of events. That is why timeline-like structures are often used for the “How it works? page.",
		pluginVersion = "1.0",
		pluginDependancyUniqueIDs = "jquery,bootstrap,modernizr",
		pluginCategories = "ui, web, colour picker, spectrum, drop down",
		pluginSubtitle = "A straight forward and simple Responsive Vertical Timeline ",
		pluginGitUrl = "https://codyhouse.co/gem/vertical-timeline/",
		pluginSourceUrl = "https://github.com/GedMarc/JWebMP-VerticalTimelineGemPlugin",
		pluginWikiUrl = "https://github.com/GedMarc/JWebMP-VerticalTimelineGemPluginwiki",
		pluginOriginalHomepage = "https://codyhouse.co/gem/vertical-timeline/",
		pluginDownloadUrl = "https://mvnrepository.com/artifact/com.jwebmp.plugins.jquery/jwebmp-jqui-vertical-timeline",
		pluginIconUrl = "",
		pluginIconImageUrl = "",
		pluginLastUpdatedDate = "2017/03/04",
		pluginGroupId = "com.jwebmp.plugins.jquery",
		pluginArtifactId = "jwebmp-jqui-vertical-timeline",
		pluginModuleName = "com.jwebmp.plugins.jqueryverticaltimeline",
		pluginStatus = PluginStatus.Released
)
public class JQUIVerticalTimelinePageConfigurator
		implements IPageConfigurator<JQUIVerticalTimelinePageConfigurator>
{
	/**
	 * If this configurator is enabled
	 */
	private static boolean enabled = true;

	/**
	 * Method isEnabled returns the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @return the enabled (type boolean) of this AngularAnimatedChangePageConfigurator object.
	 */
	public static boolean isEnabled()
	{
		return JQUIVerticalTimelinePageConfigurator.enabled;
	}

	/**
	 * Method setEnabled sets the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @param mustEnable
	 * 		the enabled of this AngularAnimatedChangePageConfigurator object.
	 */
	public static void setEnabled(boolean mustEnable)
	{
		JQUIVerticalTimelinePageConfigurator.enabled = mustEnable;
	}

	@NotNull
	@Override
	@SuppressWarnings("unchecked")
	 public Page<?> configure(Page<?> page)
	{
		if (!page.isConfigured() && enabled())
		{
			page.getBody()
			    .getJavascriptReferences()
			    .add(JQUIVerticalTimelineReferencePool.VerticalTimelineReferenceUnderscore.getJavaScriptReference());
			page.getBody()
			    .getJavascriptReferences()
			    .add(JQUIVerticalTimelineReferencePool.VerticalTimelineReferenceTableTop.getJavaScriptReference());
			page.getBody()
			    .getJavascriptReferences()
			    .add(JQUIVerticalTimelineReferencePool.VerticalTimelineReferenceIsotope.getJavaScriptReference());
			page.getBody()
			    .getJavascriptReferences()
			    .add(JQUIVerticalTimelineReferencePool.VerticalTimelineReferenceImagesLoaded.getJavaScriptReference());
			page.getBody()
			    .getJavascriptReferences()
			    .add(JQUIVerticalTimelineReferencePool.VerticalTimelineReference.getJavaScriptReference());
			page.getBody()
			    .getCssReferences()
			    .add(JQUIVerticalTimelineReferencePool.VerticalTimelineReference.getCssReference());
		}
		return page;
	}

	@Override
	public boolean enabled()
	{
		return JQUIVerticalTimelinePageConfigurator.enabled;
	}

}

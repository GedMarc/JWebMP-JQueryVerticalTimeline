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

import com.jwebmp.core.Component;
import com.jwebmp.core.Feature;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;

import static com.guicedee.services.jsonrepresentation.json.StaticStrings.STRING_CLOSING_BRACKET_SEMICOLON;
import static com.jwebmp.core.utilities.StaticStrings.*;

/**
 * Adds on a ToolTip, String for custom text using header theme, Div for custom contents
 *
 * @author MMagon
 * @version 1.0
 * @since 2013/01/16
 */
public class JQUIVerticalTimelineFeature
		extends Feature<GlobalFeatures, JQUIVerticalTimelineParentOptions, JQUIVerticalTimelineFeature>
{


	private JQUIVerticalTimelineParentOptions options;

	/**
	 * Constructs a new Tooltip ComponentFeatureBase for a component. Adds the tooltip text as the Title attribute to the component
	 * <p>
	 *
	 * @param forComponent
	 */
	public JQUIVerticalTimelineFeature(Component forComponent)
	{
		super("JQUIVerticalTimelineFeature");
		setComponent(forComponent);
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj)
	{
		return super.equals(obj);
	}

	/**
	 * Returns all the tooltip options
	 * <p>
	 *
	 * @return
	 */
	@Override
	public JQUIVerticalTimelineParentOptions getOptions()
	{
		if (options == null)
		{
			options = new JQUIVerticalTimelineParentOptions(new JQUIVerticalTimelineOptions());
		}
		return options;
	}

	@Override
	public void assignFunctionsToComponent()
	{
		addQuery(getComponent().asBase().getJQueryID() + "verticalTimeline(" + getOptions() + STRING_CLOSING_BRACKET_SEMICOLON + getNewLine());
	}
}

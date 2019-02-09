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

import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.plugins.jquery.JQueryPageConfigurator;

import java.util.List;

/**
 * An implementation of the Responsive Vertical Timeline - https://codyhouse.co/gem/vertical-timeline/
 * <p>
 * <p>
 *
 * @author GedMarc
 * @version 1.0
 * @since 24 October 2016
 */
public class JQUIVerticalTimeline
		extends Div<JQUIVerticalTimelineChildren, JQUIVerticalTimelineAttributes, JQUIVerticalTimelineFeatures, JQUIVerticalTimelineEvents, JQUIVerticalTimeline>

{


	private JQUIVerticalTimelineFeature feature;

	/**
	 * Constructs a new instance of the vertical timeline
	 */
	public JQUIVerticalTimeline()
	{
		addFeature(getFeature());
		JQueryPageConfigurator.setRequired(true);
	}

	public final JQUIVerticalTimelineFeature getFeature()
	{
		if (feature == null)
		{
			feature = new JQUIVerticalTimelineFeature(this);
		}
		return feature;
	}

	@Override
	public JQUIVerticalTimelineOptions getOptions()
	{
		return getFeature().getOptions()
		                   .getData()
		                   .get(0);
	}

	public List<JQUIVerticalTimelineOptions> getOptionsAll()
	{
		return getFeature().getOptions()
		                   .getData();
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}

	@Override
	public boolean equals(Object o)
	{
		return super.equals(o);
	}
}

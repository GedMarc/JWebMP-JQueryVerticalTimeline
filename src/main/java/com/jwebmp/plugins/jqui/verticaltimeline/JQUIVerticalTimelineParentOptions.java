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

import com.jwebmp.core.htmlbuilder.css.measurement.MeasurementCSSImpl;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

import java.util.ArrayList;
import java.util.List;

/**
 * @author GedMarc
 * @since 07 Aug 2017
 */
public class JQUIVerticalTimelineParentOptions
		extends JavaScriptPart<JQUIVerticalTimelineParentOptions>
{


	private final List<JQUIVerticalTimelineOptions> data;

	private MeasurementCSSImpl percentage;

	/*
	 * Constructs a new JQUIVerticalTimelineParentOptions
	 */
	public JQUIVerticalTimelineParentOptions(JQUIVerticalTimelineOptions data)
	{
		this.data = new ArrayList<>();
		this.data.add(data);
		//Nothing needed
	}

	public List<JQUIVerticalTimelineOptions> getData()
	{
		return data;
	}

	/**
	 * Gets the parent percentage
	 *
	 * @return
	 */
	public MeasurementCSSImpl getPercentage()
	{
		return percentage;
	}

	/**
	 * Sets the parent percentage
	 *
	 * @param percentage
	 *
	 * @return
	 */
	public JQUIVerticalTimelineParentOptions setPercentage(MeasurementCSSImpl percentage)
	{
		this.percentage = percentage;
		return this;
	}

	@Override
	public String toString()
	{
		return super.toString()
		            .replaceAll("\"data\"", "data")
		            .replaceAll("\n", "")
		            .replace("\r", "")
		            .replace("\t", "");
	}
}

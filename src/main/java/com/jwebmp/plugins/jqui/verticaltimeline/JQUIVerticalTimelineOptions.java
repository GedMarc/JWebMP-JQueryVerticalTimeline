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

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * All the options for the tooltip library
 * <p>
 *
 * @author GedMarc
 * @version 1.0
 * 		<p>
 * 		<p>
 * @since Mar 4, 2015
 */
public class JQUIVerticalTimelineOptions
		extends JavaScriptPart<JQUIVerticalTimelineOptions>
{
	@JsonIgnore
	private final SimpleDateFormat sdfDateFormat = new SimpleDateFormat("dd MMM yyyy");
	@JsonIgnore
	private final SimpleDateFormat customDateFormat = new SimpleDateFormat("MMM dd");
	private String title;
	/**
	 * OURL to use as an icon
	 */
	@JsonProperty("title icon")
	private String icon;
	@JsonIgnore
	private Date date;
	@JsonIgnore
	private String displayFormat;
	@JsonProperty("photo url")
	private String photoUrl;
	private String caption;
	private String body;
	@JsonProperty(value = "read more url")
	private String readMoreUrl;

	public JQUIVerticalTimelineOptions()
	{
		//Nothing needed
	}

	public JQUIVerticalTimelineOptions(String title, Date date, String caption, String body)
	{
		this.title = title;
		this.date = date;
		this.caption = caption;
		this.body = body;
	}

	public JQUIVerticalTimelineOptions(String title, String icon, String caption, String body)
	{
		this.title = title;
		this.icon = icon;
		this.caption = caption;
		this.body = body;
	}

	public JQUIVerticalTimelineOptions(String title, String icon, Date date, String caption, String body)
	{
		this.title = title;
		this.icon = icon;
		this.date = date;
		this.caption = caption;
		this.body = body;
		readMoreUrl = readMoreUrl;
	}

	@JsonProperty("display date")
	public String renderDisplayDate()
	{
		if (displayFormat != null)
		{
			customDateFormat.applyPattern(displayFormat);
		}

		return customDateFormat.format(getDate());
	}

	public Date getDate()
	{
		if (date == null)
		{
			date = new Date();
		}
		return date;
	}

	public JQUIVerticalTimelineOptions setDate(Date date)
	{
		this.date = date;
		return this;
	}

	public String renderDate()
	{
		return sdfDateFormat.format(getDate());
	}

	public String getBody()
	{
		return body;
	}

	public JQUIVerticalTimelineOptions setBody(String body)
	{
		this.body = body;
		return this;
	}

	public String getCaption()
	{
		return caption;
	}

	public JQUIVerticalTimelineOptions setCaption(String caption)
	{
		this.caption = caption;
		return this;
	}

	public String getDisplayFormat()
	{
		return displayFormat;
	}

	public JQUIVerticalTimelineOptions setDisplayFormat(String displayFormat)
	{
		this.displayFormat = displayFormat;
		return this;
	}

	public String getIcon()
	{
		return icon;
	}

	public JQUIVerticalTimelineOptions setIcon(String icon)
	{
		this.icon = icon;
		return this;
	}

	public String getPhotoUrl()
	{
		return photoUrl;
	}

	public JQUIVerticalTimelineOptions setPhotoUrl(String photoUrl)
	{
		this.photoUrl = photoUrl;
		return this;
	}

	public String getReadMoreUrl()
	{
		return readMoreUrl;
	}

	public JQUIVerticalTimelineOptions setReadMoreUrl(String readMoreUrl)
	{
		this.readMoreUrl = readMoreUrl;
		return this;
	}

	public String getTitle()
	{
		return title;
	}

	public JQUIVerticalTimelineOptions setTitle(String title)
	{
		this.title = title;
		return this;
	}

	@Override
	public String toString()
	{
		return super.toString()
		            .replaceAll("\n", "")
		            .replace("\r", "")
		            .replace("\t", "");
	}

}

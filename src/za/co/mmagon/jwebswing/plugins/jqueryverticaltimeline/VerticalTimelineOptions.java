/*
 * Copyright (C) 2017 Marc Magon
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
package za.co.mmagon.jwebswing.plugins.jqueryverticaltimeline;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import za.co.mmagon.jwebswing.htmlbuilder.javascript.JavaScriptPart;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * All the options for the tooltip library
 * <p>
 *
 * @author GedMarc
 * @version 1.0
 * <p>
 * <p>
 * @since Mar 4, 2015
 */
public class VerticalTimelineOptions extends JavaScriptPart
{
	private static final long serialVersionUID = 1L;
	private final SimpleDateFormat sdfDateFormat = new SimpleDateFormat("dd MMM YYYY");

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
	
	public VerticalTimelineOptions()
	{
		//Nothing needed
	}
	
	public VerticalTimelineOptions(String title, Date date, String caption, String body)
	{
		this.title = title;
		this.date = date;
		this.caption = caption;
		this.body = body;
	}
	
	public VerticalTimelineOptions(String title, String icon, String caption, String body)
	{
		this.title = title;
		this.icon = icon;
		this.caption = caption;
		this.body = body;
	}
	
	public VerticalTimelineOptions(String title, String icon, Date date, String caption, String body)
	{
		this.title = title;
		this.icon = icon;
		this.date = date;
		this.caption = caption;
		this.body = body;
		this.readMoreUrl = readMoreUrl;
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
	
	public String renderDate()
	{
		return sdfDateFormat.format(getDate());
	}
	
	public String getBody()
	{
		return body;
	}
	
	public VerticalTimelineOptions setBody(String body)
	{
		this.body = body;
		return this;
	}
	
	public String getCaption()
	{
		return caption;
	}
	
	public VerticalTimelineOptions setCaption(String caption)
	{
		this.caption = caption;
		return this;
	}
	
	public Date getDate()
	{
		if (date == null)
		{
			date = new Date();
		}
		return date;
	}
	
	public VerticalTimelineOptions setDate(Date date)
	{
		this.date = date;
		return this;
	}
	
	public String getDisplayFormat()
	{
		return displayFormat;
	}
	
	public VerticalTimelineOptions setDisplayFormat(String displayFormat)
	{
		this.displayFormat = displayFormat;
		return this;
	}
	
	public String getIcon()
	{
		return icon;
	}
	
	public VerticalTimelineOptions setIcon(String icon)
	{
		this.icon = icon;
		return this;
	}
	
	public String getPhotoUrl()
	{
		return photoUrl;
	}
	
	public VerticalTimelineOptions setPhotoUrl(String photoUrl)
	{
		this.photoUrl = photoUrl;
		return this;
	}
	
	public String getReadMoreUrl()
	{
		return readMoreUrl;
	}
	
	public VerticalTimelineOptions setReadMoreUrl(String readMoreUrl)
	{
		this.readMoreUrl = readMoreUrl;
		return this;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public VerticalTimelineOptions setTitle(String title)
	{
		this.title = title;
		return this;
	}
	
	@Override
	public String toString()
	{
		return super.toString().replaceAll("\n", "").replace("\r", "").replace("\t", "");
	}
	
}

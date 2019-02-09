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

import com.jwebmp.core.base.references.CSSReference;
import com.jwebmp.core.base.references.JavascriptReference;
import com.jwebmp.core.base.servlets.interfaces.ReferencePool;

/**
 * Default reference pool structure
 *
 * @author GedMarc
 * @since 24 Oct 2016
 */
public enum JQUIVerticalTimelineReferencePool
		implements ReferencePool
{
	VerticalTimelineReference(new JavascriptReference("JQueryVerticalTimeline", 1.0, "bower_components/jquery-vertical-timeline/dist/jquery-vertical-timeline.js"),
	                          new CSSReference("JQueryVerticalTimeline", 1.0, "bower_components/jquery-vertical-timeline/dist/jquery-vertical-timeline.css")),

	VerticalTimelineReferenceUnderscore(new JavascriptReference("JQueryVerticalTimelineUnderscore", 1.0, "bower_components/underscore/underscore.js"), null),
	VerticalTimelineReferenceTableTop(new JavascriptReference("JQueryVerticalTimelineTableTop", 1.0, "bower_components/tabletopnew/src/tabletop.js"), null),
	VerticalTimelineReferenceIsotope(new JavascriptReference("JQueryVerticalTimelineIsotope", 1.0, "bower_components/isotope/jquery.isotope.js"), null),
	VerticalTimelineReferenceImagesLoaded(new JavascriptReference("JQueryVerticalTimelineImagesLoaded", 1.0, "bower_components/imagesloaded/imagesloaded.pkgd.js"), null),
	;

	private JavascriptReference javaScriptReference;
	private CSSReference cssReference;

	JQUIVerticalTimelineReferencePool()
	{
	}

	JQUIVerticalTimelineReferencePool(JavascriptReference javaScriptReference, CSSReference cssReference)
	{
		this.javaScriptReference = javaScriptReference;
		this.cssReference = cssReference;
	}

	@Override
	public CSSReference getCssReference()
	{
		return cssReference;
	}

	@Override
	public void setCssReference(CSSReference cssReference)
	{
		this.cssReference = cssReference;
	}

	@Override
	public JavascriptReference getJavaScriptReference()
	{
		return javaScriptReference;
	}

	@Override
	public void setJavaScriptReference(JavascriptReference javaScriptReference)
	{
		this.javaScriptReference = javaScriptReference;
	}
}

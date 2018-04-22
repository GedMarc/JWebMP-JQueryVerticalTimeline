package com.jwebmp.plugins.jqueryverticaltimeline;

import org.junit.jupiter.api.Test;
import za.co.mmagon.logger.LogFactory;

import java.util.logging.Logger;

public class VerticalTimelineTest

{
	Logger log = LogFactory.getLog("Test");

	@Test
	public void testVerticalHtml()
	{
		VerticalTimeline vt = new VerticalTimeline();
		log.info(vt.toString(true));

	}
}

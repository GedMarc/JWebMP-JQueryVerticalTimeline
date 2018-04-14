package com.jwebmp.plugins.jqueryverticaltimeline;

import com.jwebmp.BaseTestClass;
import org.junit.jupiter.api.Test;
import za.co.mmagon.logger.LogFactory;

import java.util.logging.Logger;

public class VerticalTimelineTest
		extends BaseTestClass
{
	Logger log = LogFactory.getLog("Test");

	@Test
	public void testVerticalHtml()
	{
		VerticalTimeline vt = new VerticalTimeline();
		log.info(vt.toString(true));

	}
}

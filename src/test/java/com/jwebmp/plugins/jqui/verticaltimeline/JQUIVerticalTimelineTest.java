package com.jwebmp.plugins.jqui.verticaltimeline;

import com.guicedee.logger.LogFactory;
import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

public class JQUIVerticalTimelineTest

{
	Logger log = LogFactory.getLog("Test");

	@Test
	public void testVerticalHtml()
	{
		JQUIVerticalTimeline vt = new JQUIVerticalTimeline();
		log.info(vt.toString(true));

	}
}

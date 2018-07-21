package com.jwebmp.core.plugins.jqueryverticaltimeline;

import com.jwebmp.logger.LogFactory;
import org.junit.jupiter.api.Test;

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

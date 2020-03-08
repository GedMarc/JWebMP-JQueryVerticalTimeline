module com.jwebmp.plugins.jqueryverticaltimeline {

	exports com.jwebmp.plugins.jqui.verticaltimeline;

	requires com.jwebmp.core;
	requires com.guicedee.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;
	requires com.guicedee.guicedinjection;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.jqui.verticaltimeline.JQUIVerticalTimelinePageConfigurator;

	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.jqui.verticaltimeline.implementations.JQueryVerticalTimelineExclusionsModule;

	opens com.jwebmp.plugins.jqui.verticaltimeline to com.fasterxml.jackson.databind, com.jwebmp.core;
}

import com.jwebmp.plugins.jqui.verticaltimeline.JQUIVerticalTimelinePageConfigurator;

module com.jwebmp.plugins.jqueryverticaltimeline {

	exports com.jwebmp.plugins.jqui.verticaltimeline;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;
	requires com.jwebmp.guicedinjection;

	provides com.jwebmp.core.services.IPageConfigurator with JQUIVerticalTimelinePageConfigurator;

	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions with com.jwebmp.plugins.jqui.verticaltimeline.implementations.JQueryVerticalTimelineExclusionsModule;
	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.jqui.verticaltimeline.implementations.JQueryVerticalTimelineExclusionsModule;

	opens com.jwebmp.plugins.jqui.verticaltimeline to com.fasterxml.jackson.databind, com.jwebmp.core;
}

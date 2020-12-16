import com.jwebmp.plugins.jqui.verticaltimeline.implementations.JQueryVerticalTimelineInclusionModule;

module com.jwebmp.plugins.jqueryverticaltimeline {

	exports com.jwebmp.plugins.jqui.verticaltimeline;

	requires com.jwebmp.core;
	requires com.guicedee.logmaster;

	requires jakarta.validation;
	requires java.logging;
	requires com.guicedee.guicedinjection;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.jqui.verticaltimeline.JQUIVerticalTimelinePageConfigurator;

	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.jqui.verticaltimeline.implementations.JQueryVerticalTimelineExclusionsModule;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions with JQueryVerticalTimelineInclusionModule;
	
	opens com.jwebmp.plugins.jqui.verticaltimeline to com.fasterxml.jackson.databind, com.jwebmp.core;
}

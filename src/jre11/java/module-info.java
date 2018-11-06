import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;

module com.jwebmp.plugins.jqueryverticaltimeline {

	exports com.jwebmp.plugins.jqueryverticaltimeline;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;
	requires com.jwebmp.guicedinjection;

	provides IPageConfigurator with com.jwebmp.plugins.jqueryverticaltimeline.VerticalTimelinePageConfigurator;

	provides IGuiceScanJarExclusions with com.jwebmp.plugins.jqueryverticaltimeline.implementations.JQueryVerticalTimelineExclusionsModule;
	provides IGuiceScanModuleExclusions with com.jwebmp.plugins.jqueryverticaltimeline.implementations.JQueryVerticalTimelineExclusionsModule;

	opens com.jwebmp.plugins.jqueryverticaltimeline to com.fasterxml.jackson.databind, com.jwebmp.core;
}

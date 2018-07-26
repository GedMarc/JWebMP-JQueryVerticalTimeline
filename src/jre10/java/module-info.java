import com.jwebmp.core.services.IPageConfigurator;

module com.jwebmp.plugins.jqueryverticaltimeline{

	exports com.jwebmp.plugins.jqueryverticaltimeline;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;

	provides IPageConfigurator with com.jwebmp.plugins.jqueryverticaltimeline.VerticalTimelinePageConfigurator;
	opens com.jwebmp.plugins.jqueryverticaltimeline to com.fasterxml.jackson.databind,com.jwebmp.core;
}

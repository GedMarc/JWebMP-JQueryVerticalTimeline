package com.jwebmp.plugins.jqui.verticaltimeline.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions;

import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class JQueryVerticalTimelineExclusionsModule
		implements IGuiceScanModuleExclusions<JQueryVerticalTimelineExclusionsModule>
{
	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.jqueryverticaltimeline");
		return strings;
	}
}

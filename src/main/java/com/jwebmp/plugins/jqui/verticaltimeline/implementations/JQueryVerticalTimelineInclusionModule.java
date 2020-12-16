package com.jwebmp.plugins.jqui.verticaltimeline.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions;
import jakarta.validation.constraints.NotNull;

import java.util.HashSet;
import java.util.Set;

public class JQueryVerticalTimelineInclusionModule implements IGuiceScanModuleInclusions<JQueryVerticalTimelineInclusionModule>
{
	@Override
	public @NotNull Set<String> includeModules()
	{
		Set<String> set = new HashSet<>();
		set.add("com.jwebmp.plugins.jqueryverticaltimeline");
		return set;
	}
}

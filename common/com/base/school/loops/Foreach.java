package com.base.school.loops;

public class Foreach {
	public static final String process(String[] values)
	{
		String combined = "";
		for (String val : values)
		{
			combined += "(" + val + ") ";
		}
		return combined;
	}
}

package com.base.school.stringbuffer;

public class StringBuff {
	public static final String process(String[] values)
	{
		StringBuffer sb = new StringBuffer();
		
		for(String s : values)
		{
			sb.append("(" + s + ") ");
		}
		
		return sb.toString();
	}
	public static final String process(char[] values)
	{
		StringBuffer sb = new StringBuffer();
		
		for(char c : values)
		{
			sb.append("(" + c + ") ");
		}
		
		return sb.toString();
	}
}

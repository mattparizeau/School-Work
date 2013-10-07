package com.base.school.stringbuffer;

import java.util.StringTokenizer;

public class StringToken {
	public static final String process(String value) {
		StringTokenizer st = new StringTokenizer(value, " ,", false);
		StringBuffer sb = new StringBuffer();
		do {
			sb.append("(" + st.nextToken() + ") ");
		} while(st.hasMoreTokens());
		return sb.toString();
	}
}

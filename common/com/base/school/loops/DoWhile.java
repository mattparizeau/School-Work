package com.base.school.loops;

public class DoWhile {
	public static final String process(String[] values) {
		int i = 0;
		String res = "";
		if (i < values.length) {
			do {
				res += "(" + values[i] + ") ";
				i++;
			} while (i < values.length);
		}
		return res;
	}
}

package com.base.school;

import com.base.school.loops.DoWhile;
import com.base.school.loops.Foreach;
import com.base.school.stringbuffer.StringBuff;
import com.base.school.stringbuffer.StringToken;

public class Main {
	
	private static Main instance;
	
	public Main()
	{
		init();
	}
	
	public void init()
	{
		doForeach();
		doDoWhile();
		doStringBuffer();
		doStringTokenizer();
	}
	
	public void doForeach()
	{
		String res = Foreach.process(new String[]{"Test", "Pizza", "Bananna"});
		print(res);
	}
	
	public void doDoWhile()
	{
		String res = DoWhile.process(new String[]{"Cool", "Stuff", "Awesome"});
		print(res);
	}
	
	public void doStringBuffer()
	{
		String res = StringBuff.process(new String[]{"Matthieu", "Cool", "Guy"});
		print(res);
		res = StringBuff.process(new char[]{'t','e','s','t'});
		print(res);
	}
	
	public void doStringTokenizer()
	{
		String res = StringToken.process("Hello,I'm a,pizza ok?");
		print(res);
	}
	
	private void print(String msg)
	{
		System.out.println(msg);
	}
	
	public static Main getInstance()
	{
		return Main.instance;
	}
	
	public static final void main(String[] args)
	{
		Main.instance = new Main();
	}
}

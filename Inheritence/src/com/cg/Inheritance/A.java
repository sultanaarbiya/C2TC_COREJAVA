package com.cg.Inheritance;

public class C
{
	void message()
	{
		System.out.println("class A");
	}
}

class B
{
	void message()
	{
		System.out.println("class B");
	}
	class A extends  B ,C
	public static void main(String[] args) 
	{
		A obj=new A();
		obj.message();
	}
	
	}
package com.cg.This;

public class Demo {
	void m()
	{
		System.out.println(this);
		
	}
	public static void main(String arguments[])
	{
		Demo obj=new Demo();
		System.out.println(obj);
		obj.m();
	}

}

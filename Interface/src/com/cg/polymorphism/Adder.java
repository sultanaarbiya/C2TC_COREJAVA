package com.cg.polymorphism;

public class Adder {
	static int add(int a,int b)
	{
		return a+b;
		
	}
	static int add(int a,int b,int c)
	{
		return a+b;
	}
}
class Testoverloading2{
	
	public static void main(String[] args) {
		System.out.println(Adder.add(11,11));
		System.out.println(Adder.add(12,13,14));
		
	}
}
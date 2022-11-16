package com.cg.instanceoperator;

public class Animal {

void eat()
{
	System.out.println("eating");
}
}
class Dog1 extends Animal
{
	void eat()
	{
		System.out.println("eating");
	}
	void bark()
	{
		System.out.println("barking");
	}
	void work()
	{
		super.eat();
		bark();
	}
}
	public static void main(String[] args) {
		{
			Dog1 d=new Dog1();
			System.out.println(d instanceof Animal);
		}
	}

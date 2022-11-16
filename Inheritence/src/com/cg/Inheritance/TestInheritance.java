package com.cg.Inheritance;
class Animal{
	void eat()
	{
		System.out.println("eating...");
		}

	}
	class Dog extends Animal{
		void bark()
		{
			System.out.println("barking...");
		}
	}
	class cat extends Animal{   // multiple inheritance
		void meow()
		{
			System.out.println("meowing");
	}
}
public class TestInheritance {
	public static void main(String args[])
	{
		cat c=new cat();
		c.meow();
		c.eat();
	}

}

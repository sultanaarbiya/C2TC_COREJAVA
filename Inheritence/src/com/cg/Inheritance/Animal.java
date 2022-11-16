package com.cg.Inheritance;

class Animal {    // single inheritance
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
class babyDog  extends Dog{   // multiple inheritance
	void weep()
	{
		System.out.println("weeping");
	}
}
class Demo
{
	public static void main(String args[])
	{
		/*Dog d=new Dog();
		d.bark();
		d.eat();*/
		babyDog b=new babyDog();
		b.bark();
		b.eat();
		b.weep();
	}
}
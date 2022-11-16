package com.cg.superkeyword;

class  Animal{
	String color="Black";
}
class Dog extends Animal{
	String color="white";
	void display()
	{
		System.out.println("Inside diplay method"+ super.color);
	}
}
public class Variable{

	public static void main(String[] args) {
       Dog d=new Dog();
       System.out.println("Inside main method"+ d.color);
       d.display();

	}

}

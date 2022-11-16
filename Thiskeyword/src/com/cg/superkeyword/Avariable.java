package com.cg.superkeyword;
class vehicle{
	 vehicle()
	 {
		 System.out.println("vehicle  constructor is called");	 }
}
class yamaha extends vehicle{
	 String color="White";
	 yamaha(){
		 System.out.println("yamaha constructor is called");	 }
	 }

public class Avariable{
	public static void main(String[] args) {
		yamaha h=new yamaha();
	}
}

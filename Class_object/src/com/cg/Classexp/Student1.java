package com.cg.Classexp;

public class Student1 {
	int rollno;
	String name;
void insertRecord(int r, String n)
{
	rollno=r;
	name=n;
}
void displayInformation()
{
	System.out.println(rollno+""+name);
}
}

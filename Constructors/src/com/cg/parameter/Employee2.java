package com.cg.parameter;

 class Employee2 {
	 int id;
	 String name;
	 float Salary;
	 Employee2(int id, String name, float Salary){
		 System.out.println("user defined no-argument" + " Constructor executed");
	 }
	 void display() {
		 System.out.println(id+ ""+ name +"" + Salary);
	 }

}

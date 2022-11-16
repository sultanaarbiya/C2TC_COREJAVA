package com.cg.Inheritence;
interface Dad{
	void snoring();
}
interface Mom{
void snoring();

}
class you implements Dad,Mom{
	public void snoring() {
		System.out.println("yes , I do have the habit of snoring");
	}
}
public class MultipleInheritence {

	public static void main(String[] args) {
		you Y=new you();
		Y.snoring();

	}

}

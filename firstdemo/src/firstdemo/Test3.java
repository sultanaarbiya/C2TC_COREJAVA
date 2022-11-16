package firstdemo;
class A{
	private void printNmae() {
		System.out.println("Value-A");
	}
}
class B extends A{
	private void printNmae() {
		System.out.println("Nmae-B");
	
}
public class Test3 {

	public static void main(String[] args) {
		B b=new B();
		b.printName();
	}
}
}

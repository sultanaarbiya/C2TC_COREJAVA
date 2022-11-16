package firstdemo;

public class Main1 {

	public static void main(String[] args) {
try {
	throw 10;
    }
catch(int e) {
	System.out.println("Got the exception" +e);
}
	}

}

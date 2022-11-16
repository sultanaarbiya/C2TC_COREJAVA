package firstprogram;

public class Arithmetic {

	public static void main(String[] args) {
		int a=5,b=8;
		int y=a+b;
		switch(y)
		{
			case 0:y=a+b;
			System.out.println(a+b);
			break;
			case 1:y=a-b;
			System.out.println(a-b);
			break;
			case 2:y=a*b;
			System.out.println(a*b);
			break;
			case 3:y=a/b;
			System.out.println(a/b);
			break;
			default:System.out.println("invalid operator");
		}
		
	}

}

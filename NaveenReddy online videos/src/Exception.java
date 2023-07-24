
public class Exception {
public static void main(String args[]) {
	int a,b,c;
	try {
		a=10;
		b=0;
		c=a/b;
		System.out.println("This line will not be executed");
	}
	catch(ArithmeticException e) {
		
		
		{
			System.out.println("Divided by zero");
		}
		{
			System.out.println("After exception is handled");
		}
		
	}
	
}
}

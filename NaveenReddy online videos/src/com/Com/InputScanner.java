package com.Com;
import java.util.Scanner;
public class InputScanner {
	private static Scanner sc;

	public static void main(String args[]) {
	
	sc = new Scanner(System.in);
	
	int x = sc.nextInt();
	String str=sc.nextLine();
	
    System.out.println(x*7);
    System.out.println(str);

}
}
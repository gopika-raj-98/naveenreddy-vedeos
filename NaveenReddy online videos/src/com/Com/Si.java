package com.Com;

import java.util.Scanner;
public class Si {

	private static Scanner sc;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		int p = sc.nextInt();
		int n = sc.nextInt();
		int r = sc.nextInt();
		
		int si =(p*n*r)/100;
		
		System.out.println("Simple Interest = " + si);

	}

}

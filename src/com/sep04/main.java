package com.sep04;

public class main {
	public static void main (String[]args) {
		
		System.err.println(8/2);
		System.out.println(7/6);
		
		try {
			
		
		System.out.println(7/0);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
			System.out.println("Infinty");
		}
		System.out.println(7/4);
		System.out.println( 7/8);
	}

}

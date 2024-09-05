package com.sep05;

public class Main {
	
	public static void  main( String [] args) {
		Gpay u1 = new SBI();
		try {
			
		u1.Paynow(600);
	}catch  (ArithmeticException e) {
		System.out.println(e);
	}
	
	}

}

package com.codegnan.fundementals;
import java.util .Scanner;
public class IncomeTax {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.print("Enter your Income");
		double income =scanner.nextDouble();
		
		double tax=(income<300000)?income*0.05
			:(income<=1000000)?income*0.10
			 			:income*0.15;
					tax=(income>2000000)?tax*0.99:tax;
					System.out.println("toatal tax to pay:"+tax);
					
					

	}

}

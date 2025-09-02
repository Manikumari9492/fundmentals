package com.codegnan.fundementals;
import java.util .Scanner;
public class AtmExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double accountBalance =50000.0;
		System.out.println("Enter withdrawl Amount :");
		double withdrawAmount =scanner.nextDouble();
		if (withdrawAmount <= accountBalance) {
			accountBalance-=withdrawAmount;
			System.out.println("Withdarawn succesfully :"+withdrawAmount+
					 "remaining account balance balance : "+accountBalance);
			
		}else {
			System.out.println("insufficient funds");
		}
		scanner.close();
		
		

	}

}

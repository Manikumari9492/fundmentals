package com.codegnan.controlstatements;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner scanner =new Scanner (System.in);
		System.out.println("Enter the Number :"); 
		int number =scanner.nextInt();
		if(number<0) {
			number=-number;
		}
		int orignalnumber= number;
		int reversedNumber =0;
		while (number!=0) {
			int reminder=number%10;
			reversedNumber = reversedNumber*10+reminder;
			number/=10;
			
		}
		System.out.println("Reverse of a number :"+ orignalnumber +"is"+ reversedNumber);
		
	}

}

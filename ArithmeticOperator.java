package com.codegnan.fundementals;

import java.util.Scanner;

public class ArithmeticOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your age");		
        int age=scanner.nextInt();
        String result =age>=18?"eligible to vote":"not eligible to vote";
        System.out.println("result");	
	}

}

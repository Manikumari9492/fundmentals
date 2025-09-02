package com.codegnan.fundementals;

import java.util.Scanner;

public class OddorEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Scanner scanner=new Scanner(System.in);
       System.out.println("Enter number");		
        int num=scanner.nextInt();
		// ternary operator
		
		String result =num%2==0?"Odd":"Even";
		System.out.println(result);
		
		
		System.out.println("Enter a year");
		int year=scanner.nextInt();
		boolean isLeapYear=(year%4==0)&&(year%100!=0|| year%400==0);
		String yearIs=isLeapYear?"is leap year":"not aleap year";
		System.out.println(yearIs);

	  System.out.println("Enter number:");		
       int number=scanner.nextInt();
       
       if(number >0) {
    	  System.out.println(number +"is a positive number.");
       }else if(number <0) {
    	   System.out.println(number +"is a negative number.");
       }else {
    	   System.out.println("The number is zero.");
       }
	    
	  System.out.println("Enter student's marks(out of 100):");		
       int marks=scanner.nextInt();
       
       if (marks >= 40) {
    	   System.out.println("Student has passed.");
       }else {
    	   System.out.println("Student has failed."); 
	   
	   
       
       }
	}
}
    	   
    	    
    	   
    	   
    	  
    	    
    	   
    	   
    	   
    	   
    	    
    	 
    	 
	



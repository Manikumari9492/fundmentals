package com.codegnan.fundementals;

import java.util.Scanner;
public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter marks");
		int marks=scanner.nextInt();
		String grade=(marks>=90)?"O":(marks>=80)?"s":(marks>=70)?"a":(marks>=60)?"b":(marks>=50)?"c":(marks>=40)?"d":"fail";
		System.out.println("student Grade according to marks"+grade);
		scanner.close();
	}

}

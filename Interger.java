package com.codegnan.mani;
import java.util.Scanner;
public class Interger {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		System.out.println("Binary number:"+Integer.toBinaryString(num));

	}

}

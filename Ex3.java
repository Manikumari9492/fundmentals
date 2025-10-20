package com.codegnan.mani;
import java.util.Scanner;
public class Ex3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if( n%2==0 && n%5==0 && n%10==0)
		{
			System.out.println("yes");
			
		}else {
			System.out.println("No");
		}
		

	}
 
}

package com.codegnan.fundementals;
import java.util.Scanner; 
public class AreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Radius");
		int radius=scanner.nextInt();
		double area =3.14*radius*radius;
		System.out.println("area of circleis :"+area);
		scanner.close();
	}

};

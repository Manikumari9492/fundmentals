package com.codegnan.fundementals;
import java.util .Scanner;
public class TaxiFare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		System.out.print("Enter total distance traveled(in km):");
		double distance =scanner.nextDouble();
		double fare =0;
		if (distance <=2) {
			fare=50;	
		}else if(distance <=10) {
			fare =50+(distance-2)*15;
		}else {
			fare = 50+(8*15)+(distance -10)*10;
		}
		if (distance > 20) {
			fare*=0.95;
		}
		System.out.printf("Total fare : ₹%.2f\n ",fare);
		scanner.close();
	}

}

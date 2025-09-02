package com.codegnan.fundementals;

import java.util.Scanner;

public class DiscountCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the purchase Amount:");
		double purchaseAmount =scanner.nextDouble();
		double discount =(purchaseAmount >= 100)?0.2:(purchaseAmount>=50)?0.1:0.0;
		double discountAmount= purchaseAmount*discount;
		double remainingAmount=purchaseAmount -discountAmount;
		double percentDiscount=discount*100;
		System.out.println("Amount after applying "+ percentDiscount+"%discount:"+remainingAmount);
		System.out.println("discount Applied"+discountAmount);
		scanner.close();
	}

}

package com.codegnan.patternexamples;


public class butterfly_pattern {

	public static void main(String[] args) {
		int rows=5;
		//part 1 upper part of butterfly pattern(Expanding wings)
		for(int i=1; i<=rows; i++) {
			//inner loop1: print stars for the left wings
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			//inner loop2:print spaces in the middle gap.
			int spaces=2*(rows-i);
			for(int j=1; j<=spaces;j++) {
				System.out.print("  ");
			}
			//inner loop3:print the stars for the right wing.
			for(int j=1;j<=i;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		//part2: lower part of butterfly.
		for(int i=rows;i>=1;i--) {
		//inner for loop 1:print stars for the left wing
		for(int j=1;j<=i;j++) {
			System.out.print("* ");
		}
      //		inner loop2 :for spaces
		int spaces=2*(rows-i);
		for(int j=1;j<=spaces;j++) {
			System.out.print("  ");
		}
		for (int j=1;j<=i;j++) {
			System.out.print(" *");
		}
		System.out.println();
	}
	}
}

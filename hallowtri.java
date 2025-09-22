package com.codegnan.mani;

public class hallowtri {

	public static void main(String[] args) {
		int i;
		int j;
		int n=5;
		for (i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				if(i==1||i==n||
						j==1||j==i) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
					
			}System.out.println();
		}

	}

}

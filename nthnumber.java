package praticeSession;

import java.util.Scanner;

public class nthnumber {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter n value : ");
	        int n = sc.nextInt();

	        int count1 = 0;
	        int num = 2;

	        while (count1 != n) {
	            int count2 = 0;

	            for (int i = 2; i <= num/2; i++) {
	                if (num % i == 0) {
	                    count2++;
	                    break;
	                }
	            }

	            if (count2 == 0) {
	                count1++;
	            }

	            num++;
	        }

	        System.out.println(n + " th Prime number is : " + (num - 1));
	    }
	}
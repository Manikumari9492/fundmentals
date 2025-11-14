package praticeSession;

import java.util.Scanner;

public class Panagram {

	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a String");
			String str=sc.next();
			str.toLowerCase();
			int[] arr=new int[129];
			for(int i=0;i<str.length();i++) {
				int position=str.charAt(i);
				arr[position]++;
			}
			for(int i=97;i<122;i++) {
				if(arr[i]==0) {
					System.out.println("Not a Panagram");
					return;
				}
			}
			System.out.println("Is a panagram");
		}
	}

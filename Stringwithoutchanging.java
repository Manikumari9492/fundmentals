package praticeSession;

import java.util.Scanner;

public class Stringwithoutchanging {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your string : ");
		String str=sc.nextLine();
		String[] words = str.split(" ");
		StringBuilder result=new StringBuilder();
		for(int i=0;i<words.length;i++) {
			StringBuilder sb = new StringBuilder(words[i]);
			sb.reverse();
			result.append(sb).append(" ");
		}
		System.out.println("Reversed words: " + result.toString().trim());

	}

}
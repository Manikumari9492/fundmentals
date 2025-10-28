package com.codegnan.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class StringSorter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String>strings=new ArrayList<>();
		while(true) {
			String word=sc.next();
			if(!word.matches("[a-z A-Z]+")){
				break;
				
			}
			strings.add(word);
		}
		Collections.sort(strings);
		for(String word:strings) {
			System.out.print(word+" ");
		}
		

	}

}

package com.codegnan.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class DuplicateRemover {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer>numbers=new ArrayList<>();
		while(sc.hasNextInt()) {
			numbers.add(sc.nextInt());
			
		}
		for(int a:numbers) {
			System.out.print(a+" ");
		}
		System.out.println();
		ArrayList<Integer> uniqueList =new ArrayList<>();
		for(Integer i:numbers) {
			if(!uniqueList.contains(i));
			uniqueList.add(i);
		}
	
	for(Integer j: uniqueList) {
		System.out.println(j+" ");
	}
}
}
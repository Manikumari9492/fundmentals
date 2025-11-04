package com.codegnan.utilStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FilterNumber {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter no.of elements of n ");
		int n=sc.nextInt();
		
		System.out.println("Enter no.of elements of k");
		int k=sc.nextInt();
		
		List<Integer>numbers=new ArrayList();
		System.out.println("Enter"+n+ "numbers");
		for(int i=0;i<n;i++) {
			numbers.add(sc.nextInt());
		}
		List<Integer>filtered =numbers.stream().filter(num->num>k)
				.collect(Collectors.toList());
		System.out.println("Numbers greater than "+k+":"+filtered);
		
	}
	
	

}

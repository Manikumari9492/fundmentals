package com.codegnan.utilStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class program2 {

	public static void main(String[] args) {
		
			Scanner sc=new Scanner(System.in);
			List<Integer> numbers=new ArrayList<>();
			int n=sc.nextInt();
			for(int i=0;i<n;i++) {
				numbers.add(sc.nextInt());
			}
			List<Integer> squares=numbers.stream().map(i->i*i).collect(Collectors.toList());
			System.out.println(squares);

		}

	

	}



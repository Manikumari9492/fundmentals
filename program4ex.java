package com.codegnan.utilStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.codegnan.collections.Student;

public class program4ex {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		double threshold=sc.nextDouble();
		sc.nextLine();
		
		List<Student> students =new ArrayList<>();
		for(int i=0;i<n;i++) {
			System.out.println("Enter detail for student"+(i +1)+":");
			System.out.print("ID:");
			int id =sc.nextInt();
			sc.nextLine();
			System.out.print("Name");
			String name=sc.nextLine();
			
			System.out.println("Grade");
			double grade=sc.nextDouble();
			sc.nextLine();
			students.add(new Student(id,name,grade));
			
		}
		
	}

}

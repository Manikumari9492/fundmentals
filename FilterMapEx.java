package com.codegnan.utilStreams;

import java.util.Arrays;
import java.util.List;

public class FilterMapEx {

	public static void main(String[] args) {
		List<Integer>numbers=Arrays.asList(10,25,30,45,50,75,100,22,37);
		List<String>names=Arrays.asList("mani","govardhan","viha","harshi","nithin","Chitti");
		//filter
		//1.mumber greater than 40,
		//2.names starting with a,
		//3.print names name length greater than 4.
		//4.number divisible by 5.
		//map
		//1.multiple each number by 2.
		//2.convert all the names in uppercase.
		//3.find the length of each name.
		//4.print weclome message.
		 System.out.println("Numbers greater than 40:");
	        numbers.stream().filter(n -> n > 40).forEach(System.out::println);
	        
	        System.out.println("\nNames starting with 'a':");
	        names.stream().filter(name -> name.startsWith("m")).forEach(System.out::println);
	        
	        System.out.println("\nNames with length greater than 4:");
	        names.stream().filter(name -> name.length() > 4).forEach(System.out::println);
	        
	        System.out.println("\nNumbers divisible by 5:");
	        numbers.stream().filter(n -> n % 5 == 0)  .forEach(System.out::println);
	        
	        
	        System.out.println("Multiply each  number by 2");
	        numbers.stream().map(i->i*2).forEach(System.out::println);
	        
	        System.out.println("names in upper case");
	        names.stream().map(name->name.toUpperCase()).forEach(System.out::println);
	        
	        System.out.println("each string length");
	        names.stream().map(name->name+ ":" +name.length()).forEach(System.out::println);
	        System.out.println("welcome message");
	        names.stream().map(name->"Hello  "+name+"!").forEach (System.out::println);      
	}

}

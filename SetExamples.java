package com.codegnan.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExamples {

	public static void main(String[] args) {
		TreeSet<String> names =new TreeSet<String>();
		names.add("mani");
		names.add("harshi");
		names.add("subba");
		names.add("radha");
		names.add("Chinna");
		System.out.println(names);
		
		
		TreeSet<String> t=new TreeSet<String>(new MyComparator());
		t.add("mani");
		t.add("chinna");
		t.add("sonu");
		t.add("subba");
		System.out.println(t);

	}

}

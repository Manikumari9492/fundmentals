package com.codegnan.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionMethodsDemo {

	public static void main(String[] args) {
		Collection <String>fruits= new ArrayList<String>();
		System.out.println("------------add()-----------");
		fruits.add("banana");
		fruits.add("apple");
		fruits.add("cherry");
		System.out.println("Fruits after add() :"+fruits);
		
		System.out.println("-----------addAll()--------");
		Collection<String>moreFruits=new ArrayList<String>();
		moreFruits.add("mango");
		moreFruits.add("grape");
		
		fruits.addAll(moreFruits);
		System.out.println("fruits after addAll():"+fruits);
		
		System.out.println("----------remove()-------");
		fruits.remove("banana");
		System.out.println("fruits after remove(banana):"+fruits);
		 
		System.out.println("---removeAll------");
		Collection<String>removeList=new ArrayList<String>();
		removeList.add("mango");
		removeList.add("cherry");
		fruits.removeAll(removeList);
		System.out.println("Fruits after remove all(mango,cherry):"+fruits);
		System.out.println("-----retainAll()----");
		Collection<String> retainList=new ArrayList<String>();
		retainList.add("apple");
		retainList.add("grape");
		fruits.retainAll(retainList);
		System.out.println("Fruits after all:"+fruits);
		System.out.println("---contains---");
		System.out.println("contains apple?"+fruits.contains("apple"));
		System.out.println("contains banana?"+fruits.contains("banana"));
		
		Collection<String>checkList= new ArrayList<String>();
		checkList.add("apple");
		checkList.add("grape");
		System.out.println("contains all(apple,grape)?"+fruits.containsAll(checkList));
		System.out.println("---size---");
		System.out.println("Number of fruits:"+fruits.size());
		
		System.out.println("-----isEmpty()----");
		System.out.println("is Collection empty?"+ fruits.isEmpty());
		System.out.println("------------toArray()---------");
		
		 Object[] fruitarray=fruits.toArray();
	        System.out.println("Fruits as Array ");
	        for(int i=0;i<fruitarray.length;i++) {
	        	System.out.println("FruitArray[] : "+i);
	        }
	        
	        System.out.println("----------iterator()-------------");
	        Iterator<String> itr=fruits.iterator();
	        while(itr.hasNext()) {
	        	System.out.println(itr.next()+" ");
	        }
	        
	        System.out.println("-----clear()-----------");
	        fruits.clear();
	        System.out.println("Fruits after clear ? "+fruits);
	        System.out.println("Is collection empty after clear : "+fruits.isEmpty());
	}

}

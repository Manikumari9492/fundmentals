package com.codegnan.oop;

public class overload {

	public static void main(String[] args) {
      overloadDemo o1=new overloadDemo();
      o1.test();
      o1.test(10);
      o1.test(20,30);
      System.out.println(o1.test(12.5));

	}

}

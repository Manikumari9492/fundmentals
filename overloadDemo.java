package com.codegnan.oop;

public class overloadDemo {

	public void test() {
		System.out.println("no parameters");
		
	}
	public void test(int a) {
		System.out.println("a:"+a);
	}
	public void test(int a,int b) {
		System.out.println("A and B is :"+a+":"+b);
	}
	public double  test(double a) {
		System.out.println("Double a:"+a);
		return a*a;
	}
	

}

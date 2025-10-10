package com.codegnan.mani;

public class ComplexNumber {

	
		double real;
		double imag;
		
		ComplexNumber(double r,double i){
			real=r;
			imag=i;
			
		}
		ComplexNumber add(ComplexNumber c) {
			return new ComplexNumber(this.real+c.real,this.imag+c.imag);
		}
			void display() {
				System.out.println(real+imag+"i");
			}
				public static void main(String[] args) {
					ComplexNumber c1=new ComplexNumber(3.5,2.5);
					ComplexNumber c2=new ComplexNumber(1.5,4.5);
					ComplexNumber sum=c1.add(c2);
					System.out.println("sum of the two numbers=");
					sum.display();
					
				}
			}
		
		



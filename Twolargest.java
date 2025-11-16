package praticeSession;

import java.util.Scanner;

public class Twolargest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a first num");
		int num1=sc.nextInt();
		System.out.println("Enter a second num");
		int num2=sc.nextInt();
		
		if(num1>num2) {
			System.out.println(num1 +"is a largest");
			
		}else if(num2>num1) {
			System.out.println(num2 +"is a largest");
		}else {
			System.out.println("both or eqaul");
		}
		
	}

}

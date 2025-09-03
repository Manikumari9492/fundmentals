package com.codegnan.controlstatements;
import java.util.Scanner;
public class WelcomeMessage {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter City name");
		String city =scanner.next();
		if(city.equalsIgnoreCase("Hyderabad")) {
			System.out.println("Hello Hyderabadi....adaab");
		}else {
			if(city.equalsIgnoreCase("Banglore")) {
				System.out.println("Hello kannadiga....namaskara");
			}else {
				if(city.equalsIgnoreCase("chennai")) {
					System.out.println("hello madasii...vannkam");
				}else {
					System.out.println("Enter valid city name");
				}
			}
		}
	}

}

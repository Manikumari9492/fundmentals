package praticeSession;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeInRange {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Integer> prime=new ArrayList<>();
		System.out.println("Enter the Range : ");
		int n=sc.nextInt();
		int count=0;
		for(int i = 2; i <= n; i++) {    
		    for(int j = 2; j <= i/2; j++) {   
		        if(i % j == 0) {
		            count++;
		            break;   
		        }
		    }
		    if(count == 0) {
		        prime.add(i);
		    }
		    count = 0;
		}

		System.out.println(prime);
		
	}

}
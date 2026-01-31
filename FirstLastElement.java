package Core___Java;

import java.util.Scanner;

public class FirstLastElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter a num");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++) {
		 arr[i]=sc.nextInt();
	
	}
	if(n>0) {
		System.out.println("First element:"+arr[0]);
		System.out.println("Second element:"+arr[n-1]);
	}else {
		System.out.println("Array is Empty");
	}

}
}
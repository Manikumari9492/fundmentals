package praticeSession;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		        Scanner sc=new Scanner(System.in);
				System.out.println("Enter the array size : ");
				int size=sc.nextInt();
				int count=0;
				int index=0;
				int[] arr=new int[size];
				System.out.println("Enter the array elements : ");
				for(int i=0;i<size;i++) {
					arr[i]=sc.nextInt();
				}
				System.out.println("Enter the element to search : ");
				int element=sc.nextInt();
				for(int i=0;i<size;i++) {
					if(arr[i]==element) {
						count++;
						index=i;
						break;
					}
				}
				if(count>0) {
	 				System.out.println("Element is found at index : "+index);
				}else {
					System.out.println("Element is not found");
				}

			}

		}

	



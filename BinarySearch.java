package praticeSession;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter the array size : ");
		        int size = sc.nextInt();
		        int[] arr = new int[size];
		        int mid = 0;

		        System.out.println("Enter the elements of the array : ");
		        for(int i = 0; i < size; i++) {
		            arr[i] = sc.nextInt();
		        }

		        System.out.println("Enter the element to search : ");
		        int element = sc.nextInt();

		        int start = 0;
		        int end = size - 1;
		        boolean found = false;

		        while(start <= end) {

		            mid = (start + end) / 2;

		            if(arr[mid] == element) {   
		                System.out.println("Element found at index: " + mid);
		                found = true;
		                break;
		            }
		            else if(arr[mid] < element) {  
		                start = mid + 1;  
		            }
		            else {      
		                end = mid - 1;
		            }
		        }

		        if(!found) {
		            System.out.println("Element not found");
		        }
		    }
		}

	



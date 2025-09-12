package arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {31,5,7,45,60,4};
		System.out.println("Before Sorting");
		printArray(arr);
		
		bubbleSort(arr);
		System.out.println("After Sorting");
		printArray(arr);
	}
	public static void bubbleSort(int[] arr) {
		int n=arr.length;
		//outer loop for num of passes
		//after each pass, largest element moves to its correct postion.
		for(int i=0;i<=n-1;i++) {
			//a flag check if any swapping heppens,
			//used for optimization(best case)
			boolean swapped =false;
			//inner loop for  comparisions in each pass
			//(n-i-1) becase  last i elements are already in correct position
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1] ) {
					int temp =arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					//since we swapped marked as true 
					swapped=true;
				}
			}
			//if no elements were swapped in the pass. array is already sorted
			if (!swapped) {
				break;//optimized, exit early
			}
		}
	}
	public static void printArray(int[]arr) {
		for(int num:arr) {
			System.out.println(num+" ");
		}
		System.out.println();
	}

}

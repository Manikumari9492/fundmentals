package arrays;

public class frquencyCounter {

	public static void main(String[] args) {
		int[]array= {1,2,3,2,1,4,3,5,1};
		System.out.println(array.length);
		boolean[]processed =new boolean[array.length];
		for(int i=0;i<array.length;i++) {
			if (processed[i]) {
				continue;
				
			}
			//initialize the count for the current element
			int count=1;
			//inner loop to compare the current element the rest of element
			for(int j=i+1;j<array.length;i++) {
				//if element at index j is equal to the element at index i
				if(array[j]==array[i]) {
					count++;//increment the count for that element
					processed[j]=true;//mark the element index to j
				}
			}
			System.out.println(array[i]+"Occurs"+count+"Times");
		}
		
	}

}

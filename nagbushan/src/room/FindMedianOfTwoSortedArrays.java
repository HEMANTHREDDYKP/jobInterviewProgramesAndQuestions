package room;

import java.util.Arrays;

public class FindMedianOfTwoSortedArrays {

	
	static int Solution(int[] arr) {
		
		int n=arr.length;
		
		//if the length of an array is even
		if(n%2==0) {
			int x=n/2;
			int y=arr[x];
			int z=arr[x-1];
			int ans=(x+y)/2;
			return ans; 
			
		}
		//if the length of an array is odd
		else {
			int z=Math.round(n/2);
			return arr[z];
		}
		
		
	}
	
	
	
	public static void main(String[] args) {

		int[] array1 = {1, 2, 3};
		int[] array2 = {4, 5, 6,7,8,9,10,11,12};
		int[] mergedArray = new int[array1.length + array2.length];

		System.arraycopy(array1, 0, mergedArray, 0, array1.length);
		System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);

		Arrays.sort(mergedArray);
		System.out.println(Solution(mergedArray));
	}

}

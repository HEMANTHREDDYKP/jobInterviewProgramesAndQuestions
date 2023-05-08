package room;

import java.util.Arrays;

public class FindMissingNumbers {

	public static void main(String[] args) {

		
		int[] a= {2,1,3,4,6};
		int n=6;
		int totalSum=(n*(n+1))/2;
		
		int sum=Arrays.stream(a).sum();
		
		System.out.println(totalSum-sum);
	}

}

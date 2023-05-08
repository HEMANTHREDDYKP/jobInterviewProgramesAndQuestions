package room;

import java.util.Arrays;

public class RemoveDuplicates {

	
	public static void main(String[] args) {
		
		int[] a= {1,2,1,3,5,2};
		
		Arrays.stream(a).distinct().forEach(System.out::println);
	}
	
	
	
	
	
	
}

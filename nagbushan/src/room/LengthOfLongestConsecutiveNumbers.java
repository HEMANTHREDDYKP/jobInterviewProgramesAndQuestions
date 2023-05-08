package room;

import java.util.Arrays;

public class LengthOfLongestConsecutiveNumbers {

	static int longestConsecutive(int[] a) {
		
		if(a.length==0) return 0;
		Arrays.sort(a);
		int longSequence =1;
		int currentSequence =1;
		
		for(int i=1;i<a.length;i++) {
			
			if(a[i]!=a[i-1]) {
				if(a[i]==a[i-1]+1) {
					currentSequence=currentSequence+1;
				}
				else {
					longSequence =Math.max(longSequence,currentSequence);
					currentSequence=1;
				}
			}
		}
		
		return Math.max(longSequence, currentSequence);
		
	}
	public static void main(String[] args) {

	System.out.println(longestConsecutive(new int[] {1,5,4,3}));
		
		
		
	}

}

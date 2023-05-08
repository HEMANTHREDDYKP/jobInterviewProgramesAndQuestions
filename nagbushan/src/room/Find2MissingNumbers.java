package room;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Find2MissingNumbers {

	
	public static void main(String[] args) {
		

		String input="abcdabvda";
		String output="";
		
		Map<Character, Integer> map=new HashMap<>();
		
		for(int start=0,end=0;end<input.length();end++) {
			
			Character currChar=input.charAt(end);
			
			if(map.containsKey(currChar)) {
				
				start=Integer.max(map.get(currChar)+1, start);
				
			}
			if(output.length()<=end-start) {
				
				output=input.substring(start,end+1);
			}
			map.put(currChar, end);
		}
		
		System.out.println(output);
		
		
		System.out.println("--------------------");
		
		String[] s=input.split("");
		Arrays.stream(s).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().forEach(x->System.out.println(x));
		
		
		System.out.println("-----------------------------------------");
		
		Map<String, Integer> col=new HashMap<>();
		
		col.put("a", 12);
		col.put("b", 42);
		col.put("r", 120);
		col.put("s", 92);
		col.put("c", 2);
		
		col.entrySet().stream().sorted(Entry.comparingByValue()).forEach(x->System.out.println(x.getKey()+" "+x.getValue()));
	
	
	}
}

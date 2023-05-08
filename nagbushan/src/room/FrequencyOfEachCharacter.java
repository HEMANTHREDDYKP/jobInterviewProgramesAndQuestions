package room;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachCharacter {

	public static void main(String[] args) {

		
		String s="hi hellhhbye";
		
		Arrays.stream(s.split("")).collect(Collectors
			.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
		.entrySet().forEach(x->System.out.println(x.getKey()+" "+x.getValue()));
		
		
	}

}

package hello;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;









public class Practice {
	// binary search
	static int binarySearch(int[] arr, int x) {

		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] == x) {
				return mid;
			} else if (x > arr[mid]) {
				return start = mid + 1;
			} else {
				return end = mid - 1;
			}
		}

		return -1;
	}

	// linear search
	static int linearSearch(int[] arr, int x) {

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == x) {
				return i;
			}
		}

		return -1;
	}

	// bubbleSort
	static int[] bubbleSort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {

				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}
		}

		return arr;
	}

	// selection sort
	static int[] selectionSort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {

			int min_ind = i;
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[min_ind] > arr[j]) {
					min_ind = j;
				}

			}
			int temp = arr[min_ind];
			arr[min_ind] = arr[i];
			arr[i] = temp;

		}

		return arr;
	}

	// length of longest substring without repeating characters
	static String longestSubstring(String s) {

		String output = "";
		Map<Character, Integer> map = new HashMap<>();
		for (int start = 0, end = 0; end < s.length(); end++) {

			Character currCharacter = s.charAt(end);
			if (map.containsKey(currCharacter)) {
				start = Integer.max(map.get(currCharacter) + 1, start);
			}
			if (output.length() <= end - start) {

				output = s.substring(start, end + 1);
			}
			map.put(currCharacter, end);
		}

		return output;
	}

	// frequency of each charecter, 1st repeated , last repeated
	static void frequencyOfEachCharacter(String input) {

		Arrays.stream(input.split(""))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().forEach(x -> System.out.println(x));
		;

	}

	// palindrome and reverse
	static void palindromeAndReverse(String input) {

		String output = "";
		for (int i = input.length() - 1; i >= 0; i--) {

			output = output + input.charAt(i);
		}

		if (output.equals(input)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not palindrome");
		}

	}

	//sort the hash map
	
	static void sortHashMap() {
		
		Map<String, Integer> map=new HashMap<>();
		map.put("A", 67);
		map.put("hello", 7);
		map.put("bye", 97);
		map.put("go", 37);
		
		map.entrySet().stream().sorted(Entry.comparingByValue()).forEach(System.out::println);
		
		
	}
	
	//internal working of hash map
	/*as soon as we add the key value pair in hash map
	 * hash code is generated based on key as the hashcode will be larger
	 * that hash code will be converted into index using index method
	 * i.e hashcode & numberOfBuckets(15) 
	 * from above formula we get index in that index the key and value will be stored
	 * */
	
	/*the initial capacity of hash map is 16
	 * the load factor is 75% 
	 * hash map is not thread safe or not synchronized
	 * it follows hashtable datastructure
	 * it is implemented using array and linked list
	 * it is the sub class of map interface
	 * it aallows null values in both key and values
	 * only one null is allowed in key
	 * 
	 * hashing means --> converting the object into value or integer
	 * **** hashcode will be generated based on key****
	 * collision --->
	 *     in hash map two types of collision will occur
	 *     1. same hashcode is generated for same typeof  key
	 *     i.e
	 *     key   ,value      hashcode 
	 *     "hi"  ,89------->   101
	 *     "hi"  ,567------>   101
	 *     *during this time the value will be replaced
	 *     
	 *     2. same hashcode is generated for different key 
	 *     i.e
	 *     key   ,value      hashcode 
	 *     "me"  ,59------->   33
	 *     "you" ,10------>   56
	 *      this time linked list will come into existence and data willbe stored 
	 *      in form of nodes
	 *      each node will contains the 
	 *      address of previous node
	 *      key
	 *      value
	 *      address of next node
	 * */ 
	
	
	//difference between hash map and hash table
	
	
	/*hash map
	 * it is the sub class of map interface
	 * not thread safe
	 * initial default capacity is 16
	 * null is allowed in both key and values
	 * only one null is allowed in key
	 * load factor is 75%
	 * */
	
	/*hash table
	 * it is the sub class of map interface
	 * it is thread safe
	 * initial default capacity is 11
	 * load factor is 75%
	 * null is not allowed in both key and value
	 * */
	
	
	//string object creation 
	
	String s1=new String("hi");//2 objects will be created one in heap and other in spring constant pool
	String s2="hi";//object will not be created because already hi object created in spring constant pool
	String s3=new String("hi");// as hi object is already present in scp object will be created only in heap area
	String s="hello";// object will be created in spc
	String s4=s3;// object will not be created 
	// so totally 4 objects will be created
	/*Note : String objects can be created in two different ways
	 * using new keyword
	 * without using new keyword
	 * 
	 * String objects created without using new keyword will be stored in spring constant pool which is present
	 * in heap area
	 * 
	 * String objects which are created using new keyword will be stored in both heap and spring constant pool
	 * 
	 * 
	 * ***Heap allows duplicates
	 *    String constant pool will not allow duplicates****
	 * 
	 * */
	
	
	//fibanacci  in recursion
	
	static int n1=0;
	static int n2=1;
	static int n3=0;
	static void fibanacci(int count) {
		
		if(count>0) {
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
			fibanacci(count-1);
		}
		
	}
	
	//factorial in recursion
	static int factorial(int num) {
		
		if(num>0) {
			return num*factorial(num-1);
		}
		else {
			return 1;
		}
	}
	
	
	//prime number
	static void prime(int input) {
		
		int count=0;
		for(int i=1;i<=input;i++) {
			if(input%i==0) {
				count++;
			}
		}
		
		if(count==2) {
			System.out.println("Prime");
		}
		else {
			System.out.println("not prime");
		}
	}
	
	
	
	//armstrong number
	static void armstrongNumber(int input) {
		
		//153---> 3 digits so rise each digit power to 3
		//i.e 1*1*1 + 5*5*5  + 3*3*3
		//12-->2 digits so rise each digit power to 2 and add them
		//i.e 1*1 + 2*2
		
		int total=0;
		int count =0;
		int n=input;
		while(n!=0) {
			count++;
			n=n/10;
		}
		
		n = input;
		while(n!=0) {
			int rem=n%10;
			total=(int) (total+Math.pow(rem, count));
			n=n/10;
		}
		
		if(total==input) {
			System.out.println("armstrong");
		}
		else {
			System.out.println("not armstrong");
		}
		
	}
	
	
	public static void main(String[] args) {

//		System.out.println(binarySearch(new int[] {1,27,30,4,50,6}, 27));
//		System.out.println(linearSearch(new int[] {1,2,7,30,4,50,6}, 50));
//		System.out.println(Arrays.toString(bubbleSort(new int[] {1,2,7,30,4,50,6})));
//		System.out.println(Arrays.toString(selectionSort(new int[] {1,2,7,30,4,50,6})));

//		System.out.println(longestSubstring("abcabcde"));

//		frequencyOfEachCharacter("hihellobye");

//		palindromeAndReverse("mam");

//		sortHashMap();
		
//		System.out.print(n1+" "+n2);
//		fibanacci(5);
		
//		System.out.println(factorial(4));
		
		
//		prime(1);
		
//		armstrongNumber(13);
		
	}

}

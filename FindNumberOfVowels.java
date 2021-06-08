package codingpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//find the number of vowles
//JAVA
//2
public class FindNumberOfVowels {
public static void main(String[] args) {
	String str="Preeti";
	findVowelsCount(str.toLowerCase());
}

private static void findVowelsCount(String str) {
	int count=0;
	//List<Character> aL=new ArrayList<>(Arrays.asList('a','e','i','o','u'));
	for(int i=0;i<str.length();i++) {
		//if(aL.contains(str.charAt(i))) {
			//another way
		//}
		if(str.charAt(i)=='a' || str.charAt(i)=='e' ||
				str.charAt(i)=='i' || str.charAt(i)=='o' ||
				str.charAt(i)=='u') {
			++count;
		}
	}
	System.out.println(count);
}
}

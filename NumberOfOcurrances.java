package codingpractice;

import java.util.LinkedHashMap;
import java.util.Map;

//Find the number of occurances of a character in a string
//Gun
//{G 1,u 1,n 1}
public class NumberOfOcurrances {

	public static void main(String[] args) {
		String str="GaneshA";
		findTheOccurances(str.toLowerCase());
	}

	private static void findTheOccurances(String str) {
		Map<Character,Integer> map=new LinkedHashMap<>();
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c, 1);
			}
		}
		System.out.println(map);
	}
}

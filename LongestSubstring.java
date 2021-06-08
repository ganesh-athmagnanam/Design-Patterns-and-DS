package codingpractice;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Consumer;

//find the longest substring in a given string
//Input ganeshathmagnanam
//output ganesh
interface FF {
	void findLongestSubstrings(String name);
}

public class LongestSubstring {
	public static void main(String[] args) {
		String name = "ganeshathmagnanam";
		findLongestSubstring(name);
		// method referrence
		findLongestSubstringUsingJava8(name);
	}

	private static void findLongestSubstringUsingJava8(String name) {
		Consumer<String> cons = LongestSubstring::findLongestSubstring;
		cons.accept(name);
	}

	public static void findLongestSubstring(String name) {
		Set<Character> set = new LinkedHashSet<>();
		String sb = "";
		String output = "";
		for (int i = 0; i < name.length(); i++) {
			char c = name.charAt(i);
			if (set.contains(c)) {
				sb = "";
				set.clear();
			} else {
				set.add(c);
				sb += c;
			}
			if (sb.length() > output.length())
				output = sb;
		}
		System.out.println(output);
	}
}

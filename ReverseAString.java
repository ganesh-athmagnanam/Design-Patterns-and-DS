package codingpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//reverse the given string
//hello
//olleh
public class ReverseAString {
	public static void main(String[] args) {
		String str = "Hello";
		reverse(str);
		reverseJava8(str);
		reverseRecursive(str);
	}

	private static void reverseRecursive(String str) {
		if ((str == null) || (str.length() <= 1))
			System.out.println(str);
		else {
			System.out.print(str.charAt(str.length() - 1));
			reverseRecursive(str.substring(0, str.length() - 1));
		}
	}

	private static void reverse(String str) {
		int n = str.length() - 1;
		StringBuffer output = new StringBuffer();
		for (int i = n; i >= 0; i--) {
			output.append(str.charAt(i));
		}
		System.out.println(output);
	}

	private static void reverseJava8(String str) {
		List<Character> output = new ArrayList<>();
		output = str.chars()
				.mapToObj(var -> (char) var).collect(Collectors.toList());
		Collections.reverse(output);
		System.out.println(Arrays.toString(output.toArray()));
	}
}

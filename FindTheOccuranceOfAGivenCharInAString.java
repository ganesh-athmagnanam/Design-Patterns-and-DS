package codingpractice;

//find the occurances of a given string in a str
//in:JAVA
//in:A
//out:2
public class FindTheOccuranceOfAGivenCharInAString {
public static void main(String[] args) {
	String one="JAVA";
	String two="A";
	String temp=one.replace("A", "");
	System.out.println(one.length()-temp.length());
}
}

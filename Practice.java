package codingpractice;

import java.util.Arrays;
import java.util.List;
class User{
	String name;
	int age;
	User(String name,int age){
		this.name=name;
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
public class Practice {
public static void main(String[] args) {
	List<Integer> list2 = Arrays.asList(2, 3, 4);
	
	// Here result will be 2*2 + 2*3 + 2*4 that is 18. 
	int res = list2.parallelStream().reduce(1, (s1, s2) -> s1 * s2);
	//1*2  + 2*3 +6*4
	//ExecutorService x=Executors.newFixedThreadPool(3);
	
	String[] myArray = { "this", "is", "a", "sentence" };
	String result = Arrays.stream(myArray)
	                .reduce(" ", (a,b) -> a + b);
	System.out.println(Arrays.asList(myArray));
	System.out.println(result);
	List<User> users = Arrays.asList(new User("John", 30), new User("Julie", 35));
	int computedAges = 
	  users.stream().reduce(0, (partialAgeResult, user) ->
	  partialAgeResult + user.getAge(),Integer::sum);
	System.out.println(computedAges);
}
}

package designpatterns;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class DecoratorPattern {
public static void main(String[] args) {
	Map<String,Integer> map=new LinkedHashMap<>();
	map.put("ganesh", 1);
	map.put("preeti", 2);
	//The below line is decorator pattern,
	//Like how toppings is a decorator for pizza
	//similarly map keys are decorated within arraylist
	ArrayList<String> aL=new ArrayList<>(map.keySet());
	System.out.println(aL);
}
}

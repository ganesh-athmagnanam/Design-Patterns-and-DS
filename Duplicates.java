package codingpractice;

import java.util.LinkedHashSet;
import java.util.Set;

public class Duplicates {
public static void main(String[] args) {
	int arr[]= {1,2,3,2,1};
	findDuplicate(arr);
}

private static void findDuplicate(int[] arr) {
	Set<Integer> set=new LinkedHashSet<>();
	Set<Integer> outPutset=new LinkedHashSet<>();
	for(int i=0;i<arr.length;i++) {
		if(set.contains(arr[i])) {
			outPutset.add(arr[i]);
		}
		else
			set.add(arr[i]);
	}
	System.out.println(outPutset);
}
}

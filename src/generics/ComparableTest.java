package generics;

import java.util.TreeSet;

public class ComparableTest {
	public static void main(String[] args) {
		TreeSet<Integer> nums = new TreeSet<Integer>(); 
		
		nums.add(10);
		nums.add(5);
		nums.add(2);
		nums.add(1);
		nums.add(5);
		nums.add(121);
		nums.add(412);
		nums.add(-13);
		
		for(Integer n: nums) {
			System.out.println(n);
		}
	}
}

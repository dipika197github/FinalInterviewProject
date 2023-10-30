package com.project;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenAndOddExample {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(2,3,4,5,6,7,8);
		List<Integer> list2=list.stream().filter(e->e%2==0).collect(Collectors.toList());
		System.out.println(list2);
              List<Integer> list3=list.stream().filter(e->e%2!=0).collect(Collectors.toList());
		System.out.println(list3);
		
		
	
	}

}

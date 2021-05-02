package com.sap.test;

import java.util.ArrayList;
import java.util.List;

public class Example {
	public static<T extends Number> List<T> process(List <T> args){
		
		ArrayList<Integer> list=new ArrayList<>();List<Integer> number=process(list);
		
		ArrayList<Number> list=new ArrayList<>(); List<? extends Number> numbers=process(list);
		
		ArrayList<Integer> list=new ArrayList<>(); List<Object> numbers=process(list);
		
		
		
		
	}
}

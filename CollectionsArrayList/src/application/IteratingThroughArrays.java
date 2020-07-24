package application;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class IteratingThroughArrays {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(100);
		list.add(54);
		list.add(1212);
		
		//or we can do this 
		//var lists = new ArrayList<Integer>();
		
		// one way
		for(var n:list) {
			System.out.println(n);
		}
		
		System.out.println("--------");
		
		//2nd way
		for(int i = 0 ; i < list.size() ; i++) {
			//var n = list.get(i);
			
			Integer n= list.get(i);
			System.out.println(i + ":"+ n);
		}
		System.out.println("-----------");
		//third way
		list.forEach(System.out::println);
		
		System.out.println("-----------");
		
		//fourth way
		list.forEach(e ->System.out.println(e));
		
		System.out.println("----------");
		//fifth way
		
		IntStream.range(0, list.size()).forEach(i->{
			System.out.println(list.get(i));
		});
	
		
	}

}
 
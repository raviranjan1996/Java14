package helloWorld2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Normal {

	public static void main(String[] args) {
		List<String> lm =new ArrayList<String>();
		lm.add("ravi");
		lm.add("patel");
		lm.add("avinash");
		lm.add("kumar");
		 
			Collections.sort(lm);
			
			lm.forEach(e->System.out.println(e));
			System.out.println();
	Set<String> name = new TreeSet<String>();
	
	name.add("zwer");
	name.add("aqwe");
	name.add("ravi");
	name.add("patel");
	name.add("kumar");
	
	
	name.forEach(e->System.out.println(e));
	System.out.println();
	Map<Integer, String > names = new TreeMap<Integer, String>();
	names.put(1, "ravi");
	names.put(10, "kravi");
	names.put(5, "mravi");
	names.put(2, "pravi");
	names.put(54, "avi");
	names.forEach((k ,v)-> System.out.println(k + ": " + v));
	
		
	
	
	

}}
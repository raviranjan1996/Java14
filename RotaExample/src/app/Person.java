package app;

import java.util.HashSet;
import java.util.Set;

public class Person {
	
	private String name;
	private Set<Skills> skills; 
	private boolean isholiday=false;
	public Person(String name) {
		this.name = name;
		
		skills = new HashSet<Skills>();
	}
		
	public void addSkill(Skills skill) {
		   skills.add(skill);
	}
	
	public void onHoliday(boolean isholiday) {
		this.isholiday = isholiday;
	}
	
	public Set<Skills> getSkill(){
		return skills;
	}
	
	public boolean isHoliday() {
		return isholiday;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(name).append(": ");
		for(Skills skill : skills) {
			sb.append(skill).append(",");
		}
				
		return sb.toString();
	}
	

}

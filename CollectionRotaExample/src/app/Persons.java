package app;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Persons {
	private String name;
	private Set<Skills> skills;
	private boolean onHoliday=false;
	public Persons(String name) {
		this.name = name;
		
		skills = new HashSet<Skills>();
	}
	
	
	public void addSkill(Skills skill) {
	
		skills.add(skill);
	}
	
	public void setHoliday(boolean onHoliday) {
		this.onHoliday = onHoliday;
	}
	
	public Set<Skills> getSkill(){
		return skills; 
	}
	
	public boolean isHoliday() {
		return onHoliday;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(name).append(": ");
		
		for(Skills skill: skills) {
			sb.append(skill).append("\t");
		}
		
		return sb.toString();
		
	}
	
	
	
}

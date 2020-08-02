package app;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Rota {
	
	private List<Person> people  = new ArrayList<Person>();
	private int getPersonListPosition =0;
	private List<Set<Person>> days = new LinkedList<>();
	

	public Rota() {
		
	}
	
	public void add(List<Person> person) {
		this.people.addAll(person);
		nextWeak();
	}
	
	public  void nextWeak() {
		days.clear();
		for(int day=0 ; day < Days.values().length ; day++) {
			
			populateOnDay(day);
		}
		
	}

	private void populateOnDay(int day) {
		VitallSet vitalset = new VitallSet();
		Set<Person> peoples = new LinkedHashSet<Person>();
		
		
		for(int i =0 ; i < people.size() ; i++) {
			
			Person person = people.get(getPersonListPosition++);
			
			if(getPersonListPosition == people.size()) {
				getPersonListPosition=0;
			}
			
			if(person.isHoliday()) {
				continue;
			}
			
			Set<Skills> skill = person.getSkill(); 
			vitalset.addAll(skill);
			peoples.add(person);
			
			if(vitalset.isComplete()) {
				break;
			}
		}
		days.add(peoples);
		
		
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(int i=0 ; i<days.size() ; i++) {
			
			Days day = Days.values()[i];
			System.out.println(day);
			
			Set<Person> personWorking = days.get(i);
			
			for(Person workingProfessional: personWorking) {
				System.out.println(workingProfessional);
			}
			
		}
		return sb.toString();
	
		
	}

}

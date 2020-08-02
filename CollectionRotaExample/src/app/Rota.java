package app;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Rota {

	private List<Persons> people;
	private List<Set<Persons>> days = new ArrayList<>();
	private int personListPosition = 0;

	public Rota(List<Persons> person) {

		this.people = person;
		nextWeek();
	}

	public void nextWeek() {

		days.clear();
		for (int day = 0; day < Days.values().length; day++) {
			
			populateOnday(day);
		}
	}

	private void populateOnday(int day) {
		VitalSkillSet vitalSkillSet = new VitalSkillSet();
		Set<Persons> workingday = new HashSet<Persons>();

		for (int i = 0; i < people.size(); i++) {
			
			Persons persons = people.get(personListPosition++);
		
			if (personListPosition == people.size()) {
				personListPosition = 0;
			}
			if (persons.isHoliday()) {
				continue;
			}
			
			
			Set<Skills> skills = persons.getSkill();
		
			vitalSkillSet.addAll(skills);
			workingday.add(persons);
			if (vitalSkillSet.isComplete()) {
				break;
			}
	
		}
		days.add(workingday);
	
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(int i=0 ; i <days.size() ; i++) {
			Days dayName = Days.values()[i];
			
			System.out.println(dayName);
			Set<Persons> personWorking = days.get(i);
			
			for(Persons working: personWorking) {
				System.out.println(working);
			}
		}
		

		return sb.toString();
	}

}

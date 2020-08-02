package app;

import java.util.ArrayList;
import java.util.List;

public class RotaExercise {

	private static String[][] personSkills = {

			{ "Olivia", "programming", "electronics" },
			{ "Jake", "reception", "engineering" },
			{ "Amelia", "programming", "reception", "electronics", "management" },
			{ "Noah", "management", "electronics" },
			{ "James", "programming", "management", "electronics" },
			{ "Margeret", "engineering", "electronics", "programming", "reception" },
			{ "Emma", "programming" },
			{ "Jack", "engineering", "electronics", "programming" },
			{ "Mary", "engineering", "electronics" },
	};

	public static void main(String[] args) {
			
		List<Persons> person = loadData();
	
		Rota rota = new Rota(person);
		rota.nextWeek();
		System.out.println(rota);

	}
	
	private static List<Persons> loadData(){
		

		List<Persons> people = new ArrayList<>();

		for (String[] row : personSkills) {
			String name = row[0];
			Persons person = new Persons(name);
			for (int i = 1; i < row.length; i++) {
				
				
				 // if(name.equals("Margeret")) { person.setHoliday(true); }
				 
				String skill = row[i];

				person.addSkill(Skills.valueOf(skill.toUpperCase()));
			}

			people.add(person);
		}
		
		return people;
	}
}
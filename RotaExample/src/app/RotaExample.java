package app;

import java.util.LinkedList;
import java.util.List;

public class RotaExample {

	public static String[][] personSkills = {

			{ "Ravi", "programming", "electronics", "management" }, { "Rohit", "Electronics", "management" },
			{ "Vishi", "playing", "study" }, { "Anuranjan", "law", "advocate", "gamming", "management" },
			{ "Ravi", "electrical", "UPSC" }, { "Ramesh", "employee", "management" },
			{ "sanket", "programming", "playing" }, { "rahul", "doctor", "management" }, { "raju", "student", "UPSC" },
			{ "akhshay", "programming", "iitian" }

	};

	public static void main(String[] args) {

		List<Person> person = loadData();
		
		person.forEach(e->System.out.println(e));
		
		System.out.println("================================================================================");
		  Rota rota = new Rota();
		  
		  rota.add(person);
		  System.out.println(rota);
		 

	}

	private static List<Person> loadData() {

		List<Person> people = new LinkedList<Person>();

		for (String[] row : personSkills) {
			String name = row[0];
			Person person = new Person(name);
			for (int i = 1; i < row.length; i++) {

				String skill = row[i];
				if(name.equals("Anuranjan")) {
					person.onHoliday(true);
				}
				person.addSkill(Skills.valueOf(skill.toUpperCase()));

			}
			people.add(person);
		}

		return people;
	}

}
 
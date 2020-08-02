package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class CollectionExample1 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		var word1984file = new File("1984.txt");
		var wordAnimalFarm = new File("AnimalFarm.txt");

		SortedSet<String> set1984 = loadWords(word1984file);
		SortedSet<String> setAnimal = loadWords(wordAnimalFarm);
		
		
		var OnlyIn1984 =new TreeSet<String>(set1984);
		OnlyIn1984.removeAll(setAnimal);
		
		var OnlyInAnimalFarm = new TreeSet<String>(setAnimal);
		OnlyInAnimalFarm.removeAll(set1984);
		
		var setBoth = new TreeSet<String>(set1984);
		setBoth.retainAll(setAnimal);
		
		System.out.println("Unique word in the 1984: " + set1984.size());
		System.out.println("Unique words in Animal: " + setAnimal.size());
		System.out.println("\n");

		System.out.println("=====================+Words per line in 1984+===============================\n");
		
		System.out.println("Word only in 1984: " + OnlyIn1984.size());
		displayWords(OnlyIn1984);
		System.out.println("\n\n");
		System.out.println("=====================+Words per line in Animal Farm+===============================\n");
		System.out.println("Word Only in Animal Farm: " + OnlyInAnimalFarm.size());
		displayWords(OnlyInAnimalFarm);
		
		System.out.println("=====================+Words per line in found in both+===============================\n");
		System.out.println("words found in both: " + setBoth.size());
		displayWords(setBoth);

	}

	private static void displayWords(Set<String> word) {

		int index = 0;
		for (var words : word) {

			System.out.printf("%-15s ", words);

			if (++index % 10 == 0) {
				System.out.println();
			}
		}
	}

	private static SortedSet<String> loadWords(File file) throws FileNotFoundException, IOException {
		TreeSet<String> wordSet = new TreeSet<>();
		try (var br = new BufferedReader(new FileReader(file))) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] splitline = line.split("[^a-zA-Z]+");
				for (var words : splitline) {
					if (words.length() > 1) {
						wordSet.add(words.toLowerCase());
					}
				}
			}
		}
		return wordSet;

	}

}

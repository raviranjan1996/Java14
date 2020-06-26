package application;

public class MatchingArrayMain {

	public static void main(String[] args) {
		
		MatchingArray matchingArray = new MatchingArray();
		boolean match = matchingArray.intMatch();
		System.out.println(match);
		
		boolean stringMatch = matchingArray.stringMatch();
		System.out.println(stringMatch);
		
		boolean arrayMatch = matchingArray.intArrayMatch();
		System.out.println(arrayMatch);

	}

}

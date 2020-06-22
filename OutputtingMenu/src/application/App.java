package application;

public class App {

	public static void main(String[] args) {
		
		String prompt = "Select an option";
		String str1="Add an entry";
		String str2="Add database";
		String str3="Exit";
		
		int value1=1;
		int value2=2;
		int value3=3;
		
		String menu = "\t" + prompt + "\n";
		
		menu += "\t\t" + value1 + ". " + str1 + "\n";
		menu += "\t\t" + value2 + ". " + str2 + "\n";
		menu += "\t\t" + value3 + ". " + str3 + "\n";
		
		System.out.println(menu);
		
		
	}

}

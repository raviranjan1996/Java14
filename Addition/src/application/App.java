package application;

public class App {

	public static void main(String[] args) {
		int cats = 7;
		int dogs = 10;
		int total = cats + dogs;
		System.out.println(total);
		int count = 0;
		int open=0;
		String str = "q()w()S)(rty)(";
		for (int i=0 ; i<str.length() ; i++) {
			if(str.charAt(i) == ')')
			{
				open++;
			}
			else if(str.charAt(i)=='(') {
				count++;
			}
		}
			if( open > count) {
				System.out.println("No. of Bracket : " + count);
			}
			else {
				System.out.println("No. of Brackets : "  + open);
			}
		
		
	}
}	



package helloWorld2;

public class CountingBracket {

	public static void main(String[] args) {
			String[] str = {"[[[]{{{{]}]}}}" , "{]{{]]()}}}[[["};
			
			for(int i = 0 ; i<str.length ; i++) {
				
				String s = str[i];
				
				char[] ch = s.toCharArray();
				int countSquare =0;
				int countCurly=0;
				int countParanthesis=0;
				for(int j = 0 ; j< ch.length ; j++) {
					if(ch[j] == '[') {countSquare++;}
					else if(ch[j]==']') {countSquare--;}
					else if(ch[j] =='{') {countCurly++;}
					else if(ch[j] == '}'){countCurly--;}
					else if(ch[j] == '(') {countParanthesis++;}
					else if(ch[j] == ')') {countParanthesis--;}
				}
				if(countSquare==0 && countCurly==0 && countParanthesis==0) {
					System.out.println("blanced");
				}
				else {
					System.out.println("not balanced");
				}
		}
 
	}

}

package test;

public class Stringbuilder {

	public static void main(String[] args) {
	
		String text="";
		text +="I ";
		text +="am ";
		text +="ravi";
		System.out.println(text);
		StringBuilder sb = new StringBuilder();
		sb.append("I ");
		sb.append("am ");
		sb.append("patel");
		String result = sb.toString();
		System.out.println(result);
		
		String name = "ranjan";
		StringBuilder sb1 = new StringBuilder();
		sb1.append("i ").append("am ").append(name);
		String result1 = sb1.toString();
		System.out.println(result1);

	}

}

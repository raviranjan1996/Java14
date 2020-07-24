package application;

public class Person {
	
	static class Head{
		public void print() {
			System.out.println("head");
		}
		
	}
	
	static class Body {
		public void print() {
			System.out.println("body");
		}
	}
	
	public void print() {
		Head head = new Head();
		Body body  = new Body();
		
		head.print();
		body.print();
	}

}

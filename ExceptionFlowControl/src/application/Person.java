package application;

public class Person {
	
	public void setName(String name) throws Exception {
		if(name==null) {
			throw new Exception("name cannot be Null");
		}
		
		System.out.println("name is " + name);
	}

}

package application;

public class GetterAndSetterClass {
	private String names;
	private int age; 						//this can be still accessed in th main class so for preventing this we use public private keyword

	public void setName(String name) {
		this.names = name;   //this. is refer to the instance variable
	}

   public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return names;
	}
	public int getAge() {
		return age;
	}
}

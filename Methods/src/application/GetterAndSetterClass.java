package application;

public class GetterAndSetterClass {
	private String name;
	private int age; 						//this can be still accessed in th main class so for preventing this we use public private keyword

	public void setName(String name) {
		this.name = name;   //this. is refer to the instance variable
	}

   public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}

package application;

public class GetterSetter {

	public static void main(String[] args) {

		GetterAndSetterClass getterSetter = new GetterAndSetterClass();

		getterSetter.setName("ravi");
		getterSetter.setAge(24);
		System.out.println(getterSetter.getName());
		System.out.println(getterSetter.getAge());
	

		// getter and setter method is used to not to access the instance variable
		// directly.
		
	}

}

package collection;

public class Wrapper {
		
	private Object object;
	
	public void setObject(Object object) {
		System.out.println(object);
		this.object = object;
				
	}
	
	public Object get() {
		return object;
	}
}

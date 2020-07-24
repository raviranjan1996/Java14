package collection;

public class Wrapper<E> {
		
	private E object;
	
	public void setObject(E object) {
		this.object = object;
				
	}
	
	public E get() {
		return object;
	}
}

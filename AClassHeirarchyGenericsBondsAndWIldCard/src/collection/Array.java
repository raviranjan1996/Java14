package collection;

public class Array<E> {
		
	private E[] array;
	private int position = 0;
	@SuppressWarnings("unchecked")
	public Array(int size) {
		this.array = (E[])(new Object[size]);
	}
	
	public void add(E e) {
		
		if(position == array.length) {
			throw new ArrayIndexOutOfBoundsException();
		}
		array[position++] = e;
		
	}
	
	public E get(int i) {
		return array[i];
	}
	
	public int size() {
		return array.length;
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(int i=0 ; i< array.length ; i++) {
			sb.append(array[i].toString());
			sb.append(" ");
		}
		
		return sb.toString();
	}
	
}

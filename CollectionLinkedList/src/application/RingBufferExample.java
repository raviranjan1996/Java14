package application;

import java.util.Iterator;

class Ring<E> implements Iterable<E> {
	private E[] item;
	private int writePosition = 0;
	private int numberOfItem = 0;
	
	private class RingIterator implements Iterator<E>{
			private int readPosition=0;
		@Override
		public boolean hasNext() {
			
			return readPosition < numberOfItem;
		}

		@Override
		public E next() {
			return item[readPosition++];
		}
		
	}
	
	
	@SuppressWarnings("unchecked")
	public Ring(int size) {

		item = (E[]) new Object[size];

	}

	public void add(E elements) {
		item[writePosition++] = elements;

		if (writePosition == item.length) {
			writePosition = 0;
		}

		if (++numberOfItem > item.length) {
			numberOfItem = item.length;
		}
	}

	public E get(int index) {
		return item[index];
	}

	public int size() {
		return numberOfItem;
	}

	@Override
	public Iterator<E> iterator() {
		
		return new RingIterator();
	}

}

public class RingBufferExample {

	public static void main(String[] args) {
		Ring<Integer> ring = new Ring<>(3);
			
		
		ring.add(12);
		ring.add(13);
		ring.add(14);
		ring.add(15);
		ring.add(89);
		ring.add(892);
	
		
			for(Iterator<Integer> it = ring.iterator() ; it.hasNext();) {
				Integer number = it.next();
				
				System.out.println(number);
			}
	}

}

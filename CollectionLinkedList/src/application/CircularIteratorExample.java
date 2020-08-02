package application;

import java.util.Iterator;

class Rings<E> implements Iterable<E> {
	private E[] item;
	int writingPosition = 0;
	int numberPostion = 0;
	int itemread = 0;

	@SuppressWarnings("unchecked")
	public Rings(int size) {
		item = (E[]) new Object[size];
	}

	class RingsIterator implements Iterator<E> {
		int readPosition = 0;

		public RingsIterator() {
			System.out.println("========" + numberPostion);
			System.out.println("++++++++++++" + writingPosition);
			if (numberPostion == item.length) {
				readPosition = writingPosition;
			}
		}

		@Override
		public boolean hasNext() {

			return itemread < numberPostion;
		}

		@Override
		public E next() {
			++itemread;

			if (readPosition == item.length) {
				readPosition = 0;
			}

			return item[readPosition++];

		}

	}

	public void add(E element) {
		item[writingPosition++] = element;

		if (writingPosition == item.length) {
			writingPosition = 0;
		}

		if (++numberPostion > item.length) {
			numberPostion = item.length;
		}

	}

	public E get(int index) {
		return item[index];
	}

	public int size() {
		return numberPostion;
	}

	@Override
	public Iterator<E> iterator() {

		return new RingsIterator();
	}

}

public class CircularIteratorExample {

	public static void main(String[] args) {
		Rings<Integer> ring = new Rings<>(3);

		ring.add(12);
		ring.add(11);
		ring.add(44);
		ring.add(112);
		ring.add(12345);
		ring.add(12345);


		
		/*
		 * for(var n:ring) { System.out.println(n); }
		 * System.out.println("#########################");
		 */
		
		for (Iterator<Integer> it = ring.iterator(); it.hasNext();) {
			Integer number = it.next();

			System.out.println(number);

		}
			}

}

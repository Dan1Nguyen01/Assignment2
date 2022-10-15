package utilities;

import java.util.NoSuchElementException;

public class MyArrayListIterator<E> implements Iterator {
	private int pos;
	private int size;

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return pos <= size;
	}

	@Override
	public Object next() throws NoSuchElementException {
		// TODO Auto-generated method stub
		return null;
	}

}

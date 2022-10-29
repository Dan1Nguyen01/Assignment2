package utilities;

import java.util.NoSuchElementException;

public class MyDLL<E> implements ListADT<E> {
	private int size;
	private Node head;
	private Node tail;

	@Override
	public int size() {
		return size;
	}

	@Override
	public void clear() {
		head = tail = null;
		size = 0;

	}

	@Override
	public boolean add(int index, E toAdd) throws NullPointerException, IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean add(E toAdd) throws NullPointerException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(ListADT<? extends E> toAdd) throws NullPointerException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E get(int index) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E remove(int index) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E remove(E toRemove) throws NullPointerException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E set(int index, E toChange) throws NullPointerException, IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(E toFind) throws NullPointerException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E[] toArray(E[] toHold) throws NullPointerException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return new myNewIterator();
	}

	public class myNewIterator implements Iterator {
		private int pos;
		private int size;

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return pos < size;
		}

		@Override
		public Object next() throws NoSuchElementException {
			if (pos >= size) {
				throw new NoSuchElementException();
			}
//			E toReturn = array[pos++]; not sure if we need to have an array here???
			return null;
		}

	}

}

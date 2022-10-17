package utilities;

import java.io.Serializable;

public interface StackADT<E> {
	/*
	 * / Stack is an array QUEUE IS an ArrayList
	 */
	final static int SIZE = 0;

	static void Stack(int size) {

	}

	public default void push(E element) throws IndexOutOfBoundsException {

	}

	public default void pop(E element) throws IndexOutOfBoundsException {

	}
}
/**
	public static int getSize() {
		return 0;
	}

	public static Boolean isEmpty() {
		return false;
	}

	public static Boolean isFull() {
		return false;
	}

	public static void printStack() {

	}

	public boolean equals(StackADT<E> that);

	public Object[] toArray();

//	public <E>[] toArray(<E> copy) {
//
//    }

	public default E search(<E> obj) {
		return null;
	}

	public static boolean contains(<E> obj) {
		return false;
	}
*/
}

/**
 * 
 */
package utilities;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Dan Nguyen
 * @param <E>
 *
 */
class MyStackTest<E> {
	private StackADT<E> stack;
	private MyStack myStack;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		this.stack = new MyStack<>();
		this.myStack = new MyStack();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		stack = null;
	}

	/**
	 * Test method for {@link utilities.MyStack#Stack(int)}.
	 */
	@Test
	void testStack() {
		int capacity = 10;
		int size = 0;
		myStack.Stack(capacity);

		assertEquals(10, myStack.getCapacity());
		assertEquals(size, myStack.getSize());

	}

	/**
	 * Test method for {@link utilities.MyStack#push(java.lang.Object)}.
	 */
	@Test
	void testPush() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link utilities.MyStack#pop(java.lang.Object)}.
	 */
	@Test
	void testPop() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link utilities.MyStack#peek()}.
	 */
	@Test
	void testPeek() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link utilities.MyStack#equals(utilities.StackADT)}.
	 */
	@Test
	void testEqualsStackADTOfE() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link utilities.MyStack#iterator()}.
	 */
	@Test
	void testIterator() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link utilities.MyStack#toArray()}.
	 */
	@Test
	void testToArray() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link utilities.MyStack#toArray(E[])}.
	 */
	@Test
	void testToArrayEArray() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link utilities.MyStack#search(java.lang.Object)}.
	 */
	@Test
	void testSearch() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link utilities.MyStack#contains(java.lang.Object)}.
	 */
	@Test
	void testContains() {

		int capacity = 10;
		int size = 0;

		Object test = new Object();
		myStack.Stack(capacity);
		myStack.push(test);
		
		assertTrue(myStack.contains(test));

	}

	/**
	 * Test method for {@link utilities.MyStack#size()}.
	 */
	@Test
	void testSize() {
		int capacity = 10;
		int size = 0;
		myStack.Stack(capacity);
		assertEquals(size, myStack.getSize());
	}

	/**
	 * Test method for {@link utilities.MyStack#isEmpty()}.
	 */
	@Test
	void testIsEmpty() {
		assertTrue(myStack.isEmpty());
		assertEquals(0, this.myStack.getSize());
	}

	/**
	 * Test method for {@link utilities.MyStack#clear()}.
	 */
	@Test
	void testClear() {
		int capacity = 10;
		int size = 0;
		myStack.Stack(capacity);

		assertEquals(size, 0);

	}

	/**
	 * Test method for {@link utilities.MyStack#getCapacity()}.
	 */
	@Test
	void testGetCapacity() {
		int capacity = 10;
		int size = 0;
		myStack.Stack(capacity);

		assertEquals(capacity, myStack.getCapacity());

	}

	/**
	 * Test method for {@link utilities.MyStack#getSize()}.
	 */
	@Test
	void testGetSize() {
		int capacity = 10;
		int size = 0;
		myStack.Stack(capacity);

		assertEquals(size, myStack.getSize());
	}

}
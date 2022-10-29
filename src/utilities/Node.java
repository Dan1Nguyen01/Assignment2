package utilities;

import java.io.Serializable;

public class Node implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2055217343965055408L;

	private Object data;
	private Node next;

	public Node(Object data, Node next) {
		this.data = data;
		this.next = next;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	{
	}
}

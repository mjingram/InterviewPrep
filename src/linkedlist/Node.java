package linkedlist;

public class Node {
	
	private int data;
	
	private Node next = null;
	
	public Node(int d) {
		data = d;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	
}

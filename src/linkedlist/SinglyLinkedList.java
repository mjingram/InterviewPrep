package linkedlist;

public class SinglyLinkedList {
	
	private  Node head = null;
	
	private Node tail = null;
	
	public void addNode(int data) {
		
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
			
			tail = newNode;
		}
		else {
			tail.setNext(newNode);
			tail = newNode;
		}
	}
	
	public void display() {
		Node current = head;
		
		if(head == null) {
			System.out.println("List is empty");
		}
		
		System.out.println("Nodes of Linked List: ");
		
		while(current.getNext() != null) {
			System.out.println(current.getData() + " ");
			current = current.getNext();
		}
		System.out.println(tail.getData());
	}
}

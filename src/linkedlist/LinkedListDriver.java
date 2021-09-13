package linkedlist;

public class LinkedListDriver {
	
	public static void main(String[] args) {
		SinglyLinkedList myList = new SinglyLinkedList();
		
		//Add Nodes to the List
		
		myList.addNode(1);
		myList.addNode(3);
		myList.addNode(7);
		myList.addNode(13);
		myList.addNode(34);
		
		myList.display();
	}
}

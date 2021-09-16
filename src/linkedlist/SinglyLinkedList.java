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
	
	public Node deleteNode(Node node, int position) {
		if(position == 0) {
			return node.getNext();
		}
		node.setNext(deleteNode(node.getNext(), position-1));
		return node;
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
	
	public Node insertNodeAtTail(Node node, int data) {
        if(node == null){
            return new Node(data);
        }
        else{
            node.setNext(insertNodeAtTail(node.getNext(), data));
        }
        return node;    
        

    }
}

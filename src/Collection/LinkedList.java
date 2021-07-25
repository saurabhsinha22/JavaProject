package Collection;

import java.util.Iterator;

public class LinkedList {
	static Node head;
	 
    static class Node {
 
        int data;
        Node next;
 
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
 
    
    Node reverse(Node node)
    {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }
 
    
    void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
 
    
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
        LinkedList.head = new Node(85);
        LinkedList.head.next = new Node(15);
        LinkedList.head.next.next = new Node(4);
        LinkedList.head.next.next.next = new Node(20);
 
        System.out.println("Given Linked list");
        list.printList(head);
        head = list.reverse(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printList(head);
    }


	public void add(String string) {
		// TODO Auto-generated method stub
		
	}


	public String element() {
		// TODO Auto-generated method stub
		return null;
	}


	public String getLast() {
		// TODO Auto-generated method stub
		return null;
	}


	public String peek() {
		// TODO Auto-generated method stub
		return null;
	}


	public String peekFirst() {
		// TODO Auto-generated method stub
		return null;
	}


	public Iterator<String> descendingIterator() {
		// TODO Auto-generated method stub
		return null;
	}
}
 



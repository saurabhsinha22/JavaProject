package Collection;

import java.util.LinkedList;
import java.util.List;

public class SubLinkedList {
	 public static void main(String[] args)
	    {
	        LinkedList<String> list = new LinkedList<String>();
	  
	        // adding elements
	        list.add("apple");
	        list.add("mango");
	        list.add("peach");
	        list.add("guava");
	        list.add("banana");
	        list.add("lichi");
	  
	        // printing initial elements
	        System.out.println(
	            "The elements of the  LinkedList are: " + list);
	  
	        System.out.println(
	            "Enter the start and end of the required sublist: ");
	  
	        // entering start and end indices
	        int start = 2, end = 5;
	  
	        List sublist = list.subList(start, end);
	        System.out.println("The required SubList is: "
	                           + sublist);
	    }
	}


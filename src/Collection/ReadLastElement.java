package Collection;

public class ReadLastElement {
	public static void main(String args[]) {
		  
	      // Creating an empty LinkedList
	      LinkedList list = new LinkedList();
	  
	      // Using add() method to add elements in the list
	      list.add("saurabh");
	      list.add("kumar");
	      list.add("sinha");
	      list.add("10");
	      list.add("20");
	  
	      // Displaying the list
	      System.out.println("LinkedList:" + list);
	        
	      // Fetching last element from the list
	      System.out.println("The last element is: " + list.getLast());
	   }
	}



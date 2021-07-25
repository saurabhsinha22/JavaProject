package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ShuffleElementsInArrayList {
	public static void main(String args[])
    {
        
        ArrayList<String> al = new ArrayList<String>();
  
        
        al.add("C");
        al.add("C++");
        al.add("Java");
        al.add("Python");
        al.add("PHP");
        al.add("Javascript");
  
        System.out.println("Before shuffling Arraylist:");
  
       
        Iterator itr = al.iterator();
  
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
  
        System.out.println("");
  
        Collections.shuffle(al);
  
        System.out.println("After shuffling Arraylist:");
  
        itr = al.iterator();
  
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }
}



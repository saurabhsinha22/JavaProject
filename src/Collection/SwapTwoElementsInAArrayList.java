package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class SwapTwoElementsInAArrayList {
	public static void main(String a[])
    {
 
        
        ArrayList<String> ArrList = new ArrayList<String>();
 
       
        ArrList.add("Item 1");
        ArrList.add("Item 2");
        ArrList.add("Item 3");
        ArrList.add("Item 4");
        ArrList.add("Item 5");
 
        
        System.out.println("Before Swap the ArrayList ");
        System.out.println(ArrList);
 
        
        Collections.swap(ArrList, 1, 2);
 
        
        System.out.println("After Swap the ArrayList");
        System.out.println(ArrList);
    }
}



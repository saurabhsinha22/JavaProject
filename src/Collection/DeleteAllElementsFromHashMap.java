package Collection;

import java.util.HashMap;

public class DeleteAllElementsFromHashMap {
	public static void main(String args[]) {
 
	      HashMap hm = new HashMap();
	      hm.put("Wallet", new Integer(700));
	      hm.put("Belt", new Integer(600));
	      hm.put("Backpack", new Integer(1200));
	      System.out.println("Map = "+hm);
	      hm.clear();
	      System.out.println("Map after removing all the elements (blank)= "+hm);
	   }
	}


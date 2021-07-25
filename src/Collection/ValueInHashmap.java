package Collection;

import java.util.HashMap;

public class ValueInHashmap {
	public static void main(String[] args)
    {
  
        
        HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
  
        
        hash_map.put(10, "Saurabh");
        hash_map.put(15, "4");
        hash_map.put(20, "Shweta");
        hash_map.put(25, "Welcomes");
        hash_map.put(30, "You");
  
     
        System.out.println("Initial Mappings are: " + hash_map);
  
        
        System.out.println("Is the value 'Saurabh' present? " + 
        hash_map.containsValue("Shweta"));
  
       
        System.out.println("Is the value 'World' present? " + 
        hash_map.containsValue("World"));
    }
}


package String;

public class BlankSpace {
	public static void main(String[] args)
    {
        String str = "      I am a SDET Engineer        ";
       
        // Call the replaceAll() method
        str = str.replaceAll("\\s", "");
       
        System.out.println(str);
    }
}



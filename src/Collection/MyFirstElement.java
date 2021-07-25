package Collection;

public class MyFirstElement {
	public static void main(String a[]){
        
        LinkedList arrl = new LinkedList();
        arrl.add("First");
        arrl.add("Second");
        arrl.add("Third");
        arrl.add("Random");
        System.out.println("First Element: "+arrl.element());
        System.out.println("First Element: "+arrl.getLast());
        System.out.println("First Element: "+arrl.peek());
        System.out.println("First Element: "+arrl.peekFirst());
    }
}



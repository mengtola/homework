import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class CollectionReverse {

	public static void main(String[] args) {
		 List<String> list = new ArrayList<>();
	      //add elements to the LinkedList
	        list.add("A");
	        list.add("B");
	        list.add("C");
	        list.add("D");
	        System.out.println(list);
	        
	        Collections.reverse(list);
	        System.out.println("Results after reverse operation:");
	        System.out.println(list);
	       

	}

}

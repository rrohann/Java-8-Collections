import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ALLooping {

	public static void main(String[] args) {
    //Single line arraylist initialization
		ArrayList<String> al = new ArrayList<String>() {{ 
    add("c++");   add("python");    add("java");    add("html");    add("mysql"); }};
		
		//1. Normal for-loop to get Array List elements
		for(int i=0; i<al.size(); i++) {
			System.out.print(al.get(i) + " ");
		}
		
		//2. Using java For-Each loop
		for(String s:al) {
			System.out.print(s + " ");
		}
		
		//3. Using Iterator's iterator()
		Iterator<String> i = al.iterator();
		while(i.hasNext()) {
			System.out.print(i.next() + " ");
		}
		
		//4. Using Lambda forEach()
		al.forEach(x -> System.out.print(x + " "));
		
		//same lambda expression forEach. Multi-line block
		al.forEach(x -> {
			if(x.equalsIgnoreCase("c++")||x.equalsIgnoreCase("java")) {
				System.out.println(x + " is OOP Language");
			}
			else
				System.out.println(x);
		});
		
		//5. Using ListIterator. It can iterate in both forward & backward direction
		ListIterator i2 = al.listIterator();
		while(i2.hasNext()) {
			System.out.println(i2.next());
		}
		while(i2.hasPrevious()) {
			System.out.println(i2.previous());
		}
		
	}//main ends...

}

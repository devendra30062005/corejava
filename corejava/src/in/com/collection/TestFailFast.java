package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class TestFailFast {
	public static void main(String[] args) {

		ArrayList c = new ArrayList();

		c.add("Ram");
		c.add("Shyam");
		c.add("Jai");
		c.add("Vijay");

		// Create Iterator
		Iterator it = c.iterator();

		// Addition of new element will raise an exception. comment below
		// statement line#28 to avoid exception
		c.add("Ajay");

		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}



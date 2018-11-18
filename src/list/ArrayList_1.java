package list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_1 {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add("Suhas");
		a.add(5);
		a.add("Kadam");
		a.add(null);
		System.out.println(a);
		ArrayList a2 = new ArrayList();
		a2.add("Kailas");
		a2.add(5);
		a2.add("Kadam");
		a2.add(null);

		System.out.println(a.addAll(a2));
		System.out.println(a);

		System.out.println(a.get(4));
		System.out.println(a.remove(3));
		System.out.println(a);

		a.set(1, "Kailas");
		System.out.println(a);
		System.out.println(a.indexOf("Kailas"));
		System.out.println(a.lastIndexOf("Kailas"));

	}

}

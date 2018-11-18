package list;

import java.util.LinkedList;

public class LinkedList_1 {

	public static void main(String[] args) {
			LinkedList l= new LinkedList();
			l.add("Suhas");
			l.add(007);
			l.add("Kadam");
			System.out.println(l);
			l.addFirst("Shri.");
			l.addLast("A/p:- Chakore");
			System.out.println(l);
			System.out.println(l.getFirst());
			System.out.println(l.getLast());
			l.removeFirst();
			l.removeLast();
			System.out.println(l);
			l.set(1, "Kailas");
			System.out.println(l);
			l.add(0, "Shri");
			System.out.println(l);
	}

}

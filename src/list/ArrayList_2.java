package list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> intar = new ArrayList<>();
		intar.add("Suhas");
		intar.add("Satyam");
		intar.add("Ajinkya");
		intar.add("Pravin");
		intar.add("Omkar");
		intar.add("Ajit");
		intar.add("Suraj");
		intar.add("VickyBhai");

		Iterator<String> e = intar.iterator();

		while (e.hasNext()) {
			System.out.println(e.next());
			String obj = e.next();
			if (obj.contains("VickyBhai")) {
				System.out.println("***********");
			} else {
				e.remove();
			}
			System.out.println(e.next());

		}
	}

}

package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class WriteAProgramtosortAnArrayListOfStringIndescendiNGoRder {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(0);
		list.add(13);
		list.add(3);
		list.add(10);
		list.add(5);
		list.add(22);
		list.add(10);
		System.out.println("Original List : " + list);
		Collections.reverse(list);
		System.out.println("Reversed List : " + list);
		Collections.sort(list);
		//ReverseList(list);
		System.out.println("Asecending Order : " + list);
		Collections.sort(list,Collections.reverseOrder());
		System.out.println("Decending Order : " + list);
		
		
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("Welcome");
		list1.add("To");
		list1.add("Kajal");
		list1.add("Home");
		System.out.println("Original List : " + list1);
		Collections.sort(list1);
		System.out.println("sorted list : " +list1);
		

	}

}

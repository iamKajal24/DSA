package ArrayList;

import java.util.ArrayList;

import java.util.Collections;

public class WriteAPogramToReVERSEtheGivenArrayList {
//	static void ReverseList(ArrayList<Integer> list) {
//		int i = 0, j = list.size() - 1;
//		while (i < j) {
//			Integer temp = Integer.valueOf(list.get(i));
//			list.set(i, list.get(j));
//			list.set(j, temp);
//			i++;
//			j--;
//		}
//	}

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
		//ReverseList(list);
		System.out.println("Reversed List : " + list);

	}

}

package ArrayList;
import java.util.ArrayList;
public class Demo {

	public static void main(String[] args) {
		//Wrapper Classess
//		Integer i = Integer.valueOf(4);
//		System.out.println(i);
//		float f = Float.valueOf(23.4f);
//		System.out.println(f);
		
		ArrayList<Integer> AL = new ArrayList<Integer>();
//		ArrayList<Boolean> Al1 = new ArrayList<Boolean>();
//		ArrayList<Float> Al2 = new ArrayList<Float>();
		
		//add new element
		AL.add(5);
		AL.add(6);
		AL.add(7);
		AL.add(8);
		
		//get an element at Index1
		System.out.println(AL.get(1));//6
		
		//Print with for Loop
		
//		for(int i=0;i<AL.size();i++) {
//			System.out.println(AL.get(i));
//		}
		
		//print the array List directly
		System.out.println(AL);
		
		
		//adding element at some index i //[5,100,6,7,8]
		AL.add(1,100);
		System.out.println(AL);
		
       // modifying element at index 1
		AL.set(1,10);
		System.out.println(AL);//[5,10,6,7,8]
		
		//removing an element at index1
		AL.remove(1);
		System.out.println(AL);
		
		// removing an element e
		AL.remove(Integer.valueOf(8));
		System.out.println(AL);
		
		//checking if an element Exists
		
		boolean ans = AL.contains(Integer.valueOf(6));
		System.out.println(ans);
		
		//if you don't specify class, you can put anything inside l
		ArrayList al = new ArrayList();
	}

}

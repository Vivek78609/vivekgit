package collections;
import java.util.ArrayList;

public class FrameWorks {
	public static void listFunctions() {
		ArrayList<Integer>list1= new ArrayList<>();
		ArrayList<Integer>list2=new ArrayList<>(67);
		ArrayList<Integer>list3=new ArrayList<>(list2);
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(3);
		list1.add(2,4);
		list2.addAll(list1);
		System.out.println(list1);		
		System.out.println(list2);
		System.out.println(list1.indexOf(3));
		
		
	}

	public static void main(String[] args) {
		listFunctions();

	}

}

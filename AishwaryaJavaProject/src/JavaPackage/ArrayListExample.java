package JavaPackage;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("Ravi");
		list.add("Ram");
		list.add("Rahul");
		list.add("Roshan");
		list.add("Rohit");
		list.add("Rithvik");
		list.remove(2);
		
		
		Iterator itr=list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}

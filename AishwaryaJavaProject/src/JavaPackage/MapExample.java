package JavaPackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		
		Map mapping=new HashMap();
		
		mapping.put(101, "Ram");
		mapping.put(101, "Ravi");
		mapping.put(103, "Rithvik");
		mapping.put(104, "Rohan");
		mapping.put(105, "Rahul");
		mapping.put(106, "Rahul");
		mapping.remove(106);
		
		Set set=mapping.entrySet();
		
		Iterator itr=set.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}

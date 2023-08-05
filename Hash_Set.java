package Core_Java;

import java.util.*;

public class Hash_Set {

	public static void main(String[] args) {
		HashSet<Integer> obj=new HashSet<Integer>();
		obj.add(74);
		obj.add(35);
		obj.add(11);
		obj.add(28);
		obj.add(57);
		System.out.println(obj.size());
		for(int id:obj) {
			System.out.println("Employee ID's:"+id);
		}
		obj.remove(11);
		for(int id:obj) {
		System.out.println("Employee Id:"+id);
		}
		if(obj.contains(11)) {
			System.out.println("Value is available");
		}
		else {
			System.out.println("Value is unavailable");
		}

	}

}

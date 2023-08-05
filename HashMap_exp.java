package Core_Java;

import java.util.*;

public class HashMap_exp {

	public static void main(String[] args) {
		HashMap<String, Integer> obj=new HashMap<String, Integer>();
		obj.put("Selenium", 13);
		obj.put("Java", 24);
		obj.put("MySQL", 43);
		obj.put("Python", 80);
		obj.put("Jira", 11);
		System.out.println(obj.get("Jira"));
		System.out.println(obj.get("Java"));
		for(String name:obj.keySet()) {
			System.out.println("Name of the employee:"+name);
		}
		for(int ids:obj.values()) {
			System.out.println("Employee ID:"+ids);
		}

	}

}

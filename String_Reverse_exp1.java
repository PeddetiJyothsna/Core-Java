package Core_Java;

import java.util.Scanner;

public class String_Reverse_exp1 {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter First,Second,Third names:");
		String name=obj.nextLine();
		String[] full_name=name.split("\\s");
		String first=full_name[0];
		String second=full_name[1];
		String third=full_name[2];
		String common=new StringBuilder(second).reverse().toString();
		System.out.println("First person name:"+first);
		System.out.println("Second person name:"+common);
		System.out.println("Third person name:"+third);

	}

}

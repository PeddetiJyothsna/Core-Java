package Core_Java;

public class String_CharAT {

	public static void main(String[] args) {
		String name="Selenium is a Automation tool";
		int a=name.length();
		char b=name.charAt(12);
		System.out.println("12th position letter is"+b);
		char c=name.charAt(0);
		System.out.println(c);
		for(int i=0;i<a;i++) {
			char full_name=name.charAt(i);
			System.out.println(full_name);
		}
		

	}

}

package Core_Java;

public class First_letter_uppercase {

	public static void main(String[] args) {
		String name="lowercase";
		String first=name.substring(0, 1);
		String remaining=name.substring(1, name.length());
		String upper=first.toUpperCase();
		String full_name=upper+remaining;
		System.out.println(full_name);

	}

}

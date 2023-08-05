package Core_Java;

public class String_Occurance {

	public static void main(String[] args) {
		String name="Java is a programming language";
		int before=name.length();
		int after=name.replaceAll("g","").length();
		int count=before-after;
		System.out.println("Number count is:"+count);

	}

}

package Core_Java;

public class String_Reverse {

	public static void main(String[] args) {
		String name="Selenium";
		String reverse="";
		int len=name.length();
		for(int i=len-1;i>=0;i--) {
			reverse=reverse+name.charAt(i);
		}
		System.out.println(reverse);

	}

}

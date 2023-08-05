package Core_Java;

public class Upper_case_String {

	public static void main(String[] args) {
		String[] a= {"selenium","java","abcdxy","efgh"};
		for(int i=0;i<a.length;i++) {
			//System.out.println(a[i]);
//			int len=a[i].length();
			//System.out.println(len);
			String first=a[i].substring(0, 1);
			//System.out.println(first);
			String end=a[i].substring(1, a[i].length());
			//System.out.println(end);
			String upper=first.toUpperCase();
			//System.out.println(upper);
			String Uppercase=upper+end;
			System.out.println(Uppercase);
		}

	}

}

package Core_Java;

public class Even_Odd {

	public static void main(String[] args) {
		int[] a= {2,5,6,1,3,7,8,12,19,17};
		for(int c:a) {
			if(c%2==0) {
				System.out.println("Even numbers:"+c);
			}
		}
		for(int c:a) {
			if(c%2!=0) {
				System.out.println("Odd numbers:"+c);
			}
		}
	}

}

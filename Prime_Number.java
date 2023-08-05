package Core_Java;

public class Prime_Number {

	public static void main(String[] args) {
		int a=54;
		for(int i=2;i<=a;i++) {
			int count=0;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==0) {
				System.out.println(i);
			}
		}

	}

}

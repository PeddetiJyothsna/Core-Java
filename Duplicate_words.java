package Core_Java;

public class Duplicate_words {

	public static void main(String[] args) {
		String[] a= {"Java","Python","Java","MySQL","Python"};
		//boolean temp=false;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println(a[j]);
					
				}
			}
		}

	}

}

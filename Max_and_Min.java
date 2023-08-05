package Core_Java;

public class Max_and_Min {

	public static void main(String[] args) {
		int[] a= {4,23,754,143,798,999,21,1,664};
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
			
		}
		System.out.println("Max value is:"+max);
		int min=a[0];
		for(int j=0;j<a.length;j++) {
			if(a[j]<min) {
				min=a[j];
			}
		}
		System.out.println("Min value is:"+min);
	}

}

package Core_Java;

public class Encapsulation {
	private String stu_name;
	private int stu_id;
	private int stu_batch;
	private String stu_section;
	public String getname() {
		return stu_name;
	}
	public void setname(String name) {
		this.stu_name=name;
		
	}
	public int getid() {
		return stu_id;
	}
	public void setid(int id) {
		this.stu_id=id;
	}
	public int getbatch() {
		return stu_batch;
	}
	public void setbatch(int batch) {
		this.stu_batch=batch;
	}
	public String getsection(){
		return stu_section;
	}
	public void setsection(String section) {
		this.stu_section=section;
	}

	public static void main(String[] args) {
		Encapsulation obj=new Encapsulation();
		obj.setname("Pampkin");
		obj.setid(1234);
		obj.setbatch(2022);
		obj.setsection("Java");
		System.out.println(obj.getname());
		System.out.println(obj.getid());
		System.out.println(obj.getbatch());
		System.out.println(obj.getsection());
		

	}

}

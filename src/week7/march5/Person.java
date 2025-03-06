package week7.march5;

public class Person{
	private int pid;
	private String fullName;
	private String email;

	public Person(){
		this.pid = 0;
		this.fullName = "";
		this.email = "";
	}

	public Person(int pid, String fullName, String email){
		this.pid = pid;
		this.fullName = fullName;
		this.email = email;
	}

	public int getPid(){return pid;}
	public void setPid(int pid) {this.pid = pid;}
	public String getFullName() {return fullName;}
	public void setFullName(String fullName) {this.fullName = fullName;}
	public String getEmail() {return email;}
	public void setEmail(String email) {this.email = email;}

	@Override
	public String toString(){
		return pid +", " + fullName + ", " + email;
	}
}
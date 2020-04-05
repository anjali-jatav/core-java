package lambdaexpression;

public class Student {
	private int sid;
	private String firstname;
	private String lastname;
	private int phone;
	
	
	public Student(int sid, String firstname, String lastname, int phone) {
		super();
		this.sid = sid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.phone = phone;
	}
	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}


	@Override
	public String toString() {
		return " "+sid+" "+firstname+" "+lastname+" "+phone;
		
	}
	
	
	

}

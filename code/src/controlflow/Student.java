package controlflow;

public class Student {
	String name;
	float tenthPercentage;
	float twelthPercentage;
	float cgpa;
	int backlog;

	public Student(String name, float tenthPercentage, float twelthPercentage, float cgpa, int backlog) {
		super();
		this.name = name;
		this.tenthPercentage = tenthPercentage;
		this.twelthPercentage = twelthPercentage;
		this.cgpa = cgpa;
		this.backlog = backlog;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getTenthPercentage() {
		return tenthPercentage;
	}

	public void setTenthPercentage(float tenthPercentage) {
		this.tenthPercentage = tenthPercentage;
	}

	public float getTwelthPercentage() {
		return twelthPercentage;
	}

	public void setTwelthPercentage(float twelthPercentage) {
		this.twelthPercentage = twelthPercentage;
	}

	public float getCgpa() {
		return cgpa;
	}

	public void setCgpa(float cgpa) {
		this.cgpa = cgpa;
	}

	public int getBacklog() {
		return backlog;
	}

	public void setBacklog(int backlog) {
		this.backlog = backlog;
	}

}

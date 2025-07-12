package project;
class studentReport{
	private String name;
	private int rollNumber;
	private float marks;
	

	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
	}
	public int getrollNumber() {
		return rollNumber;
	}
	public void setrollNumber(int rollNumber) {
		this.rollNumber=rollNumber;
	}
	public float getmarks() {
		return marks;
	}

	public void setMarks(float marks) {
		if(marks > 0 && marks <= 100) {
			this.marks=marks;
		}
		else {
			System.out.println("Enter mark between 0 - 100");
		}
	}
	void displayDetails() {
		System.out.println("Student Name: "+name);
		System.out.println("Student RollNumber: "+rollNumber);
		System.out.println("Marks: "+marks);
	}
}

public class StudentReportCard {
	public static void main(String args[]) {
		studentReport student = new studentReport();
		student.setname("Aswin S.");
		student.setrollNumber(101);
		student.setMarks(98);
		student.displayDetails();
		//testing invalid marks
		student.setMarks(102);
			
	}
}

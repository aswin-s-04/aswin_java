package project;
class student1{
	int rollnumber;
	String name;
	String department;
	student1(int rollnumber,String name,String department){
		this.rollnumber=rollnumber;
		this.name=name;
		this.department=department;
	}
	public void display() {
		System.out.println("Roll Number: " + rollnumber);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("---------------------------");
	}
}
public class Student {
	public static void main(String args[]) {
		student1 st1=new student1(101,"Aswin S.","Computer Science");
		student1 st2=new student1(102,"Ramesh V.","Computer Application");
		student1 st3=new student1(103,"Suresh B.","Computer Science");
		st1.display();
		st2.display();
		st3.display();
	}
}

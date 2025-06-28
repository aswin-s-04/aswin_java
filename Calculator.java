package project;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		int d;
	do {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a first number: ");
		int a=sc.nextInt();
		System.out.println("Enter a second number: ");
		int b=sc.nextInt();
		System.out.println("Enter a choose to calculate: \n 1.Add \n 2.Sub \n 3.Multiply \n 4.Divide \n 5.Modulas ");
		int c=sc.nextInt();
		switch(c) {
		case 1: System.out.println("Add: "+(a+b));
		break;
		case 2: System.out.println("Subtract: "+(a-b));
		break;
		case 3: System.out.println("Multiply: "+(a*b));
		break;
		case 4: System.out.println("Divide: "+(a/b));
		break;
		case 5: System.out.println("Modulas: "+(a%b));
		break;
		default: System.out.println("Enter a valid choice!");
			break;
		}
		System.out.println("Do you want to continue? press 1: ");
		d=sc.nextInt();
	}while(d ==1);
	}
	
}

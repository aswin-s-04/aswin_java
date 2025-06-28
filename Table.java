package project;
import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the table number: ");
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Tables:");
		for(int i=1;i<=10;i++) {
			int s=n*i;
			System.out.println(n+"x"+i+"="+s);
		}
	}
}

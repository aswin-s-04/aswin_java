package project;
class bankDemo{
	private String accountNumber;
	private String accountHolderName;
	private double balance;
	bankDemo(String accountNumber,String accountHolderNumber,double balance){
		this.accountNumber=accountNumber;
		this.accountHolderName=accountHolderNumber;
		this.balance=balance;
	}
	public String getaccountnumber() {
		return accountNumber;
	}
	public void setaccountnumber(String accountNumber) {
		this.accountNumber=accountNumber;
	}
	public String getaccountHolderName() {
		return accountHolderName;
	}
	public void setaccountHolderName(String accountHolderName) {
		this.accountHolderName=accountHolderName;
	}
	void deposit(double amount) {
		if(amount > 0) {
			balance=+amount;
			System.out.println("Deposited Amount: "+amount);
		}
		else {
			System.out.println("Deposit Valid Amount");
		}
	}
	void withdraw(double amount) {
		if(amount > 0 && amount < balance) {
			balance-=amount;
			System.out.println("Withdraw Amount: "+amount);
		}
		else {
			System.out.println("Insuffient balance");
		}
	}
	void displayBalance() {
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Account Holder Name: "+accountHolderName);
		System.out.println("Current Balance: "+balance);
	}
}
public class BankAccountDemo {
	public static void main(String args[]) {
		bank b1=new bank(1234567891,"ASWIN S.",1000.00);
		b1.displayBalance();
		b1.deposit(500.0);
		b1.withdraw(1000.0);
       b1.withdraw(2000.0);  
        b1.deposit(10000.0);   
        b1.withdraw(200.0);
		b1.displayBalance();
		b1.withdraw(10000);
	}

}


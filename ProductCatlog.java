package project;
class Product{
	private int productId;
	private String productName;
	private double price;
	
	public int getproductId() {
		return productId;
	}
	public void setproductId(int productId) {
		this.productId=productId;
	}
	public String getproductName() {
		return productName;
	}
	public void setproductName(String productName) {
		this.productName=productName;
	}
	public double getprice() {
		return price;
	}
	public void setprice(double price) {
		if(price > 0) {
			this.price=price;
		}
		else {
			System.out.println("Enter price greater than 0");
		}
	}
	void displayDetails() {
		System.out.println("Product Id: "+productId);
		System.out.println("Product Name: "+productName);
		System.out.println("Product Price: "+price);
	}
}
public class ProductCatlog {
	public static void main(String args[]) {
		Product pdt=new Product();
		pdt.setproductId(101);
		pdt.setproductName("Soap");
		pdt.setprice(1000);
		pdt.displayDetails();
		pdt.setprice(0);
	}

}

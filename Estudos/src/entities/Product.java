package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	
	public double TotalValuelnStock() {
		return price * quantity;
	}
	
	public void AddProducts(int quantity) {
		this.quantity += quantity;
	}
	public void RemoveProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name + ", " 
			+ "$ " + String.format("%.2f", price) 
			+ ", " + quantity 
			+ " Units, Total: $ " 
			+ String.format("%.2f",TotalValuelnStock());
	}
}

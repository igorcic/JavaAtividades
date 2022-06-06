package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class MainProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		product.name = sc.nextLine();
		System.out.println("Price: ");
		product.price = sc.nextDouble();
		System.out.println("Quantity in stock: ");
		product.quantity = sc.nextInt();
		
		
		System.out.print("Product data: ");
		System.out.println(product);
		
		System.out.println("Add Product in Stock: ");
		int quantity = sc.nextInt();
		product.AddProducts(quantity);
		
		System.out.print("Updated data: ");
		System.out.println(product);
		
		System.out.println("Remove Product in Stock: ");
		quantity = sc.nextInt();
		product.RemoveProducts(quantity);
		
		System.out.print("Updated data: ");
		System.out.println(product);
		
		
		
		
		sc.close();

	}

}

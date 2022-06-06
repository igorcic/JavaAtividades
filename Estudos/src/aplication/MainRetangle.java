package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class MainRetangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rectangle rectangle = new Rectangle();
		System.out.println("Enter rectangle width and height: ");
		rectangle.height = sc.nextDouble();
		rectangle.width = sc.nextDouble();
		
		System.out.printf("Area: %.2f%n", rectangle.Area());
		System.out.printf("Perimeter: %.2f%n", rectangle.Perimeter());
		System.out.printf("Diagonal: %.2f%n", rectangle.Diagonal());
		
		
		
		
		sc.close();

	}

}

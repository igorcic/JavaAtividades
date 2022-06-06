package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Banco;

public class MainBanco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int account;
		String name;
		double value;

		
		System.out.println("Enter account number: ");
		account = sc.nextInt();
		System.out.println("Enter account holder");
		name = sc.nextLine();
		System.out.println("Is there na initial deposit(y/n)? ");
		String opt = sc.nextLine();
		sc.nextLine();
		if(opt == "y") {
			System.out.println("Enter initial deposit value: ");
			value = sc.nextDouble();
			Banco banco = new Banco(account,name,value);
			
			System.out.println("Enter a deposit value: ");
			value = sc.nextDouble();
			banco.Deposito(account, value);
			
			
			System.out.println("Enter a withdraw value: ");
			value = sc.nextDouble();
			banco.Saque(account, value);
			
		}else {
			Banco banco = new Banco(account,name);
			
			System.out.println("Enter a deposit value: ");
			value = sc.nextDouble();
			banco.Deposito(account, value);
			
			
			System.out.println("Enter a withdraw value: ");
			value = sc.nextDouble();
			banco.Saque(account, value);
		}
		
		
		
		
		
		
		
		
		sc.close();
	}

}

package entities;

public class Employee {
	public String name;
	public double grossSalario;
	public double tax;
	
	
	public double NetSalary() {
		return grossSalario - tax;
	}
	
	public void IncreaseSalary(double percentage) {
		grossSalario += (grossSalario * (percentage/100));
	}
	
	public String toString() {
		return name + ", $ " + String.format("%.2f", NetSalary());
	}

}

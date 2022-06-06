package entities;

public class Banco {
	private int numberCount;
	public String nome;
	private double valuein;
	
	
	public Banco() {
		
	
	}
	
	public Banco(int numberCount, String nome, double valuein) {
	
		this.numberCount = numberCount;
		this.nome = nome;
		this.valuein = valuein;
	}
	
	public Banco(int numberCount, String nome) {
		
		this.numberCount = numberCount;
		this.nome = nome;
	}
	
	
	public int getNumberCount() {
		return numberCount;
	}
	public void setNumberCount(int numberCount) {
		this.numberCount = numberCount;
	}

	public double getValuein() {
		return valuein;
	}
	public void setValuein(double valuein) {
		this.valuein = valuein;
	}
	
	public void Saque(int numberCount, double valuer) {
		if(this.numberCount == numberCount) {
			this.valuein -= (valuer + 5);
		}else {
			System.out.println("Numero da conta incorreto");
		}
		
	}
	public void Deposito(int numberCount, double valuer) {
		if(this.numberCount == numberCount) {
			this.valuein += valuer;
		}else {
			System.out.println("Numero da conta incorreto");
		}
	}
	
	
}

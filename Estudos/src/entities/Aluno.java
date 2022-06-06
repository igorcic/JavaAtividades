package entities;

public class Aluno {
	public String nome, aprovacao;
	public double n1, n2, n3, nr, nf;
	
	
	
	
	
	public void NotaFinal() {
		nf =  (n1 + n2 + n3);
		
	}
	
	public void Resultado() {
		double nota = 100;
		if(nf < 60) {
			aprovacao = "Failed";
			nr = nota = nf;
		}else {
			aprovacao = "Pass";
		}
	}
	public String toString() {
		if(nf < 60) {
			return "Final Grade = " + nf + aprovacao;
		}else {
			return "Final Grade = " + nf + aprovacao + "Missing "+
		             nr + " Points";
		}
	}
}

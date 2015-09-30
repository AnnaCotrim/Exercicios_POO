package fatec;

public class Reta {
	// cria variaveis visiveis só nessa classe
	private double a , b;
	// cria construtor para reta ser y = x 
	Reta (){
		this.a = 1;
		this.b = 0;
	}
	Reta (double a, double b) {
		this.a = a;
		this.b = b;
	}
	//gerar getters and setters
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public void imprimeReta(){
		System.out.println("Coeficientes da Reta: \n Angular: "+a+"\n Linear: "+b);
	}
	
	
	
}

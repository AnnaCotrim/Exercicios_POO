package fatec;

public class Reta {
	// cria variaveis visiveis só nessa classe
	private double a, b;

	// cria construtor para reta ser y = x
	Reta() {
		this.a = 1;
		this.b = 0;
	}

	Reta(double a, double b) {
		this.a = a;
		this.b = b;
	}
	

	// gerar getters and setters
	public double getCoeficienteAngular() {
		return a;
	}

	public void setCoeficienteAngular(double a) {
		this.a = a;
	}

	public double getCoeficienteLinear() {
		return b;
	}

	public void setCoeficienteLinear(double b) {
		this.b = b;
	}

	public void imprimeReta() {
		System.out.println("Coeficientes da Reta: \n Angular: " + a + "\n Linear: " + b);
	}

	public Reta retornaNovaRetaComMesmoCoeficienteA(double b) {
		Reta novaReta = new Reta(this.a, b);
		return novaReta;
	}

	public Reta retornaNovaRetaComMesmoLinear(double a) {
		Reta novaReta = new Reta(a, this.b);
		return novaReta;
	}

}

package fatec;

public class Main {
	public static void main(String[] args) {
		Ponto inicio = new Ponto(2.0,2.0);
		Circulo bolinha = new Circulo(2.0,inicio);
		bolinha.imprimeCirculo();
		bolinha.imprimeAreaCirculo();
	}
}

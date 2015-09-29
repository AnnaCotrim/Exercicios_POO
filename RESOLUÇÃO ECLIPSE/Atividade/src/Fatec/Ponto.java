package Fatec;

public class Ponto {
	// inicia variaveis 
	public double x , y;
	// inicia default 
	Ponto() {
		this.x = 1.0;
		this.y = 1.0;
	}
	//recebe ordenada e abscissa
	Ponto(double x , double y){
		this.x = x;
		this.y = y;
	}
	// cria clone do ponto dado
	Ponto(Ponto P){
		this.x = P.x;
		this.y = P.y;
	}
	// metodo imprime ponto
	
	public void imprimePonto(){
		System.out.println("\nMetodo Imprime Pontos");
		System.out.println("\n X = " + this.x);
		System.out.println("\n Y = " + this.y);
	}
	// retorna abscissa
	public void retornaAbscissa(){
		System.out.println("\n X = " + this.x);
	}
	//retorna ordenada
	public void retornaOrdenada(){
		System.out.println("\n Y = " + this.y);
	}
	//altera abscissa
	public void alteraAbscissa(double x){
		this.x = x;
		System.out.println("Abscissa alterada");
		System.out.println("\n X = " + this.x);
	}
	// altera ordenada
	public void alteraOrdenada(double y){
		this.y = y;
		System.out.println("Ordenada alterada");
		System.out.println("\n Y = " + this.y);
	}
	//deslocamento horizontal 
	public void deslocamentoHorizontal(double x){
		this.x = this.x + x;
		System.out.println("Abscissa deslocada");
		System.out.println("\n X = " + this.x);
	}
	//deslocamento vertical
	public void deslocamentoVertical(double y){
		this.y = this.y + y;
		System.out.println("Ordenada deslocada");
		System.out.println("\n Y = " + this.y);
	}
	//calcula distancia ate a origem 
	public double distanciaOrigem(){
		return (Math.sqrt(Math.pow(x, 2.0) + Math.pow(y, 2.0)));
	}
	// imprime distancia a origem
	public void imprimeDistanciaOrigem(){
		System.out.println("A distancia do ponto ("+x+","+y+") � origem �: " + this.distanciaOrigem());
		;
	}
	// ponto simetrico a X
	public Ponto simetricoX(){
		Ponto P = new Ponto(this);
		P.y = -this.y;
		return P;
	}
	//ponto simetrico a y
	public Ponto simetricoX(){
		Ponto P = new Ponto(this);
		P.x = -this.x;
		return P;
	}
	
	
}

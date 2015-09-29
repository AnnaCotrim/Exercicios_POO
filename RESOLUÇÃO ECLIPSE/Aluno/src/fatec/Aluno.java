package fatec;

import javax.swing.JOptionPane;

public class Aluno {
	// variaveis
	public String nome, endereco, cpf;
	//construtor aluno
	Aluno(){
		this.nome = JOptionPane.showInputDialog("Digite seu nome: ");
		this.endereco = JOptionPane.showInputDialog("Digite seu endereço: ");
		this.cpf = JOptionPane.showInputDialog("Digite seu cpf: ");
	}
	//imprime dados
	public void imprimeDados(){
		JOptionPane.showMessageDialog(null, "\n Nome do Aluno: " + this.nome + 
										"\n Endereço: " + this.endereco + 
										"\n CPF: " + this.cpf + "\n");
	}
	public static void main(String[] args) {
		Aluno anna = new Aluno();
//		//pede dados
//		anna.nome = JOptionPane.showInputDialog("Digite seu nome: ");
//		anna.endereco = JOptionPane.showInputDialog("Digite seu endereço: ");
//		anna.cpf = JOptionPane.showInputDialog("Digite seu cpf: ");
		// imprime dados 
		
		anna.imprimeDados();
	}
	
}

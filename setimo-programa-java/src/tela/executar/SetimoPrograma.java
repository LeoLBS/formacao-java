package tela.executar;

import javax.swing.JOptionPane;

public class SetimoPrograma {
	public static void main(String[] args) {
		
		//Utilizando o JOptionPane para receber os dados tipo input
		
		String balas = JOptionPane.showInputDialog("Informe o número de balas: ");
		String pessoa = JOptionPane.showInputDialog("Informe o número de pessoas: ");
		
		//Utilizando um Objeto do java para tornaro texto em número;
		
		double numeroBalas = Double.parseDouble(balas);
		double numeroPessoas = Double.parseDouble(pessoa);
		
		//Realizando a divisao das balas em double, podendo ser feita com tratamento para int
		double numeroDivisao = numeroBalas / numeroPessoas;
		
		//Utilizando o JOptionPane para a receber o tipo de confirmação
		int resposta = JOptionPane.showConfirmDialog(null, "Você deseja ver a resposta?");
				
		if(resposta == 0) {
			//Utilizando o JOptionPane para a saida de dados tipo Message
			JOptionPane.showMessageDialog(null, "Cada pessoa recebeu um total: " + numeroBalas + " balas!");
		}
		else if(resposta == 1 || resposta == 2) {
			JOptionPane.showMessageDialog(null, "Finalizado!!");
		}
		
	}
}

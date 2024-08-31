package tela.executar;

import javax.swing.JOptionPane;

public class OitavoPrograma {
	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		
		String nomePessoa;
		String idadePessoa;
		
		nomePessoa = JOptionPane.showInputDialog("Informe o nome da Pessoa: ");
		idadePessoa = JOptionPane.showInputDialog("Idade da Pessoa: ");
		
		int idadeNumerica = Integer.parseInt(idadePessoa);
		
		pessoa.setNomePessoa(nomePessoa);
		pessoa.setIdadePessoa(idadeNumerica);
		
		System.out.println("Pessoa: " + pessoa.getNomePessoa());
		System.out.println("Pessoa: " + pessoa.getIdadePessoa());
		
		System.out.println("Retorno: " + pessoa.toString()); // Descrição do objeto na memoria com o toString
	}
}

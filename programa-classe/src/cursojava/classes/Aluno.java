package cursojava.classes;

import javax.sql.rowset.serial.SerialException;
import javax.xml.crypto.Data;

//Criar uma classe, utilizar no singular, sendo a criação dessa classe o Aluno
public class Aluno {

	//Criando os atributos da classe Aluno
	private String nome;
	private int idade;
	private String dataNascimento;
	private String registroGeral;
	private String classe;
	private String dataMatricula;
	private int registroAluno;
	
	private double nota1;
	private double nota2;
	private double nota3;
	private double nota4;
	
	public Aluno() { //Criando um construtor da classe Aluno
		
	}
	//Podemos criar diferentes tipos de contrutores dentro de uma classe:
	public Aluno(String nome) { // Construtor que recebe só o nome vindo do seu objeto aluno2
		
		this.nome = nome;
	}
	public Aluno(String nome, int idade) { // Construtor que recebe só o nome e idade vindo do seu objeto aluno3
		this.nome = nome;
		this.idade = idade;
	}
	
	
	/* Trabalhando os metodos do tipo Getter e Setter */
	
	// Iniciando um Setter para receber os dados do atributo nome
	public void setNome(String nome) {
		this.nome = nome; // Utilizando o this para dizer que a variavel nome vem da classe;
	}
	
	//Iniciando um Getter para retornar o atributo nome
	public String getNome() {
		return nome;
	}
	
	//Criando as funções / metodos de notas
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	
	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}
	
	public double getCalculoMediaAluno() {
		return (nota1 + nota2 + nota3 + nota4) / 4;
	}
	
}

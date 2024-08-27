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
}

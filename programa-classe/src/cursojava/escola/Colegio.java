package cursojava.escola;

//Importando o pacote onde esta minha classe Aluno
import cursojava.classes.Aluno;

public class Colegio {
	public static void main(String[] args) {
		
		//Iniciando um objeto aluno1 da classe Aluno
		Aluno aluno1 = new Aluno();
		
		//Chamando o metodo setNome e aplicando o parametro "Leonardo"
		aluno1.setNome("Leonardo");
		System.out.println("Nome: " + aluno1.getNome());//Chamando o metodo getNome para retornar o valor atribuido no atributo
		
		// new Aluno() é uma instancia
		Aluno aluno2 = new Aluno("Leo");
		
		// aluno3 é uma referencia para o objeto Aluno
		Aluno aluno3 = new Aluno("João",18);
		
		
		
		Boletim boletim = new Boletim();	
		
		boletim.setRecebeNotas();
		
	}
}

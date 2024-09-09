package colegio.curso.materia.matematica.classe;

public class SalaAulaMatematica {
	private String materiaSala;
	private int numeroSala;
	private int quantidadeAlunos;
	
	AlunosMatematica alunosMatematica = new AlunosMatematica();
	
	public void setAlunosMatematica(AlunosMatematica alunosMatematica) {
		this.alunosMatematica = alunosMatematica;
	}
	public AlunosMatematica getAlunosMatematica() {
		return alunosMatematica;
	}
	
	public void setMateriaSala(String materiaSala) {
		this.materiaSala = materiaSala;
	}
	public String getMateriaSala() {
		return materiaSala;
	}
	public void setNumeroSala(int numeroSala) {
		this.numeroSala = numeroSala;
	}
	public int getNumeroSala() {
		return numeroSala;
	}
	public void setQuantidadeAlunos(int quantidadeAlunos) {
		this.quantidadeAlunos = quantidadeAlunos;
	}
	public int getQuantidadeAlunos() {
		return quantidadeAlunos;
	}
}

package colegio.curso.materia.matematica.classe;

public class AlunosMatematica {
	private String[] nomesAlunos = new String[10];
	private int[] idadeAluno = new int[10];
	private String[] dataInicioAluno = new String[10];
	private int[] numeroRegistroAluno = new int[10];
	
	
	public void setNomeAluno(String nomesAlunos, int numeroAluno) {
		this.nomesAlunos[numeroAluno] = nomesAlunos;
	}
	public void setIdadeAluno(int idadeAluno) {
		this.idadeAluno[0] = idadeAluno;
	}
	public void setDataInicioAluno(String dataInicioAluno) {
		this.dataInicioAluno[0] = dataInicioAluno;
	}
	public void setNumeroRegistroAluno(int numeroRegistroAluno) {
		this.numeroRegistroAluno[0] = numeroRegistroAluno;
	}

}

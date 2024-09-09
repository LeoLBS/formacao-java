package colegio;

import colegio.curso.materia.matematica.classe.SalaAulaMatematica;

import javax.swing.JOptionPane;

public class Colegio {
	public static void main(String[] args) {
		SalaAulaMatematica salaAulaMatematica = new SalaAulaMatematica();
		
		String nomeAluno = "";
		String recNumeroAluno = "";
		
		nomeAluno = JOptionPane.showInputDialog("Informe o nome do Aluno: ");
		recNumeroAluno = JOptionPane.showInputDialog("Informe o numero do Aluno: ");
		
		int numeroAluno = Integer.parseInt(recNumeroAluno);
		salaAulaMatematica.getAlunosMatematica().setNomeAluno(nomeAluno, numeroAluno);
	}
}

package cursojava.escola;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class Boletim {
	String nota1;
	String nota2;
	String nota3;
	String nota4;
	
	double nota1Numerica;
	double nota2Numerica;
	double nota3Numerica;
	double nota4Numerica;
	
	Aluno alunoNota = new Aluno(); 
	
	public void setRecebeNotas() {
	
		this.nota1 = JOptionPane.showInputDialog("Informe a nota 1 do Aluno: ");
		this.nota2 = JOptionPane.showInputDialog("Informe a nota 2 do Aluno: ");
		this.nota3 = JOptionPane.showInputDialog("Informe a nota 3 do Aluno: ");
		this.nota4 = JOptionPane.showInputDialog("Informe a nota 4 do Aluno: ");
		
		this.nota1Numerica = Double.parseDouble(nota1);
		this.nota2Numerica = Double.parseDouble(nota2);
		this.nota3Numerica = Double.parseDouble(nota3);
		this.nota4Numerica = Double.parseDouble(nota4);
		
		setNotasAlunos();
	}
	
	
	public void setNotasAlunos() {
		
		alunoNota.setNota1(nota1Numerica);
		alunoNota.setNota2(nota2Numerica);
		alunoNota.setNota3(nota3Numerica);
		alunoNota.setNota4(nota4Numerica);
		JOptionPane.showMessageDialog(null, "Media do Aluno foi: " + alunoNota.getCalculoMediaAluno());
	}
	
}

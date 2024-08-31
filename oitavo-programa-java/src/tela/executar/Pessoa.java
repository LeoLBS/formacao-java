package tela.executar;

public class Pessoa {
	private String nomePessoa;
	private int idadePessoa;
	
	
	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}
	
	public String getNomePessoa() {
		return nomePessoa;
	}
	
	public void setIdadePessoa(int idadePessoa) {
		this.idadePessoa = idadePessoa;
	}
	
	public int getIdadePessoa() {
		return idadePessoa;
	}

	@Override
	public String toString() {
		return "Pessoa [nomePessoa=" + getNomePessoa() + ", idadePessoa=" + idadePessoa + "]";
	}
	
	
}

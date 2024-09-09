package mercado.pessoa;

import java.util.ArrayList;
import java.util.List;

import mercado.lista.ListaCompras;

public class Pessoa {

	private List<ListaCompras> listas = new ArrayList<ListaCompras>();
	
	public void setListas(List<ListaCompras> listas) {
		this.listas = listas;
	}
	
	public List<ListaCompras> getListas() {
		return listas;
	}
	
	public int getTotalProdutos() {
		
		int somaProdutos = 0;
		
		for(ListaCompras lista : listas) {
			somaProdutos += lista.getQuantidadeProdutos();
		}
		
		return somaProdutos;
	}
	
}

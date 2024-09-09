package mercado.compra;

import mercado.lista.ListaCompras;
import mercado.pessoa.Pessoa;

public class Compra {
	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		
		ListaCompras listaCompras1 = new ListaCompras();
		
		listaCompras1.setListaCompra("Pão");
		listaCompras1.setQuantidadeProdutos(1);
		
		
		ListaCompras listaCompras2 = new ListaCompras();
		
		listaCompras2.setListaCompra("Café");
		listaCompras2.setQuantidadeProdutos(3);
		
		
		ListaCompras listaCompras3 = new ListaCompras();
		
		listaCompras3.setListaCompra("Tomate");
		listaCompras3.setQuantidadeProdutos(5);
		
		
		ListaCompras listaCompras4 = new ListaCompras();
		
		listaCompras4.setListaCompra("Leite");
		listaCompras4.setQuantidadeProdutos(2);
		
		
		pessoa.getListas().add(listaCompras1);
		pessoa.getListas().add(listaCompras2);
		pessoa.getListas().add(listaCompras3);
		pessoa.getListas().add(listaCompras4);
		
		System.out.println("Total de produtos: " + pessoa.getTotalProdutos());
		System.out.println(listaCompras1); //Mostrando o toString do listaCompras1
		
	}
}

package mercado.lista;

import java.util.Objects;

public class ListaCompras {

	private String listaCompra;
	private int quantidadeProdutos;

	public String getListaCompra() {
		return listaCompra;
	}

	public void setListaCompra(String listaCompraString) {
		this.listaCompra = listaCompraString;
	}

	public int getQuantidadeProdutos() {
		return quantidadeProdutos;
	}

	public void setQuantidadeProdutos(int quantidadeProdutos) {
		this.quantidadeProdutos = quantidadeProdutos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(quantidadeProdutos, listaCompra);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ListaCompras other = (ListaCompras) obj;
		return quantidadeProdutos == other.quantidadeProdutos
				&& Objects.equals(listaCompra, other.listaCompra);
	}

	@Override
	public String toString() {
		return "Lista [listaCompraString=" + listaCompra + ", quantidadeProdutos=" + quantidadeProdutos + "]";
	}

}

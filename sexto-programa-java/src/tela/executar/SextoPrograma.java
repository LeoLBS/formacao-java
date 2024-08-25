package tela.executar;

public class SextoPrograma {
	public static void main(String[] args) {
		
		//Buscando o resto da divisão %
		
		double balas = 11;
		double pessoas = 2;
		
		double restoBala = balas % pessoas;  // Operador MOD(%) ou Modulo;
		
		System.out.println("Resto das balas foi: " + restoBala);
		
		//Utilizando o MOD para retornar os numeros par de 0 a 10
		for(int numero = 0; numero <= 10; numero++) {
			
			if(numero % 2 == 0) {
				System.out.println("Numero par: " + numero);
			}
			else {
				System.out.println("Numero impar: " + numero);
			}
		}
	
	}
}

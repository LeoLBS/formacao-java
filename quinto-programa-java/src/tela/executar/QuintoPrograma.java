package tela.executar;

public class QuintoPrograma {
	
	public static String contar() {
		
		return "Caiu na Funcao";
	}
	
	
	public static void main(String[] args) {
		
		for(int i = 0; i <= 20; i++) {
			
			System.out.println("");
			
			for(int x = 0; x != i; x++) {
				System.out.print("*");
			}
		}
		
		
		/*Estrutura de repetição FOR com Break*/
		
		for(int a = 0; a <= 12; a++){
			
			if(a == 5) {
				System.out.println(" ");
				System.out.println("Parando no 5!!");
				break;
			}
		}
		
		/*Estrutura de repetição FOR com Continue; */
		
		for(int a = 0; a <= 12; a++){
			
			if(a == 5 || a == 8) {
				System.out.println(" ");
				System.out.println("Retorno: " + contar());
				continue; 	//Ao utilizar o continue ele volta para o inicio do for, sem rodar o println de baixo
			}
			System.out.println("Rodando... " + a);
		}
	}
}

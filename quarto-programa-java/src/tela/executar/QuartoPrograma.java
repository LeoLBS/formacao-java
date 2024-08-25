package tela.executar;

public class QuartoPrograma {
	
	static String variavelGlobal = "Variavel do tipo Global, vista por todos!";
	
	public static void main(String[] args) {
		
		String variavelLocal = "Variavel do tipo Local, vista somente dentro da Main";
		System.out.println(variavelLocal);
		System.out.println(variavelGlobal);
	}
}

package aula;

public class QuintaAula {
	public static void main(String [] args) {
		String str = "Isto � uma String";
		String xyz = new String("Isto � uma String do Java");
		
		if( str==xyz ) System.out.println("IGUAL");
		else System.out.println("DIFERENTE");
		
		if ( str.equals ( xyz ) ) {
			//MANEIRA CORRETA DE SE COMPARAR O CONTE�DO DAS STRINGS
		}
			System.out.println( "Tamanho da String" + str.length() );
			System.out.println( "Substring: " + str.substring(0,10));
			System.out.println("Caracter na posi��o 5: " + str.charAt(5));
			
	
	 str = "Isto � uma String do Java";
			// O m�todo split quebra a String e v�rias outras, pelo separador desejado
			String[] palavras = str.split("");
			int i = str.indexOf("uma"); //retorna o �ndice da palavra na String
			if(str.startsWith("Ol�") || str.endsWith("Mundo!") ) {
			//testa o come�o e o fim da String - retorna boolean
			}	
			str = str.trim(); //elimina os espa�os em branco no in�cio e fim
			
			str = str.replace('a', '@'); // substitui os caracteres
			
			//substitui uma palavra(usa express�es regulares)
			str = str.replaceAll("String", "Cadeia de caracteres");
		}
	
	

}
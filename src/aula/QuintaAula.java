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
			
			String sar = "Isto � uma String do Java";
			// O m�todo split quebra a String e v�rias outras, pelo separador desejado
			String[] palavras = sar.split("");
			int i = sar.indexOf("uma"); //retorna o �ndice da palavra na String
			if(sar.startsWith("Ol�") || sar.endsWith("Mundo!") ) {
			//testa o come�o e o fim da String - retorna boolean
			}	
			sar = sar.trim(); //elimina os espa�os em branco no in�cio e fim
			
			sar = str.replace('a', '@'); // substitui os caracteres
			
			//substitui uma palavra(usa express�es regulares)
			sar = sar.replaceAll("String", "Cadeia de caracteres");
		}
	
	

}
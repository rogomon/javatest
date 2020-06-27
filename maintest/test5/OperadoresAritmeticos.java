package rodrigo.cursojava.aula13;

public class OperadoresAritmeticos {

	public static void main(String[] args) {

		int resultado = 1 + 2;
		System.out.println(resultado);
		
		resultado = resultado - 1;
		System.out.println(resultado);
		
		resultado = resultado * 2;
		System.out.println(resultado);
		
		resultado = resultado / 2;
		System.out.println(resultado);
		
		resultado = resultado + 8;
		System.out.println(resultado);
		
		resultado = resultado % 7;
		System.out.println(resultado);
		
		/*String primeiraPalavra = "Esta é uma String ";
		String segundaPalavra = "concatenada";
		String terceiraPalavra = primeiraPalavra + segundaPalavra;
		System.out.println(terceiraPalavra);*/
		
		resultado++;
		System.out.println(resultado); //4
		System.out.println(++resultado); //5
		System.out.println(++resultado); //6
		
		resultado +=1; //7
		System.out.println(resultado); //7
		System.out.println(++resultado);
		
	}

}

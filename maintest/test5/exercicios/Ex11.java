package maintest.test5.exercicios;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		// 11.Fa�a um Programa que pe�a 2 n�meros inteiros e um n�mero real. 
		// Calcule e mostre: 
		// a. o produto do dobro do primeiro com metade do segundo.
		// b. a soma do triplo do primeiro com o terceiro.
		// c. o terceiro elevado ao cubo.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Exerc�cios solicitados com base nos n�meros que forem digitados. Digite 2 n�meros inteiros e 1 n�mero real para obter os resultados solicitados: ");
		
		double int1 = scan.nextDouble();
		double int2 = scan.nextDouble();
		double real = scan.nextDouble();
		
		double resultado1 = (int1 * 2) * (int2 / 2);
		double resultado2 = (int1 * 3) + real;
		double resultado3 = real * real * real;
		
		System.out.println("Os resultados s�o: ");
		System.out.println(resultado1);
		System.out.println(resultado2);
		System.out.println(resultado3);

		scan.close();
	}

}

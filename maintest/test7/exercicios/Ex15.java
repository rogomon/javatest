package maintest.test7.exercicios;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		
		// 15.Fa�a um Programa que pe�a os 3 lados de um tri�ngulo.
		// O programa dever� informar se os valores podem ser um tri�ngulo.
		// Indique, caso os lados formem um tri�ngulo, se o mesmo �: equil�tero, is�sceles ou escaleno.
		// Dicas: o Tr�s lados formam um tri�ngulo quando a soma de quaisquer dois lados for maior que o terceiro;
		// Tri�ngulo Equil�tero: tr�s lados iguais;
		// Tri�ngulo Is�sceles: quaisquer dois lados iguais;
		// Tri�ngulo Escaleno: tr�s lados diferentes;3.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite as 3 medidas do tri�ngulo: ");
		double lado1 = scan.nextDouble();
		double lado2 = scan.nextDouble();
		double lado3 = scan.nextDouble();
		
		if (lado1 > 0 && lado2 > 0 && lado3 > 0 && lado1 == lado2 && lado2 == lado3) {
			System.out.println("Os valores poderm ser de um tri�ngulo equil�tero.");
		}	
			else if (lado1 > 0 && lado2 > 0 && lado3 > 0 && lado1 + lado2 > lado3 && lado1 == lado2 || lado2 == lado3) {
			System.out.println("Os valores poderm ser de um tri�ngulo is�sceles.");
		}
			else if (lado1 > 0 && lado2 > 0 && lado3 > 0 && lado1 + lado3 > lado2 && lado1 == lado2 || lado2 == lado3) {
			System.out.println("Os valores poderm ser de um tri�ngulo is�sceles.");
		}
			else if (lado1 > 0 && lado2 > 0 && lado3 > 0 && lado2 + lado3 > lado1 && lado1 == lado2 || lado2 == lado3) {
			System.out.println("Os valores poderm ser de um tri�ngulo is�sceles.");
		}
			else if (lado1 > 0 && lado2 > 0 && lado3 > 0 && lado1 + lado2 > lado3) {
			System.out.println("Os valores poderm ser de um tri�ngulo escaleno.");
		}	
			else if (lado1 > 0 && lado2 > 0 && lado3 > 0 && lado1 + lado3 > lado2) {
			System.out.println("Os valores poderm ser de um tri�ngulo escaleno.");
		}
			else if (lado1 > 0 && lado2 > 0 && lado3 > 0 && lado2 + lado3 > lado1) {
			System.out.println("Os valores poderm ser de um tri�ngulo escaleno.");
		}
			else {
				System.out.println("Os valores n�o poderm ser de um tri�ngulo.");
				
				scan.close();
		}
		
		
	}

}

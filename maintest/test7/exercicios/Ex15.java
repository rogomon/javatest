package maintest.test7.exercicios;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		
		// 15.Faça um Programa que peça os 3 lados de um triângulo.
		// O programa deverá informar se os valores podem ser um triângulo.
		// Indique, caso os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou escaleno.
		// Dicas: o Três lados formam um triângulo quando a soma de quaisquer dois lados for maior que o terceiro;
		// Triângulo Equilátero: três lados iguais;
		// Triângulo Isósceles: quaisquer dois lados iguais;
		// Triângulo Escaleno: três lados diferentes;3.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite as 3 medidas do triângulo: ");
		double lado1 = scan.nextDouble();
		double lado2 = scan.nextDouble();
		double lado3 = scan.nextDouble();
		
		if (lado1 > 0 && lado2 > 0 && lado3 > 0 && lado1 == lado2 && lado2 == lado3) {
			System.out.println("Os valores poderm ser de um triângulo equilátero.");
		}	
			else if (lado1 > 0 && lado2 > 0 && lado3 > 0 && lado1 + lado2 > lado3 && lado1 == lado2 || lado2 == lado3) {
			System.out.println("Os valores poderm ser de um triângulo isósceles.");
		}
			else if (lado1 > 0 && lado2 > 0 && lado3 > 0 && lado1 + lado3 > lado2 && lado1 == lado2 || lado2 == lado3) {
			System.out.println("Os valores poderm ser de um triângulo isósceles.");
		}
			else if (lado1 > 0 && lado2 > 0 && lado3 > 0 && lado2 + lado3 > lado1 && lado1 == lado2 || lado2 == lado3) {
			System.out.println("Os valores poderm ser de um triângulo isósceles.");
		}
			else if (lado1 > 0 && lado2 > 0 && lado3 > 0 && lado1 + lado2 > lado3) {
			System.out.println("Os valores poderm ser de um triângulo escaleno.");
		}	
			else if (lado1 > 0 && lado2 > 0 && lado3 > 0 && lado1 + lado3 > lado2) {
			System.out.println("Os valores poderm ser de um triângulo escaleno.");
		}
			else if (lado1 > 0 && lado2 > 0 && lado3 > 0 && lado2 + lado3 > lado1) {
			System.out.println("Os valores poderm ser de um triângulo escaleno.");
		}
			else {
				System.out.println("Os valores não poderm ser de um triângulo.");
				
				scan.close();
		}
		
		
	}

}

package rodrigo.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		// test 1. Faça um Programa que peça dois números e imprima o maior deles.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite 1 número: ");
		double numero1 = scan.nextDouble();
		
		System.out.println("Digite outro número: ");
		double numero2 = scan.nextDouble();
		
		if (numero1 > numero2) {
			System.out.println("O maior número é: " + numero1);
		}	else {
			System.out.println("O maior número é: " + numero2);
		}
		
	}
}

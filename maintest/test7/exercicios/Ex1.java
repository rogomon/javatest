package rodrigo.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		// test 1. Fa�a um Programa que pe�a dois n�meros e imprima o maior deles.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite 1 n�mero: ");
		double numero1 = scan.nextDouble();
		
		System.out.println("Digite outro n�mero: ");
		double numero2 = scan.nextDouble();
		
		if (numero1 > numero2) {
			System.out.println("O maior n�mero �: " + numero1);
		}	else {
			System.out.println("O maior n�mero �: " + numero2);
		}
		
	}
}

package rodrigo.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		
		// 18.Faça um Programa que peça um número inteiro e determine se ele é par ou impar. Dica: utilize o operador módulo (resto da divisão). 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro:");
		int num = scan.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("É número par.");
		}	
			else {
			System.out.println("É número ímpar.");
		}

	}

}

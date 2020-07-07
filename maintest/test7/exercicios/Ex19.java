package maintest.test7.exercicios;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		
		// 19.Faça um Programa que leia 2 números e em seguida pergunte ao usuário qual operação ele deseja realizar.
		// O resultado da operação deve ser acompanhado de uma frase que diga se o número é: . par ou ímpar; a. positivo ou negativo;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite 2 números:");
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		
		
		System.out.println("Digite 1 ou 2 para uma das seguintes opções: Opção 1: Obter o resultado da subtração do valor do primeiro número no segundo número. Opção 2: Obter o resultado da adição do valor do primeiro número com o valor do segundo número.");
		int opcao = scan.nextInt();
		double resultado1 = num2 - num1;
		double resultado2 = num2 + num1;
		
		if (opcao == 1 && resultado1 % 2 == 0 && resultado1 > 0) {
			System.out.println("Resultado: " + resultado1 + " . O valor é positivo e par");
		}	
			else if (opcao == 1 && resultado1 % 2 == 0 && resultado1 < 0) {
			System.out.println("Resultado: " + resultado1 + " . O valor é negativo e par");
		}	
			else if (opcao == 1 && resultado1 % 2 != 0 && resultado1 >0) {
			System.out.println("Resultado: " + resultado1 + " . O valor é positivo e ímpar");
		}	
			else if (opcao == 1 && resultado1 % 2 != 0 && resultado1 < 0) {
			System.out.println("Resultado: " + resultado1 + " . O valor é negativo e ímpar");
		}	
			else if (opcao == 2 && resultado2 % 2 == 0 && resultado2 > 0) {
			System.out.println("Resultado: " + resultado2 + " . O valor é positivo e par");
		}	
			else if (opcao == 2 && resultado2 % 2 == 0 && resultado2 < 0) {
			System.out.println("Resultado: " + resultado2 + " . O valor é negativo e par");
		}	
			else if (opcao == 2 && resultado2 % 2 != 0 && resultado2 > 0) {
			System.out.println("Resultado: " + resultado2 + " . O valor é positivo e ímpar");
		}	
			else if (opcao == 2 && resultado2 % 2 != 0 && resultado2 < 0) {
			System.out.println("Resultado: " + resultado2 + " . O valor é negativo e ímpar");
		}	
			else {
			System.out.println("Opção inválida");
		}
		scan.close();
	}

}

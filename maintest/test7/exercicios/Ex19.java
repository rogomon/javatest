package maintest.test7.exercicios;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		
		// 19.Fa�a um Programa que leia 2 n�meros e em seguida pergunte ao usu�rio qual opera��o ele deseja realizar.
		// O resultado da opera��o deve ser acompanhado de uma frase que diga se o n�mero �: . par ou �mpar; a. positivo ou negativo;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite 2 n�meros:");
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		
		
		System.out.println("Digite 1 ou 2 para uma das seguintes op��es: Op��o 1: Obter o resultado da subtra��o do valor do primeiro n�mero no segundo n�mero. Op��o 2: Obter o resultado da adi��o do valor do primeiro n�mero com o valor do segundo n�mero.");
		int opcao = scan.nextInt();
		double resultado1 = num2 - num1;
		double resultado2 = num2 + num1;
		
		if (opcao == 1 && resultado1 % 2 == 0 && resultado1 > 0) {
			System.out.println("Resultado: " + resultado1 + " . O valor � positivo e par");
		}	
			else if (opcao == 1 && resultado1 % 2 == 0 && resultado1 < 0) {
			System.out.println("Resultado: " + resultado1 + " . O valor � negativo e par");
		}	
			else if (opcao == 1 && resultado1 % 2 != 0 && resultado1 >0) {
			System.out.println("Resultado: " + resultado1 + " . O valor � positivo e �mpar");
		}	
			else if (opcao == 1 && resultado1 % 2 != 0 && resultado1 < 0) {
			System.out.println("Resultado: " + resultado1 + " . O valor � negativo e �mpar");
		}	
			else if (opcao == 2 && resultado2 % 2 == 0 && resultado2 > 0) {
			System.out.println("Resultado: " + resultado2 + " . O valor � positivo e par");
		}	
			else if (opcao == 2 && resultado2 % 2 == 0 && resultado2 < 0) {
			System.out.println("Resultado: " + resultado2 + " . O valor � negativo e par");
		}	
			else if (opcao == 2 && resultado2 % 2 != 0 && resultado2 > 0) {
			System.out.println("Resultado: " + resultado2 + " . O valor � positivo e �mpar");
		}	
			else if (opcao == 2 && resultado2 % 2 != 0 && resultado2 < 0) {
			System.out.println("Resultado: " + resultado2 + " . O valor � negativo e �mpar");
		}	
			else {
			System.out.println("Op��o inv�lida");
		}
		scan.close();
	}

}

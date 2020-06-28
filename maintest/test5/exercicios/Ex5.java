package maintest.test5.exercicios;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		// 5. Faça um Programa que converta metros para centímetros.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor (em metros) que você deseja converter para centimetros: ");
		
		double metro = scan.nextDouble();
		
		double centimetro = metro * 100;
		
		System.out.println("O resultado da conversão é: " + centimetro);
		
		

	}

}

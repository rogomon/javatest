package maintest.test5.exercicios;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		// 5. Fa�a um Programa que converta metros para cent�metros.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor (em metros) que voc� deseja converter para centimetros: ");
		
		double metro = scan.nextDouble();
		
		double centimetro = metro * 100;
		
		System.out.println("O resultado da convers�o �: " + centimetro);
		
		

	}

}

package maintest.test5.exercicios;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		
		// 9. Faça um Programa que peça a temperatura em graus Farenheit, transforme e mostre a temperatura em graus Celsius. 
		// o C = (5 * (F-32) / 9).
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Para converter em Celsius digite a temperatura em graus Farenheit: ");
		
		double F = scan.nextDouble();
		
		double C = (5 * (F-32) / 9);
		
		System.out.println("Resultado em Celsius: " + C);

	}

}

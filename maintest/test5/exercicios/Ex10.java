package maintest.test5.exercicios;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		// 10.Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Farenheit.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Para converter em Farenheit digite a temperatura em graus Celsius: ");
		
		double celsius = scan.nextDouble();
		
		double farenheit = (9 * celsius)/5 +32;
		
		System.out.println("Resultado em Farenheit: " + farenheit);
		

	}

}

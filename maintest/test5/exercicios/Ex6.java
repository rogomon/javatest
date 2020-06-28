package maintest.test5.exercicios;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		
		// 6. Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Para calcular a área do círculo favor digitar a medida do raio: ");
		
		double raio = scan.nextDouble();
		
		double area = 3.141592653589793 * (raio * raio);
		
		System.out.println("A área do círculo é: " + area);

	}

}

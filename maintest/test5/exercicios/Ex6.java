package maintest.test5.exercicios;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		
		// 6. Fa�a um Programa que pe�a o raio de um c�rculo, calcule e mostre sua �rea.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Para calcular a �rea do c�rculo favor digitar a medida do raio: ");
		
		double raio = scan.nextDouble();
		
		double area = 3.141592653589793 * (raio * raio);
		
		System.out.println("A �rea do c�rculo �: " + area);

	}

}

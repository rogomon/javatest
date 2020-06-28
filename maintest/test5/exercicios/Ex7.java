package maintest.test5.exercicios;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		
		// 7. Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Para calcular a área do quadrado digite a medida dos lados: ");
		
		double lado = scan.nextDouble();
		
		double area = lado * lado;
				
		double dobro = area * 2;
		
		System.out.println("O dobro da área do quardrado é: " + dobro);

		
	}

}

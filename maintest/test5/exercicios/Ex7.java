package maintest.test5.exercicios;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		
		// 7. Fa�a um Programa que calcule a �rea de um quadrado, em seguida mostre o dobro desta �rea para o usu�rio.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Para calcular a �rea do quadrado digite a medida dos lados: ");
		
		double lado = scan.nextDouble();
		
		double area = lado * lado;
				
		double dobro = area * 2;
		
		System.out.println("O dobro da �rea do quardrado �: " + dobro);

		
	}

}

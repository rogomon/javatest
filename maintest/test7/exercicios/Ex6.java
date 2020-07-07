package maintest.test7.exercicios;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		
		// 6. Faça um Programa que leia três números e mostre o maior deles.

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite 3 números diferentes:");
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		double num3 = scan.nextDouble();
		
		if (num1 > num2 && num1 > num3) {
			System.out.println("O maior número dos 3 foi: " + num1);
		}	else if (num2 > num1 && num2 > num3) {
			System.out.println("O maior número dos 3 foi: " + num2);
		}	else if (num3 > num1 && num3 > num2) {
				System.out.println("O maior número dos 3 foi: " + num3);
		}	else {
			System.out.println("Dados inválidos");
		}	
		scan.close();
	}

}

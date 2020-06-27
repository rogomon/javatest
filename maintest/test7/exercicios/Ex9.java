package rodrigo.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		
		// 9. Faça um Programa que leia três números e mostre-os em ordem decrescente.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite 3 números");
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		double num3 = scan.nextDouble();
		
		if (num1 > num2 && num2 > num3) {
			System.out.println(num1);
			System.out.println(num2);
			System.out.println(num3);
		}	else if (num1 > num3 && num3 > num2) {
			System.out.println(num1);
			System.out.println(num3);
			System.out.println(num2);
		}	else if (num2 > num1 && num1 > num3) {
			System.out.println(num2);
			System.out.println(num1);
			System.out.println(num3);
		}	else if (num2 > num3 && num3 > num1) {
			System.out.println(num2);
			System.out.println(num3);
			System.out.println(num1);
		}	else if (num3 > num1 && num1 > num2) {
			System.out.println(num3);
			System.out.println(num1);
			System.out.println(num2);
		}	else if (num3 > num2 && num2 > num1) {
			System.out.println(num3);
			System.out.println(num2);
			System.out.println(num1);
		}	else {
			System.out.println("Dados inválidos");
		}

	}

}

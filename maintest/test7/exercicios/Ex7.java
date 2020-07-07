package maintest.test7.exercicios;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		
		// 7. Faça um Programa que leia três números e mostre o maior e o menor deles.

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite 3 números diferentes:");
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		double num3 = scan.nextDouble();
		
		if (num1 > num2 && num2 > num3) {
			System.out.println("O maior é o " + num1 + " e o menor é o " + num3);
		}	else if (num2 > num1 && num1 > num3) {
			System.out.println("O maior é o " + num2 + " e o menor é o " + num3);
		}	else if (num3 > num2 && num2 > num1) {
			System.out.println("O maior é o " + num3 + " e o menor é o " + num1);
		}	else if (num1 > num3 && num3 > num2) {
			System.out.println("O maior é o " + num1 + " e o menor é o " + num2);
		}	else if (num2 > num3 && num3 > num1) {
			System.out.println("O maior é o " + num2 + " e o menor é o " + num1);
		}	else if (num3 > num1 && num1 > num2) {
			System.out.println("O maior é o " + num3 + " e o menor é o " + num2);
		}
		
		scan.close();
	}

}

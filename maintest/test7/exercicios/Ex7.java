package maintest.test7.exercicios;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		
		// 7. Fa�a um Programa que leia tr�s n�meros e mostre o maior e o menor deles.

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite 3 n�meros diferentes:");
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		double num3 = scan.nextDouble();
		
		if (num1 > num2 && num2 > num3) {
			System.out.println("O maior � o " + num1 + " e o menor � o " + num3);
		}	else if (num2 > num1 && num1 > num3) {
			System.out.println("O maior � o " + num2 + " e o menor � o " + num3);
		}	else if (num3 > num2 && num2 > num1) {
			System.out.println("O maior � o " + num3 + " e o menor � o " + num1);
		}	else if (num1 > num3 && num3 > num2) {
			System.out.println("O maior � o " + num1 + " e o menor � o " + num2);
		}	else if (num2 > num3 && num3 > num1) {
			System.out.println("O maior � o " + num2 + " e o menor � o " + num1);
		}	else if (num3 > num1 && num1 > num2) {
			System.out.println("O maior � o " + num3 + " e o menor � o " + num2);
		}
		
		scan.close();
	}

}

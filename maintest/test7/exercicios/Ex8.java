package rodrigo.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		
		// 8. Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar, 
		// sabendo que a decisão é sempre pelo mais barato.

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite 3 preços diferentes:");
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		double num3 = scan.nextDouble();
		
		if (num1 > num2 && num2 > num3) {
			System.out.println("Compre a $ " + num3);
		}	else if (num2 > num1 && num1 > num3) {
			System.out.println("Compre a $ " + num3);
		}	else if (num3 > num2 && num2 > num1) {
			System.out.println("Compre a $ " + num1);
		}	else if (num1 > num3 && num3 > num2) {
			System.out.println("Compre a $ " + num2);
		}	else if (num2 > num3 && num3 > num1) {
			System.out.println("Compre a $ " + num1);
		}	else if (num3 > num1 && num1 > num2) {
			System.out.println("Compre a $ " + num2);
		}	else {
			System.out.println("Dados inválidos");
		}
	}

}

package maintest.test7.exercicios;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		
		// 16.Faça um programa que calcule as raízes de uma equação do segundo grau, na forma ax2 + bx + c.
		// O programa deverá pedir os valores de a, b e c e fazer as consistências, informando ao usuário nas seguintes situações:
		// a. Se o usuário informar o valor de A igual a zero, a equação não é do segundo grau e o programa não deve pedir os demais valores, 
		// sendo encerrado; 
		// b. Se o delta calculado for negativo, a equação não possui raizes reais. Informe ao usuário e encerre o programa; 
		// c. Se o delta calculado for igual a zero a equação possui apenas uma raiz real; informe-a ao usuário;
		// d. Se o delta for positivo, a equação possui duas raiz reais; informe-as ao usuário;
		// b² - 4ac
		// (-b +-raiz delta)/2a
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Para ax2 + bx + c, digite os valores de a, b e c.");
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		double delta = (Math.pow(b, 2)) - (4*a*c);
		double x1 = (-b + Math.sqrt(delta)) / (2*a);
		double x2 = (-b - Math.sqrt(delta)) / (2*a);
		
		if (a==0) {
			System.out.println("A equação não é de segundo grau");
		}	
			else if (delta < 0) {
			System.out.println("A equação não possui raízes reais");
		}
			else if (delta == 0) {
			System.out.println("A equação possui apenas uma raiz real");
			System.out.println("X = " + x1);
		}
			else if (delta > 0) {
			System.out.println("A equação possui 2 raízes reais");
			System.out.println("X 1 = " + x1);
			System.out.println("X 2 = " + x2);
		}
		scan.close();
		
	}

}

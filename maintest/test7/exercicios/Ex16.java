package maintest.test7.exercicios;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		
		// 16.Fa�a um programa que calcule as ra�zes de uma equa��o do segundo grau, na forma ax2 + bx + c.
		// O programa dever� pedir os valores de a, b e c e fazer as consist�ncias, informando ao usu�rio nas seguintes situa��es:
		// a. Se o usu�rio informar o valor de A igual a zero, a equa��o n�o � do segundo grau e o programa n�o deve pedir os demais valores, 
		// sendo encerrado; 
		// b. Se o delta calculado for negativo, a equa��o n�o possui raizes reais. Informe ao usu�rio e encerre o programa; 
		// c. Se o delta calculado for igual a zero a equa��o possui apenas uma raiz real; informe-a ao usu�rio;
		// d. Se o delta for positivo, a equa��o possui duas raiz reais; informe-as ao usu�rio;
		// b� - 4ac
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
			System.out.println("A equa��o n�o � de segundo grau");
		}	
			else if (delta < 0) {
			System.out.println("A equa��o n�o possui ra�zes reais");
		}
			else if (delta == 0) {
			System.out.println("A equa��o possui apenas uma raiz real");
			System.out.println("X = " + x1);
		}
			else if (delta > 0) {
			System.out.println("A equa��o possui 2 ra�zes reais");
			System.out.println("X 1 = " + x1);
			System.out.println("X 2 = " + x2);
		}
		scan.close();
		
	}

}

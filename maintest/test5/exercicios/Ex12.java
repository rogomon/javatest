package maintest.test5.exercicios;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		// 12.Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal, usando a seguinte fórmula:
		// (72.7*altura) - 58
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Para calcular seu peso ideal digite sua altura em metros: ");
		
		double altura = scan.nextDouble();
		
		double pesoIdeal = (72.7 * altura) - 58;
		
		System.out.println("Seu peso ideal é: " + pesoIdeal);
		
		scan.close();
	}

}

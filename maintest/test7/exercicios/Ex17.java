package maintest.test7.exercicios;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		
		// 17.Faça um Programa que peça um número correspondente a um determinado ano e em seguida informe se este ano é ou não bissexto.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Para descobrir se o ano é bisexto, digite os 4 digítos correspondentes ao ano:");
		int ano = scan.nextInt();
		
		if (ano % 400 == 0 || ano % 4 == 0 && ano % 100 != 0) {
			System.out.println("É ano bissexto");
		}
			else {
				System.out.println("Não é ano bissexto");
			}
	}

}

package maintest.test7.exercicios;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		
		// 17.Fa�a um Programa que pe�a um n�mero correspondente a um determinado ano e em seguida informe se este ano � ou n�o bissexto.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Para descobrir se o ano � bisexto, digite os 4 dig�tos correspondentes ao ano:");
		int ano = scan.nextInt();
		
		if (ano % 400 == 0 || ano % 4 == 0 && ano % 100 != 0) {
			System.out.println("� ano bissexto");
		}
			else {
				System.out.println("N�o � ano bissexto");
			}
	}

}

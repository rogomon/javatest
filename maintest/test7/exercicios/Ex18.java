package rodrigo.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		
		// 18.Fa�a um Programa que pe�a um n�mero inteiro e determine se ele � par ou impar. Dica: utilize o operador m�dulo (resto da divis�o). 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um n�mero inteiro:");
		int num = scan.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("� n�mero par.");
		}	
			else {
			System.out.println("� n�mero �mpar.");
		}

	}

}

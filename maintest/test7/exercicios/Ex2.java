package rodrigo.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		// 2. Fa�a um Programa que pe�a um valor e mostre na tela se o valor � positivo ou negativo.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um valor: " );
		double valor = scan.nextDouble();
		
		if (valor > 0) {
			System.out.println(valor + " � positivo.");
		}	else {
			System.out.println(valor + " � negativo");
		}
		

	}

}

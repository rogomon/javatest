package maintest.test5.exercicios;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

		//2. Fa�a um Programa que pe�a um n�mero e ent�o mostre a mensagem O n�mero informado foi [n�mero].
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		
		String numero = scan.next();
		System.out.println("O n�mero informado foi: " + numero);

	}

}

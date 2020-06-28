package maintest.test5.exercicios;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

		//2. Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		
		String numero = scan.next();
		System.out.println("O número informado foi: " + numero);

	}

}

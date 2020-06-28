package maintest.test5.exercicios;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {

		//3. Faça um Programa que peça dois números e imprima a soma.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int primeiroNumero = scan.nextInt();
		
		System.out.println("Digite um segundo número: ");
		int segundoNumero = scan.nextInt();
		
		int somaDosDoisNumeros = primeiroNumero + segundoNumero;
		System.out.println("A soma dos dois números é: " + somaDosDoisNumeros);

	}

}

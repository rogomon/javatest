package maintest.test5.exercicios;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {

		//3. Fa�a um Programa que pe�a dois n�meros e imprima a soma.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		int primeiroNumero = scan.nextInt();
		
		System.out.println("Digite um segundo n�mero: ");
		int segundoNumero = scan.nextInt();
		
		int somaDosDoisNumeros = primeiroNumero + segundoNumero;
		System.out.println("A soma dos dois n�meros �: " + somaDosDoisNumeros);

	}

}

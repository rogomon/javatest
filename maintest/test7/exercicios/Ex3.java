package maintest.test7.exercicios;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// 3. Fa�a um Programa que verifique se uma letra digitada � "F" ou "M". 
		// Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inv�lido.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Sexo (F ou M): ");
		String sexo = scan.next();
		
		if (sexo.equalsIgnoreCase("f")) {
			System.out.println("F - Feminino");
		}	else if (sexo.equalsIgnoreCase("m")) {
			System.out.println("M - Masculino");
		}	else {
			System.out.println("Sexo inv�lido");
		}
		

	}

}

package maintest.test7.exercicios;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		// 4. Fa�a um Programa que verifique se uma letra digitada � vogal ou consoante.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma letra: ");
		String letra = scan.next();
		
		if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || 
				letra.equalsIgnoreCase("u")) {
			System.out.println("A letra digitada � uma vogal");
		}	else {
			System.out.println("A letra digitada � uma consoante");
		}
	}		

}

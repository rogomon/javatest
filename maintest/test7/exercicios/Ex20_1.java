package maintest.test7.exercicios;

import java.util.Scanner;

public class Ex20_1 {

	public static void main(String[] args) {
		
		// 20.Fa�a um programa que fa�a 5 perguntas para uma pessoa sobre um crime. As perguntas s�o:
		// "Telefonou para a v�tima?"
		// a. "Esteve no local do crime?"
		// b. "Mora perto da v�tima?"
		// c. "Devia para a v�tima?"
		// d. "J� trabalhou com a v�tima?"
		// O programa deve no final emitir uma classifica��o sobre a participa��o da pessoa no crime.
		// Se a pessoa responder positivamente a 2 quest�es ela deve ser classificada como "Suspeita"
		// entre 3 e 4 como "C�mplice"
		// 5 como "Assassino".
		// Caso contr�rio, ele ser� classificado como "Inocente".
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Responda 'S' para sim ou 'N' para n�o sobre as seguintes perguntas a respeito de um crime:");
		System.out.println("Telefonou para a v�tima?");
		String r1 = scan.next();
		
		System.out.println("Esteve no local do crime?");
		String r2 = scan.next();
		
		System.out.println("Mora perto da v�tima?");
		String r3 = scan.next();
		
		System.out.println("Devia para a v�tima?");
		String r4 = scan.next();
		
		System.out.println("J� trabalhou com a v�tima?");
		String r5 = scan.next();
		
		int cont = 0;
				
		if (r1.equalsIgnoreCase("S")) {
		cont++;
		}
		
		if (r2.equalsIgnoreCase("S")) { 
		cont++;
		}
			
		if (r3.equalsIgnoreCase("S")) { 
		cont++;
		}
			
		if (r4.equalsIgnoreCase("S")) { 
		cont++;
		}
			
		if (r5.equalsIgnoreCase("S")) {
		cont++;
		}
		
		
		if (cont == 0 || cont == 1) {
		System.out.println("Classifica��o: Inocente");
		}
		
		if (cont == 2) {
		System.out.println("Classifica��o: Suspeito");
		}	
		
		if (cont == 3 || cont == 4) {
		System.out.println("Classifica��o: C�mplice");
		}
		
		if (cont == 5) {
		System.out.println("Classifica��o: Assassino");
		}
		
		scan.close();	
	}	

}

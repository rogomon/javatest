package maintest.test7.exercicios;

import java.util.Scanner;

public class Ex20_1 {

	public static void main(String[] args) {
		
		// 20.Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
		// "Telefonou para a vítima?"
		// a. "Esteve no local do crime?"
		// b. "Mora perto da vítima?"
		// c. "Devia para a vítima?"
		// d. "Já trabalhou com a vítima?"
		// O programa deve no final emitir uma classificação sobre a participação da pessoa no crime.
		// Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita"
		// entre 3 e 4 como "Cúmplice"
		// 5 como "Assassino".
		// Caso contrário, ele será classificado como "Inocente".
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Responda 'S' para sim ou 'N' para não sobre as seguintes perguntas a respeito de um crime:");
		System.out.println("Telefonou para a vítima?");
		String r1 = scan.next();
		
		System.out.println("Esteve no local do crime?");
		String r2 = scan.next();
		
		System.out.println("Mora perto da vítima?");
		String r3 = scan.next();
		
		System.out.println("Devia para a vítima?");
		String r4 = scan.next();
		
		System.out.println("Já trabalhou com a vítima?");
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
		System.out.println("Classificação: Inocente");
		}
		
		if (cont == 2) {
		System.out.println("Classificação: Suspeito");
		}	
		
		if (cont == 3 || cont == 4) {
		System.out.println("Classificação: Cúmplice");
		}
		
		if (cont == 5) {
		System.out.println("Classificação: Assassino");
		}
		
		scan.close();	
	}	

}

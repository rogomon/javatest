package maintest.test7.exercicios;

import java.util.Scanner;

public class Ex20 {

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
		
		
		if ( 
				
		// Total.Tipo.Subtipo
		// 1.1.0s
						
		r1.equalsIgnoreCase("N") && 
		r2.equalsIgnoreCase("N") && 
		r3.equalsIgnoreCase("N") && 
		r4.equalsIgnoreCase("N") && 
		r5.equalsIgnoreCase("N")
		
								
		) {
			System.out.println("Classificação: Inocente");
		}
				
				
					
		else if ( 
				
		// Total.Tipo.Subtipo
		// 2.1.1s
				
		r1.equalsIgnoreCase("S") && 
		r2.equalsIgnoreCase("N") && 
		r3.equalsIgnoreCase("N") && 
		r4.equalsIgnoreCase("N") && 
		r5.equalsIgnoreCase("N")
						
		) {
		System.out.println("Classificação: Inocente");
		}
		
		
				
		else if ( 
				
		// Total.Tipo.Subtipo 
		// 3.2.1s
				
		r1.equalsIgnoreCase("N") && 
		r2.equalsIgnoreCase("S") && 
		r3.equalsIgnoreCase("N") && 
		r4.equalsIgnoreCase("N") && 
		r5.equalsIgnoreCase("N")
						
		) {
		System.out.println("Classificação: Inocente");
		}
				
				
				
		else if ( 
				
		// Total.Tipo.Subtipo
		// 4.3.1s
				
		r1.equalsIgnoreCase("N") && 
		r2.equalsIgnoreCase("N") && 
		r3.equalsIgnoreCase("S") && 
		r4.equalsIgnoreCase("N") && 
		r5.equalsIgnoreCase("N")
				
		) {
		System.out.println("Classificação: Inocente");
		}
		
		
		
		else if ( 
				
		// Total.Tipo.Subtipo
		// 5.4.1s
				
		r1.equalsIgnoreCase("N") && 
		r2.equalsIgnoreCase("N") && 
		r3.equalsIgnoreCase("N") && 
		r4.equalsIgnoreCase("S") && 
		r5.equalsIgnoreCase("N")
						
		) {
		System.out.println("Classificação: Inocente");
		}
				
				
				
		else if ( 
				
		// Total.Tipo.Subtipo
		// 6.5.1s
						
		r1.equalsIgnoreCase("N") && 
		r2.equalsIgnoreCase("N") && 
		r3.equalsIgnoreCase("N") && 
		r4.equalsIgnoreCase("N") && 
		r5.equalsIgnoreCase("S")
								
		) {
		System.out.println("Classificação: Inocente");
		}
						
						
					
		else if ( 
				
		// Total.Tipo.Subtipo
		// 7.1.2s
				
		r1.equalsIgnoreCase("S") && 
		r2.equalsIgnoreCase("S") && 
		r3.equalsIgnoreCase("N") && 
		r4.equalsIgnoreCase("N") && 
		r5.equalsIgnoreCase("N")
						
		) {
		System.out.println("Classificação: Suspeito");
		}
				
				
				
		else if (
				
		// Total.Tipo.Subtipo
		// 8.2.2s
				
		r1.equalsIgnoreCase("S") && 
		r2.equalsIgnoreCase("N") && 
		r3.equalsIgnoreCase("S") && 
		r4.equalsIgnoreCase("N") && 
		r5.equalsIgnoreCase("N")
		
		) {
		System.out.println("Classificação: Suspeito");
		}
		
		
		
		else if (
				
		// Total.Tipo.Subtipo
		// 9.3.2s
				
		r1.equalsIgnoreCase("S") && 
		r2.equalsIgnoreCase("N") && 
		r3.equalsIgnoreCase("N") && 
		r4.equalsIgnoreCase("S") && 
		r5.equalsIgnoreCase("N")
		
		) {
		System.out.println("Classificação: Suspeito");
		}
		
		
		
		else if (
				
		// Total.Tipo.Subtipo
		// 10.4.2s
				
		r1.equalsIgnoreCase("S") &&
		r2.equalsIgnoreCase("N") && 
		r3.equalsIgnoreCase("N") && 
		r4.equalsIgnoreCase("N") && 
		r5.equalsIgnoreCase("S")
		
		) {
		System.out.println("Classificação: Suspeito");
		}
		
		
		
		else if (
				
		// Total.Tipo.Subtipo
		// 11.5.2s
				
		r1.equalsIgnoreCase("N") &&
		r2.equalsIgnoreCase("S") && 
		r3.equalsIgnoreCase("S") && 
		r4.equalsIgnoreCase("N") && 
		r5.equalsIgnoreCase("N")
				
		) {
		System.out.println("Classificação: Suspeito");
		}
		
		
		
		else if (
				
		// Total.Tipo.Subtipo
		// 12.6.2s
				
		r1.equalsIgnoreCase("N") &&
		r2.equalsIgnoreCase("S") && 
		r3.equalsIgnoreCase("N") && 
		r4.equalsIgnoreCase("S") && 
		r5.equalsIgnoreCase("N")
		
		) {
		System.out.println("Classificação: Suspeito");
		}
		
		
		
		else if (
				
		// Total.Tipo.Subtipo
		// 13.7.2s
				
		r1.equalsIgnoreCase("N") &&
		r2.equalsIgnoreCase("S") && 
		r3.equalsIgnoreCase("N") && 
		r4.equalsIgnoreCase("N") && 
		r5.equalsIgnoreCase("S")
		
		) {
		System.out.println("Classificação: Suspeito");
		}
		
		
		
		else if (
				
		// Total.Tipo.Subtipo
		// 14.8.2s
				
		r1.equalsIgnoreCase("N") &&
		r2.equalsIgnoreCase("N") && 
		r3.equalsIgnoreCase("S") && 
		r4.equalsIgnoreCase("S") && 
		r5.equalsIgnoreCase("N")
		
		) {
		System.out.println("Classificação: Suspeito");
		}
		
		
		
		else if (
				
		// Total.Tipo.Subtipo
		// 15.9.2s
				
		r1.equalsIgnoreCase("N") &&
		r2.equalsIgnoreCase("N") && 
		r3.equalsIgnoreCase("S") && 
		r4.equalsIgnoreCase("N") && 
		r5.equalsIgnoreCase("S")
		
		) {
		System.out.println("Classificação: Suspeito");
		}
		
		
		
		else if (
				
		// Total.Tipo.Subtipo
		// 16.10.2s
				
		r1.equalsIgnoreCase("N") &&
		r2.equalsIgnoreCase("N") && 
		r3.equalsIgnoreCase("N") && 
		r4.equalsIgnoreCase("S") && 
		r5.equalsIgnoreCase("S")
		
		) {
		System.out.println("Classificação: Suspeito");
		}
	

		
		else if (
				
		// Total.Tipo.Subtipo
		// 17.1.3s
				
		r1.equalsIgnoreCase("S") && 
		r2.equalsIgnoreCase("S") && 
		r3.equalsIgnoreCase("S") && 
		r4.equalsIgnoreCase("N") && 
		r5.equalsIgnoreCase("N")
						
		) {
		System.out.println("Classificação: Cúmplice");
		}
				
				
				
		else if (
				
		// Total.Tipo.Subtipo
		// 18.2.3s
						
		r1.equalsIgnoreCase("S") && 
		r2.equalsIgnoreCase("S") && 
		r3.equalsIgnoreCase("N") && 
		r4.equalsIgnoreCase("S") && 
		r5.equalsIgnoreCase("N")
				
		) {
		System.out.println("Classificação: Cúmplice");
		}
				
				
				
		else if (
				
		// Total.Tipo.Subtipo
		// 19.3.3s
						
		r1.equalsIgnoreCase("S") && 
		r2.equalsIgnoreCase("S") && 
		r3.equalsIgnoreCase("N") && 
		r4.equalsIgnoreCase("N") && 
		r5.equalsIgnoreCase("S")
				
		) {
		System.out.println("Classificação: Cúmplice");
		}
				
				
				
		else if (
				
		// Total.Tipo.Subtipo
		// 20.4.3s
						
		r1.equalsIgnoreCase("S") &&
		r2.equalsIgnoreCase("N") && 
		r3.equalsIgnoreCase("S") && 
		r4.equalsIgnoreCase("S") && 
		r5.equalsIgnoreCase("N")
				
		) {
		System.out.println("Classificação: Cúmplice");
		}
				
				
				
		else if (
				
		// Total.Tipo.Subtipo
		// 21.5.3s
						
		r1.equalsIgnoreCase("S") &&
		r2.equalsIgnoreCase("N") && 
		r3.equalsIgnoreCase("S") && 
		r4.equalsIgnoreCase("N") && 
		r5.equalsIgnoreCase("S")
						
		) {
		System.out.println("Classificação: Cúmplice");
		}
				
				
				
		else if (
				
		// Total.Tipo.Subtipo
		// 22.6.3s
						
		r1.equalsIgnoreCase("S") &&
		r2.equalsIgnoreCase("N") && 
		r3.equalsIgnoreCase("N") && 
		r4.equalsIgnoreCase("S") && 
		r5.equalsIgnoreCase("S")
				
		) {
		System.out.println("Classificação: Cúmplice");
		}
				
				
				
		else if (
				
		// Total.Tipo.Subtipo
		// 23.7.3s
						
		r1.equalsIgnoreCase("N") &&
		r2.equalsIgnoreCase("S") && 
		r3.equalsIgnoreCase("S") && 
		r4.equalsIgnoreCase("S") && 
		r5.equalsIgnoreCase("N")
				
		) {
		System.out.println("Classificação: Cúmplice");
		}
				
				
				
		else if (
				
		// Total.Tipo.Subtipo
		// 24.8.3s
						
		r1.equalsIgnoreCase("N") &&
		r2.equalsIgnoreCase("S") && 
		r3.equalsIgnoreCase("N") && 
		r4.equalsIgnoreCase("S") && 
		r5.equalsIgnoreCase("S")
				
		) {
		System.out.println("Classificação: Cúmplice");
		}
				
				
				
		else if (
				
		// Total.Tipo.Subtipo
		// 25.9.3s
						
		r1.equalsIgnoreCase("N") &&
		r2.equalsIgnoreCase("N") && 
		r3.equalsIgnoreCase("S") && 
		r4.equalsIgnoreCase("S") && 
		r5.equalsIgnoreCase("S")
				
		) {
		System.out.println("Classificação: Cúmplice");
		}
				
				
				
		else if (
				
		// Total.Tipo.Subtipo
		// 26.1.4s
						
		r1.equalsIgnoreCase("S") &&
		r2.equalsIgnoreCase("S") && 
		r3.equalsIgnoreCase("S") && 
		r4.equalsIgnoreCase("S") && 
		r5.equalsIgnoreCase("N")
				
		) {
		System.out.println("Classificação: Cúmplice");
		}
		
		
				
		else if (
				
		// Total.Tipo.Subtipo
		// 27.2.4s
					
		r1.equalsIgnoreCase("S") &&
		r2.equalsIgnoreCase("S") && 
		r3.equalsIgnoreCase("S") && 
		r4.equalsIgnoreCase("N") && 
		r5.equalsIgnoreCase("S")
						
		) {
		System.out.println("Classificação: Cúmplice");
		}
		
	
	
		else if (
				
		// Total.Tipo.Subtipo
		// 28.3.4s
						
		r1.equalsIgnoreCase("S") &&
		r2.equalsIgnoreCase("S") && 
		r3.equalsIgnoreCase("N") && 
		r4.equalsIgnoreCase("S") && 
		r5.equalsIgnoreCase("S")
								
		) {
		System.out.println("Classificação: Cúmplice");
		}	
		
		
		
		else if (
				
		// Total.Tipo.Subtipo
		// 29.4.4s
						
		r1.equalsIgnoreCase("S") &&
		r2.equalsIgnoreCase("N") && 
		r3.equalsIgnoreCase("S") && 
		r4.equalsIgnoreCase("S") && 
		r5.equalsIgnoreCase("S")
										
		) {
		System.out.println("Classificação: Cúmplice");
		}		
		
		
	
		else if (
				
		// Total.Tipo.Subtipo
		// 30.5.4s
						
		r1.equalsIgnoreCase("N") &&
		r2.equalsIgnoreCase("S") && 
		r3.equalsIgnoreCase("S") && 
		r4.equalsIgnoreCase("S") && 
		r5.equalsIgnoreCase("S")
												
		) {
		System.out.println("Classificação: Cúmplice");
		}		
		
		

		else if (
				
		// Total.Tipo.Subtipo
		// 31.1.5s
						
		r1.equalsIgnoreCase("S") &&
		r2.equalsIgnoreCase("S") && 
		r3.equalsIgnoreCase("S") && 
		r4.equalsIgnoreCase("S") && 
		r5.equalsIgnoreCase("S")
														
		) {
		System.out.println("Classificação: Assassino");
		}			
		
		
		
		else
			
		{
		System.out.println("Dados inválidos");
		}
		
		scan.close();
				
	}	

}

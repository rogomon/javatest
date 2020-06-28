package maintest.test7.exercicios;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		// 5. Faça um programa para a leitura de duas notas parciais de um aluno. 
		// O programa deve calcular a média alcançada pelo aluno e apresentar: 
		// A mensagem "Aprovado", se a média alcançada for maior ou igual a sete; 
		// A mensagem "Reprovado", se a média for menor do que sete; 
		// A mensagem "Aprovado com Distinção", se a média for igual a dez.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite as 2 notas (entre 0 e 10):");
		double nota1 = scan.nextDouble();
		double nota2 = scan.nextDouble();
		
		if (nota1 < 0 || nota1 > 10 || nota2 < 0 || nota2 > 10) {
			System.out.println("Há nota(s) inválida(s). Rode o programa novamente e digite notas válidas (entre 0 e 10).");	
			
		}	else if ((nota1 + nota2)/2 < 7 && (nota1 + nota2)/2 > 0) {
			System.out.println("Reprovado");
		}	else if ((nota1 + nota2)/2 >= 7 && (nota1 + nota2)/2 > 0 && (nota1 + nota2)/2 < 10) {
			System.out.println("Aprovado");
		}	else if ((nota1 + nota2)/2 == 10) {
				System.out.println("Aprovado com distinção");
		}	else {
			System.out.println("Nota inválida");
		}
		

	}

}

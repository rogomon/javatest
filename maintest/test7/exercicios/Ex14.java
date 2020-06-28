package maintest.test7.exercicios;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		// 14.Fa�a um programa que l� as duas notas parciais obtidas por um aluno numa disciplina ao longo de um semestre, e calcule a sua m�dia.
		// A atribui��o de conceitos obedece � tabela abaixo:
		// M�dia de Aproveitamento Conceito
		// Entre 9.0 e 10.0 A
		// Entre 7.5 e 9.0 B
		// Entre 6.0 e 7.5 C
		// Entre 4.0 e 6.0 D
		// Entre 4.0 e zero E
		// O algoritmo deve mostrar na tela:
		// notas
		// m�dia
		// conceito correspondente
		// mensagem �APROVADO� se o conceito for A, B ou C ou �REPROVADO� se o conceito for D ou E.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite as 2 notas:");
		double nota1 = scan.nextDouble();
		double nota2 = scan.nextDouble();
		double media = (nota1 + nota2)/2;
		
		if (nota1 > 0 && nota2 > 0 && media > 0 && media < 4) {
			System.out.println("Nota 1: " + nota1);
			System.out.println("Nota 2: " + nota2);
			System.out.println("M�dia: " + media);
			System.out.println("Conceito: E");
			System.out.println("Situa��o: Reprovado(a)");
			
		}	else if (nota1 > 0 && nota2 > 0 && media >= 4 && media < 6) {
			System.out.println("Nota 1: " + nota1);
			System.out.println("Nota 2: " + nota2);
			System.out.println("M�dia: " + media);
			System.out.println("Conceito: D");
			System.out.println("Situa��o: Reprovado(a)");
			
		}	else if (nota1 > 0 && nota2 > 0 && media >= 6 && media < 7.5) {
			System.out.println("Nota 1: " + nota1);
			System.out.println("Nota 2: " + nota2);
			System.out.println("M�dia: " + media);
			System.out.println("Conceito: C");
			System.out.println("Situa��o: Aprovado(a)");
			
		}	else if (nota1 > 0 && nota2 > 0 && media >= 7.5 && media < 9) {
			System.out.println("Nota 1: " + nota1);
			System.out.println("Nota 2: " + nota2);
			System.out.println("M�dia: " + media);
			System.out.println("Conceito: B");
			System.out.println("Situa��o: Aprovado(a)");
			
		}	else if (nota1 > 0 && nota2 > 0 && media >= 9 && media <= 10) {
			System.out.println("Nota 1: " + nota1);
			System.out.println("Nota 2: " + nota2);
			System.out.println("M�dia: " + media);
			System.out.println("Conceito: A");
			System.out.println("Situa��o: Aprovado(a)");
			
		}	else {
			System.out.println("Dados inv�lidos");
		}
		

	}

}

package rodrigo.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		// 13.Fa�a um Programa que leia um n�mero e exiba o dia correspondente da semana.
		// (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve aparecer valor inv�lido.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um n�mero entre 1 e 7");
		int dia = scan.nextInt();
		
		if (dia == 1) {
			System.out.println("O n�mero digitado corresponde ao seguinte dia da semana: Domingo");
			
		}	else if (dia == 2) {
			System.out.println("O n�mero digitado corresponde ao seguinte dia da semana: Segunda");
			
		}	else if (dia == 3) {
			System.out.println("O n�mero digitado corresponde ao seguinte dia da semana: Ter�a");
		
		}	else if (dia == 4) {
			System.out.println("O n�mero digitado corresponde ao seguinte dia da semana: Quarta");
	
		}	else if (dia == 5) {
			System.out.println("O n�mero digitado corresponde ao seguinte dia da semana: Quinta");
	
		}	else if (dia == 6) {
			System.out.println("O n�mero digitado corresponde ao seguinte dia da semana: Sexta");
	
		}	else if (dia == 7) {
			System.out.println("O n�mero digitado corresponde ao seguinte dia da semana: S�bado");
	
		}	else {
			System.out.println("Dados inv�lidos");
	
		}
		

	}

}

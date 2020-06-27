package rodrigo.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		
		// 8. Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. 
		// Calcule e mostre o total do seu salário no referido mês.

	Scanner scan = new Scanner(System.in);
	
	System.out.println("Quanto você ganha por hora? ");
	
	double hora = scan.nextDouble();
	
	System.out.println("Quantas horas você trabalhou no mês?");
	
	double total = scan.nextDouble();
	
	double salario = hora * total;
	
	System.out.println("Seu salário é: " + salario);
	
	
	}

}

package rodrigo.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		
		// 8. Fa�a um Programa que pergunte quanto voc� ganha por hora e o n�mero de horas trabalhadas no m�s. 
		// Calcule e mostre o total do seu sal�rio no referido m�s.

	Scanner scan = new Scanner(System.in);
	
	System.out.println("Quanto voc� ganha por hora? ");
	
	double hora = scan.nextDouble();
	
	System.out.println("Quantas horas voc� trabalhou no m�s?");
	
	double total = scan.nextDouble();
	
	double salario = hora * total;
	
	System.out.println("Seu sal�rio �: " + salario);
	
	
	}

}

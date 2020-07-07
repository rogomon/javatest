package maintest.test5.exercicios;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
				
		// 13.Fa�a um Programa que pergunte quanto voc� ganha por hora e o n�mero de horas trabalhadas no m�s. 
		// Calcule e mostre o total do seu sal�rio no referido m�s, sabendo-se que s�o descontados 11% para o Imposto de Renda, 
		// 8% para o INSS e 5% para o sindicato, fa�a um programa que nos d�: 
		// 		a. sal�rio bruto. 
		//		b. quanto pagou de IR
		// 		b. quanto pagou ao INSS. 
		//		c. quanto pagou ao sindicato. 
		// 		d. o sal�rio l�quido. 
		// calcule os descontos e o sal�rio l�quido, conforme a tabela abaixo: 
		// + Sal�rio Bruto : R$ - IR (11%) : R$ - INSS (8%) : R$ - Sindicato ( 5%) : R$ = Sal�rio Liquido : R$
		// Obs.: Sal�rio Bruto - Descontos = Sal�rio L�quido.

		Scanner scan = new Scanner(System.in);
			
		System.out.println("Quanto voc� ganha por hora? ");
		double hora = scan.nextDouble();
			
		System.out.println("Quantas horas voc� trabalhou no m�s?");
		double total = scan.nextDouble();
			
		double salarioBruto = hora * total;
		double inss = salarioBruto * 0.08;
		double impostoDeRenda = salarioBruto * 0.11;
		double sindicato = salarioBruto * 0.05;
		double salarioLiquido = salarioBruto - impostoDeRenda - sindicato - inss;
		double descontos = inss + impostoDeRenda + sindicato;
		
		System.out.println("Sal�rio Bruto: R$ " + salarioBruto);
		System.out.println("INSS (8%)" + inss);
		System.out.println("IR (11%): R$ " + impostoDeRenda);
		System.out.println("Sindicato (5%): R$ " + sindicato);
		System.out.println("Total de descontos: R$ " + descontos);
		System.out.println("Sal�rio L�quido: R$ " + salarioLiquido);
		
		scan.close();
	}

}

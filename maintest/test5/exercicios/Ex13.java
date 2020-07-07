package maintest.test5.exercicios;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
				
		// 13.Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. 
		// Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda, 
		// 8% para o INSS e 5% para o sindicato, faça um programa que nos dê: 
		// 		a. salário bruto. 
		//		b. quanto pagou de IR
		// 		b. quanto pagou ao INSS. 
		//		c. quanto pagou ao sindicato. 
		// 		d. o salário líquido. 
		// calcule os descontos e o salário líquido, conforme a tabela abaixo: 
		// + Salário Bruto : R$ - IR (11%) : R$ - INSS (8%) : R$ - Sindicato ( 5%) : R$ = Salário Liquido : R$
		// Obs.: Salário Bruto - Descontos = Salário Líquido.

		Scanner scan = new Scanner(System.in);
			
		System.out.println("Quanto você ganha por hora? ");
		double hora = scan.nextDouble();
			
		System.out.println("Quantas horas você trabalhou no mês?");
		double total = scan.nextDouble();
			
		double salarioBruto = hora * total;
		double inss = salarioBruto * 0.08;
		double impostoDeRenda = salarioBruto * 0.11;
		double sindicato = salarioBruto * 0.05;
		double salarioLiquido = salarioBruto - impostoDeRenda - sindicato - inss;
		double descontos = inss + impostoDeRenda + sindicato;
		
		System.out.println("Salário Bruto: R$ " + salarioBruto);
		System.out.println("INSS (8%)" + inss);
		System.out.println("IR (11%): R$ " + impostoDeRenda);
		System.out.println("Sindicato (5%): R$ " + sindicato);
		System.out.println("Total de descontos: R$ " + descontos);
		System.out.println("Salário Líquido: R$ " + salarioLiquido);
		
		scan.close();
	}

}

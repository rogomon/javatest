package maintest.test7.exercicios;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		// 12.Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do 
		// Imposto de Renda, que depende do salário bruto (conforme tabela abaixo)
		// 3% para o Sindicato 
		// O FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é a empresa que deposita).
		// O Salário Líquido corresponde ao Salário Bruto menos os descontos. 
		// O programa deverá pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês.
		// Desconto do IR:
		// Salário Bruto até 900 (inclusive) - isento
		// Salário Bruto até 1500 (inclusive) - desconto de 5%
		// Salário Bruto até 2500 (inclusive) - desconto de 10%
		// Salário Bruto acima de 2500 - desconto de 20% 
		// Imprima na tela as informações, dispostas conforme o exemplo abaixo:
		// No exemplo o valor da hora é 5 e a quantidade de hora é 220.
		// Salário Bruto: (5 * 220) : R$ 1100,00
		// (-) IR (5%) : R$ 55,00
		// (-) INSS ( 10%) : R$ 110,00
		// FGTS (11%) : R$ 121,00
		// Total de descontos : R$ 165,00
		// Salário Liquido : R$ 935,00

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quanto você ganha por hora? ");
		double hora = scan.nextDouble();
			
		System.out.println("Quantas horas você trabalhou no mês?");
		double total = scan.nextDouble();
			
		double salarioBruto = hora * total;
		double sindicato = salarioBruto * 0.03;
		double fgts = salarioBruto * 0.11;
		double inss = salarioBruto * 0.10;
		double impostoDeRenda = salarioBruto * 0;
		double descontos = inss + impostoDeRenda + sindicato;
		double salarioLiquido = salarioBruto - impostoDeRenda - sindicato - inss;
		
		if (salarioBruto > 0 && salarioBruto <= 900) {
			impostoDeRenda = salarioBruto * 0;
			descontos = inss + impostoDeRenda + sindicato;
			salarioLiquido = salarioBruto - impostoDeRenda - sindicato - inss;
			System.out.println("Salário Bruto: (" + hora + "*" + total + ") R$ " + salarioBruto);
			System.out.println("(-) IR (0%) : R$ " + impostoDeRenda);
			System.out.println("(-) INSS ( 10%) : R$ " + inss);
			System.out.println("FGTS (11%) : R$ " + fgts);
			System.out.println("Sindicato (3%): R$ " + sindicato);
			System.out.println("Total de descontos: R$ " + descontos);
			System.out.println("Salário Líquido: R$ " + salarioLiquido);
			
		}	else if (salarioBruto > 900 && salarioBruto <= 1500) {
			impostoDeRenda = salarioBruto * 0.05;
			descontos = inss + impostoDeRenda + sindicato;
			salarioLiquido = salarioBruto - impostoDeRenda - sindicato - inss;
			System.out.println("Salário Bruto: (" + hora + "*" + total + ") R$ " + salarioBruto);
			System.out.println("(-) IR (5%) : R$ " + impostoDeRenda);
			System.out.println("(-) INSS ( 10%) : R$ " + inss);
			System.out.println("FGTS (11%) : R$ " + fgts);
			System.out.println("Sindicato (3%): R$ " + sindicato);
			System.out.println("Total de descontos: R$ " + descontos);
			System.out.println("Salário Líquido: R$ " + salarioLiquido);
			
		}	else if (salarioBruto > 1500 && salarioBruto <= 2500) {
			impostoDeRenda = salarioBruto * 0.10;
			descontos = inss + impostoDeRenda + sindicato;
			salarioLiquido = salarioBruto - impostoDeRenda - sindicato - inss;
			System.out.println("Salário Bruto: (" + hora + "*" + total + ") R$ " + salarioBruto);
			System.out.println("(-) IR (10%) : R$ " + impostoDeRenda);
			System.out.println("(-) INSS ( 10%) : R$ " + inss);
			System.out.println("FGTS (11%) : R$ " + fgts);
			System.out.println("Sindicato (3%): R$ " + sindicato);
			System.out.println("Total de descontos: R$ " + descontos);
			System.out.println("Salário Líquido: R$ " + salarioLiquido);
			
		}	else if (salarioBruto > 2500) {
			impostoDeRenda = salarioBruto * 0.20;
			descontos = inss + impostoDeRenda + sindicato;
			salarioLiquido = salarioBruto - impostoDeRenda - sindicato - inss;
			System.out.println("Salário Bruto: (" + hora + "*" + total + ") R$ " + salarioBruto);
			System.out.println("(-) IR (20%) : R$ " + impostoDeRenda);
			System.out.println("(-) INSS ( 10%) : R$ " + inss);
			System.out.println("FGTS (11%) : R$ " + fgts);
			System.out.println("Sindicato (3%): R$ " + sindicato);
			System.out.println("Total de descontos: R$ " + descontos);
			System.out.println("Salário Líquido: R$ " + salarioLiquido);
			
		} 	else {
			System.out.println("Dados inválidos");
		}

		
	}

}

package maintest.test7.exercicios;

import java.util.Scanner; 

public class Ex11 {

	public static void main(String[] args) {
		
		// 11.As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e lhe contrataram para desenvolver o programa que
		// calculará os reajustes. Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, 
		// baseado no salário atual: 
		// salários até R$ 280,00 (incluindo) : aumento de 20%
		// salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
		// salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
		// salários de R$ 1500,00 em diante : aumento de 5%
		// Após o aumento ser realizado, informe na tela:
		// salário antes do reajuste;
		// percentual de aumento aplicado;
		// valor do aumento;
		// novo salário, após o aumento.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor de seu salário: ");
		double valorDoAumento = 0;
		double salarioSemAumento = scan.nextDouble();
		double salarioComAumento = salarioSemAumento + valorDoAumento;
		
		if (salarioSemAumento <= 280.00 && salarioSemAumento > 0) {	
			valorDoAumento = salarioSemAumento * 0.2;
			salarioComAumento = salarioSemAumento + valorDoAumento;
			System.out.println("Salário atual: " + salarioSemAumento);
			System.out.println("Percentual de aumento: 20%");
			System.out.println("Valor do aumento: " + valorDoAumento);
			System.out.println("Novo salário: " + salarioComAumento);
			
		}	else if (salarioSemAumento > 280.00 && salarioSemAumento <= 700.00) {
			valorDoAumento = salarioSemAumento * 0.15;
			salarioComAumento = salarioSemAumento + valorDoAumento;
			System.out.println("Salário atual: " + salarioSemAumento);
			System.out.println("Percentual de aumento: 15%");
			System.out.println("Valor do aumento: " + valorDoAumento);
			System.out.println("Novo salário: " + salarioComAumento);
			
		}	else if (salarioSemAumento > 700.00 && salarioSemAumento <= 1500.00) {
			valorDoAumento = salarioSemAumento * 0.10;
			salarioComAumento = salarioSemAumento + valorDoAumento;
			System.out.println("Salário atual: " + salarioSemAumento);
			System.out.println("Percentual de aumento: 10%");
			System.out.println("Valor do aumento: " + valorDoAumento);
			System.out.println("Novo salário: " + salarioComAumento);
			
		}	else if (salarioSemAumento > 700.00 && salarioSemAumento <= 1500.00) {
			valorDoAumento = salarioSemAumento * 0.10;
			salarioComAumento = salarioSemAumento + valorDoAumento;
			System.out.println("Salário atual: " + salarioSemAumento);
			System.out.println("Percentual de aumento: 10%");
			System.out.println("Valor do aumento: " + valorDoAumento);
			System.out.println("Novo salário: " + salarioComAumento);
			
		}	else if (salarioSemAumento > 1500.00) {
			valorDoAumento = salarioSemAumento * 0.05;
			salarioComAumento = salarioSemAumento + valorDoAumento;
			System.out.println("Salário atual: " + salarioSemAumento);
			System.out.println("Percentual de aumento: 5%");
			System.out.println("Valor do aumento: " + valorDoAumento);
			System.out.println("Novo salário: " + salarioComAumento);
		
		}	else {
			System.out.println("Dados inválidos");
					
		}
	}

}

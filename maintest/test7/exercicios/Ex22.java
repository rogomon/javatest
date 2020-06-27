package rodrigo.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		
		/*
		 * 22.
		 * Uma frutaria está vendendo frutas com a seguinte tabela de preços: 
		 * 
		 * Morango
		 * Até 5 Kg: 		R$ 2,50 por Kg 
		 * Acima de 5 Kg: 	R$ 2,20 por Kg
		 * 
		 * Maçã 
		 * Até 5 Kg 		R$ 1,80 por Kg
		 * Acima de 5 Kg	R$ 1,50 por Kg
		 * 
		 * Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00:
		 * Desconto de 10% sobre este total.
		 * Escreva um algoritmo para ler a quantidade (em Kg) de:
		 * morangos
		 * maças
		 * escreva o valor a ser pago pelo cliente.
		 * */

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantidade de morangos (em Kg):");
		double qMorango = scan.nextDouble();
		
		System.out.println("Quantidade de maçãs (em Kg):");
		double qMaca = scan.nextDouble();
		
		double qTotal = qMorango + qMaca;
		
		double pMorango1 = 2.5;
		double pMorango2 = 2.2;
		double tMorango1 = qMorango * pMorango1;
		double tMorango2 = qMorango * pMorango2;
		
		double pMaca1 = 1.8;
		double pMaca2 = 1.5;
		double tMaca1 = qMaca * pMaca1;
		double tMaca2 = qMaca * pMaca2;
		
		double pTotal1 = 0;
		double pTotal2 = 0;
		double descontoT1 = 0;
		double descontoT2 = 0; 
		
		if (qMaca <= 5 && qMorango <= 5) {
		pTotal1 = tMaca1 + tMorango1;
		}
		
		if (qMaca <= 5 && qMorango > 5) {
		pTotal1 = tMaca1 + tMorango2;
		}
		
		if (qMaca > 5 && qMorango <= 5) {
		pTotal1 = tMaca2 + tMorango1;
		}
		
		if (qMaca > 5 && qMorango > 5) {
		pTotal1 = tMaca2 + tMorango2;
		}
		
		if (qTotal > 8) {
			descontoT1 = pTotal1 * 0.10;
			pTotal2 = pTotal1 - descontoT1;
		}
		
		if (pTotal1 > 25) {
			descontoT2 = pTotal1 * 0.10;
			pTotal2 = pTotal1 - descontoT2;
		
		System.out.println("Total: R$ " + pTotal2);
		}	
		
		else {
		System.out.println("Total: R$ " + pTotal1);	
		}
	}

}

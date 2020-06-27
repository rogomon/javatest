package rodrigo.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		/*
		 * 23.
		 * O Hipermercado Tabajara está com uma promoção de carnes que é imperdível. Confira:
		 * 
		 * File Duplo
		 * Até 5 Kg 		R$ 5,80 por Kg
		 * Acima de 5 Kg 	R$ 4,90 por Kg
		 * 
		 * Alcatra
		 * Até 5 Kg 		R$ 6,80 por Kg 
		 * Acima de 5 Kg 	R$ 5,90 por Kg
		 * 
		 * Picanha
		 * Até 5 Kg 		R$ 7,80 por Kg
		 * Acima de 5 Kg 	R$ 6,90 por Kg
		 *  
		 * Para atender a todos os clientes, cada cliente poderá levar apenas um dos tipos de carne da promoção
		 * porém não há limites para a quantidade de carne por cliente.
		 * Se a compra for feita no cartão Tabajara o cliente receberá ainda um desconto de 5% sobre o total a compra.
		 *  
		 * Escreva um programa que peça
		 * o tipo de carne
		 * a quantidade de carne
		 *  
		 * comprada pelo usuário
		 * gere um cupom fiscal, contendo as informações da compra:
		 *  
		 * tipo de carne
		 * quantidade de carne
		 * preço total
		 * tipo de pagamento
		 * valor do desconto
		 * valor a pagar.
		 *  
		 * Fonte dos exercícios: http://wiki.python.org.br/EstruturaDeDecisao
		 * */

		Scanner scan = new Scanner(System.in);
		
		double pFile1 = 5.80;
		double pFile2 = 4.90;
		double pAlcatra1 = 6.80;
		double pAlcatra2 = 5.90;
		double pPicanha1 = 7.80;
		double pPicanha2 = 6.90;
		
		String tipo = "";
		String pagamento = "";
		double quantidade = 0;
		
		double pTotal1 = 0;
		double pTotal2 = 0;
		
		
		double desconto = pTotal1 * 0.05;
		
		
		System.out.println("Digite 'F' para filé, 'A' para alcatra e 'P' para picanha. Tipo de carne:");
		tipo = scan.next();
		
		System.out.println("Quantidade de carne:");
		quantidade = scan.nextDouble();
		
		System.out.println("Digite 'C' para pagar com cartão ou 'D' para dinheiro");
		pagamento = scan.next();
		
		
		if (tipo.equalsIgnoreCase("F") && quantidade <=5) {
		pTotal1 = quantidade * pFile1;
		}
		
		if (tipo.equalsIgnoreCase("F") && quantidade >5) {
		pTotal1 = quantidade * pFile2;
		}
	
		if (tipo.equalsIgnoreCase("A") && quantidade <=5) {
		pTotal1 = quantidade * pAlcatra1;
		}
	
		if (tipo.equalsIgnoreCase("A") && quantidade >5) {
		pTotal1 = quantidade * pAlcatra2;
		}
	
		if (tipo.equalsIgnoreCase("P") && quantidade <=5) {
		pTotal1 = quantidade * pPicanha1;
		}
	
		if (tipo.equalsIgnoreCase("P") && quantidade >5) {
		pTotal1 = quantidade * pPicanha2;
		}
		
		if (pagamento.equalsIgnoreCase("C")) {
		desconto = pTotal1 * 0.05;
		pTotal2 = pTotal1 - desconto;
		System.out.println("Total: R$ " + pTotal2);	
		}
		
		else {
		System.out.println("Total: R$ " + pTotal1);
		}
		
	}
}

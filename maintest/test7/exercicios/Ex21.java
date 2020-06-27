package rodrigo.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		
		/* 21.
		 * Um posto est� vendendo combust�veis com a seguinte tabela de descontos:
		 *
		 * �lcool:
		 * a. at� 20 litros, desconto de 3% por litro
		 * b. acima de 20 litros, desconto de 5% por litro
		 * 
		 * Gasolina:
		 * c. at� 20 litros, desconto de 4% por litro
		 * d. acima de 20 litros, desconto de 6% por litro
		 * 
		 * Escreva um algoritmo que leia
		 * o n�mero de litros vendidos
		 * o tipo de combust�vel (codificado da seguinte forma: A-�lcool, G- gasolina)
		 * calcule e imprima o valor a ser pago pelo cliente sabendo-se que o pre�o do litro:
		 * gasolina: R$ 2,50
		 * �lcool: R$ 1,90 */

		Scanner scan = new Scanner(System.in);
		

				
		System.out.println("N�mero de litros vendidos:");
		double litros = scan.nextDouble();
		double litroA = 1.9;
		double litroG = 2.5;
		double totalA = litros * litroA;
		double totalG = litros * litroG;
		double descontoA1 = totalA * 0.03;
		double descontoA2 = totalA * 0.05;
		double descontoG1 = totalG * 0.04;
		double descontoG2 = totalG * 0.06;
		double totalFinal = 0;
		
		System.out.println("Digite 'A' para �lcool e 'G' para gasolina");
		String tipo = scan.next();
		
		if (litros <= 20 && tipo.equalsIgnoreCase("A")) {
			totalFinal = (litros * litroA) - (descontoA1);
		}
		
		if (litros > 20 && tipo.equalsIgnoreCase("A")) {
			totalFinal = (litros * litroA) - descontoA2;
		}
		
		if (litros <= 20 && tipo.equalsIgnoreCase("G")) {
			totalFinal = (litros * litroG) - descontoG1;
		}
		
		if (litros > 20 && tipo.equalsIgnoreCase("G")) {
			totalFinal = (litros * litroG) - descontoG2;
		}
		
		System.out.println("Total ap�s desconto: " + totalFinal);
		
	}

}

package maintest.test4;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu nome completo:");
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome completo �: " + nomeCompleto);
		
		System.out.println("Digite seu primeiro nome:");
		String primeiroNome = scan.next();
		System.out.println("Seu primeiro nome �:" + primeiroNome);
		
		System.out.println("Digite a sua idade: ");
		int idade = scan.nextInt();
		System.out.println("Sua idade �:" + idade);
		
		System.out.println("Digite a sua altura: ");
		double altura = scan.nextDouble();
		System.out.println("Sua altura �:" + altura);
		
		scan.close();	
		}
	
}
		
		/*System.out.println("Qual � seu primeiro nome, idade, altura, quantidade de filhos e tem animal de estima��o?");
		String primeiroNome = scan.next();
		int idade = scan.nextInt();
		float altura = scan.nextFloat();
		byte qtdFilhos = scan.nextByte();
		boolean temPet = scan.nextBoolean();
		
		System.out.println("Voc� digitou os seguintes valores:");
		System.out.println("Primeiro Nome: " + primeiroNome);
		System.out.println("Idade: " + idade);
		System.out.println("Altura: " + altura);
		System.out.println("Quantidade de filhos: " + qtdFilhos);
		System.out.println("Tem animal de estima��o? " + temPet);*/
		
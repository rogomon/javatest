package maintest.test7.exercicios;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		// 10.Faça um Programa que pergunte em que turno você estuda. 
		// Peça para digitar M-matutino ou V-Vespertino ou N- Noturno. 
		// Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Em que turno você estuda? Digite 'M' para matutino, 'V' para vespertino e 'N' para noturno.");
		String turno = scan.next();
		
		if (turno.equalsIgnoreCase("m")) {
			System.out.println("Bom dia");
		}	else if (turno.equalsIgnoreCase("v")) {
			System.out.println("Boa tarde");
		}	else if (turno.equalsIgnoreCase("n")) {
			System.out.println("Boa noite");
		}	else {
			System.out.println("Valor inválido");
		}
		

	}

}

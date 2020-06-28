package maintest.test6;

import java.util.Scanner;

public class ifElse {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite sua idade:");
		int idade = scan.nextInt();
		
		if (idade < 18) {
			System.out.println("Você é menor de idade.");
		}	else if (idade >= 18 && idade < 30){
			System.out.println("Você ainda é jovem");
			}	else if (idade >= 30 && idade < 60) {
				System.out.println("Você é um adulto experiente");
			}	else if (idade >= 60) {
				System.out.println("Você é idoso");	
				}
			}
		}

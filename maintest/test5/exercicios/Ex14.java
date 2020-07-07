package maintest.test5.exercicios;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		// 14.Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um link de Internet (em Mbps), 
		// calcule e informe o tempo aproximado de download do arquivo usando este link (em minutos). 
		// Fonte dos exercícios: http://wiki.python.org.br//EstruturaSequencial 
		
		// People often incorrectly assume that a speed of 1 Mbps will allow them to download 1 MB in 1 second. This is not the case, 
		// because one byte contains eight bits, thus making a megabyte 8 times the size of a megabit; 
		// so to download 1 MB in 1 second you need a connection speed of 8 Mbps. The difference between a gigabyte (GB) and a gigabit (Gb) 
		// is the same: a gigabyte is 8 times larger than a gigabit.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual é o tamanho do arquivo para download (em MB)? ");
		double arquivoMegabyte = scan.nextDouble();
		double arquivoMegabit = arquivoMegabyte * 8;
		
		System.out.println("Qual é a velocidade do link (em Mbps)?" );
		double linkMegabitSeg = scan.nextDouble();
		double linkMegabitMin = linkMegabitSeg * 60;
				
		double tempoDeDownload = arquivoMegabit / linkMegabitMin;
		System.out.println("Tempo aproximado de download (em minutos): " + tempoDeDownload);
		
		scan.close();
	}

}

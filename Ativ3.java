package Somativa;

import java.util.Scanner;

public class Ativ3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int dia;

		System.out.println("Informe o dia da semana: ");
		dia = ler.nextInt();

		switch (dia) {
		case 1: 
			System.out.println("O dia é domingo.");
			break;
		case 2:
			System.out.println("O dia é segunda.");
			break;
		case 3:
			System.out.println("O dia é terça.");
			break;
		case 4:
			System.out.println("O dia é quarta.");
			break;
		case 5:
			System.out.println("O dia é quinta.");
			break;
		case 6:
			System.out.println("O dia é sexta.");
			break;
		case 7: 
			System.out.println("O dia é sábado.");
			break;
		default:
			System.out.println("O dia é inválido!");	
		}
	}

}

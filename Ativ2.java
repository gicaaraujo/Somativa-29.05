package Somativa;

import java.util.Scanner;

public class Ativ2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int base, altura, area;

		System.out.println("Informe o valor da base: ");
		base = ler.nextInt();

		System.out.println("Informe o valor da altura: ");
		altura = ler.nextInt(); // Entrada de dados


		area = (base * altura)/ 2; // Processamento


		System.out.println("O resultado da área é: " + area);  // Saída de dados

	}

}

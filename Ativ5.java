package Somativa;

import java.util.Scanner;

public class Ativ5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);


		String a [] = new String [6];

		for (int i = 0; i<6; i++) {

			System.out.println("Informe um carro: " + i);
			a[i] = ler.next();
		}
		for (int i = 0; i<6; i++) {

			System.out.println("Os carros na garagem são  | " + a[i] + " |");
		}








	}

}

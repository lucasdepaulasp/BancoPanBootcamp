package Atividades;

import java.util.Scanner;

public class desaFiodraGao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int casos = ler.nextInt();

		for (int i = 0; i < casos; i++) {
			int nivelEnergia = ler.nextInt();

			if (nivelEnergia > 8000) {
				System.out.println("Mais de 8000!");
			} else {
				System.out.println("Inseto!");
			}
		}
	}

}

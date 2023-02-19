package Atividades;

import java.util.*;

public class desafioCarros {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int custoFabrica = scan.nextInt();
		int porcentagemDistribuidor = scan.nextInt();
		int PercentualImpostos = scan.nextInt();

		int custoConsumidor;
		int Distribuidor;
		int ValorImpostos;

		Distribuidor = (custoFabrica * porcentagemDistribuidor) / 100;

		// calcular a porcentagem dos impostos

		ValorImpostos = (custoFabrica * PercentualImpostos) / 100;

		// calcular o custo do consumidor

		custoConsumidor = custoFabrica + Distribuidor + ValorImpostos;

		System.out.println(custoConsumidor);
	}

}
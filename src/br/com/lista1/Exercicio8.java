package br.com.lista1;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		double valFabrica, valDistribuidor, valImpostos, valCarro;
		
		
		System.out.print("Informe o valor do carro --> ");
		valFabrica = teclado.nextDouble();
		
		
		System.out.println(valFabrica);
		
		valDistribuidor =  valFabrica * 0.28;
		
		valImpostos = valFabrica * 0.45;
		
		valCarro = valFabrica + valDistribuidor + valImpostos;
				
		System.out.println(valCarro);
	}

}

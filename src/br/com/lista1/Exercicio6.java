package br.com.lista1;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		
		int a1, a2, n3, n4;
		double p1, p2, soma;
		
		System.out.print("Informe o primeiro n�mero --> ");
		a1 = teclado.nextInt();
		
		System.out.println("Informe o segundo n�mero --> ");
		a2 = teclado.nextInt();
		
		System.out.println("Informe o terceiro n�mero --> ");
		n3 = teclado.nextInt();
		
		System.out.println("Informe o quarto n�mero --> ");
		n4 = teclado.nextInt();
		
		soma = Math.sqrt(Math.pow((a2 - a1), 2) + Math.pow((n4 - n3), 2));
		
		System.out.println("O resultado final � --> "+soma);
		
		
		
	}

}

package br.com.lista1;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int n1, n2, n3;
		double media;
		
		
		System.out.print("Informe o primeiro n�mero --> ");
		n1 = teclado.nextInt();
		
		System.out.print("Informe o segundo n�mero --> ");
		n2 = teclado.nextInt();
		
		System.out.print("Informe o terceiro n�mero --> ");
		n3 = teclado.nextInt();
		
		media = ((n1 * 2) + (n2 * 3) + (n3 * 5)) / 10;
		
		System.out.println("A m�dia final � --> "+media);
		
		
;	}

}

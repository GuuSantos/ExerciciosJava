package br.com.lista1;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		double n1, n2, n3;
		double r, s, total;
		
		System.out.print("Informe o primeiro valor --> ");
		n1 = teclado.nextInt();
		
		System.out.print("Informe o segundo valor --> ");
		n2 = teclado.nextInt();
		
		System.out.print("Informe o terceiro valor --> ");
		n3 = teclado.nextInt();
		
		r = Math.pow((n1+n2), 2);
		s = Math.pow((n2+n3), 2);
		
		total = (r + s) / 2;
		
		System.out.println("O resultado final é --> "+total);
		
		
		
	}

}

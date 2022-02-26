package br.com.lista1;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		int a, b, c, d, e, f;
		double x, y;
		
		
		System.out.print("Informe A --> ");
		a = teclado.nextInt();
		
		System.out.print("Informe B --> ");
		b = teclado.nextInt();
		
		System.out.print("Informe C --> ");
		c = teclado.nextInt();
		
		System.out.print("Informe D --> ");
		d = teclado.nextInt();
		
		System.out.print("Informe E --> ");
		e = teclado.nextInt();
		
		System.out.print("Informe F --> ");
		f = teclado.nextInt();
		
		
		x = (c * e - b * f) / (a * e - b * d);
		
		y = (a * f - c * d) / (a * e - b * d);
		
		System.out.print("O valor é X é --> "+x);
		System.out.print("O valor é Y é --> "+y);
	}

}

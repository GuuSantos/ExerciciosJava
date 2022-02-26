package br.com.lista1;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		int anos, dias, meses, totalDias;
		
		
		System.out.print("Informe os dias vividos --> ");
		dias = teclado.nextInt();
		
		anos = dias/365;
		
		dias = dias % 365;
		
		meses = dias / 30;
		
		dias %= 30;
		
		totalDias = dias;
		
		System.out.print("Você viveu --> "+anos+" anos, "+meses+" meses e "+totalDias+" dias");
	}

}

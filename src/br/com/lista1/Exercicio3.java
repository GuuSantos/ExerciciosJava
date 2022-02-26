package br.com.lista1;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
			
		int seg, min, horas, sobra;
		
		System.out.print("Informe os segundos --> ");
		seg = teclado.nextInt();
		
		horas = seg/3600;
		
		sobra = seg - (horas * 3600);
		
		min = sobra / 60;
		
		seg = sobra - (min * 60);
				
		System.out.println("O tempo ocorreu em --> "+horas+" horas "+min+" minutos "+seg+" segundos");
		
	}

}

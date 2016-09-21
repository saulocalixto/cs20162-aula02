package main.java.com.github.kyriosdata.exemplo;

import java.util.Scanner;

public class potencia {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int numero, elevado;
		
		numero = Integer.parseInt(ler.nextLine());
		elevado = Integer.parseInt(ler.nextLine());
		
		int cont = 1, potencia = 1;
		
		while(cont <= elevado){
			potencia = potencia * numero;
			cont++;
		}
		
		System.out.println(potencia);

	}

}
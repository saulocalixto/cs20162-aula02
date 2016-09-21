package main.java.com.github.kyriosdata.exemplo;

import java.util.Scanner;

public class produto {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int a, b, maior, parcela;
		
		System.out.println("Digite os dois números que deseja multiplicar:");
		
		a = Integer.parseInt(ler.nextLine());
		b = Integer.parseInt(ler.nextLine());
		
		maior = (a > b) ? a : b;
		parcela = (a < b) ? a : b;
		
		int cont = 0, resultado = 0;
		
		while(cont < maior){
			
			resultado += parcela;
			cont++;
		}
		
		System.out.println("A multiplicação entre os número digitados é: " + resultado);

	}

}
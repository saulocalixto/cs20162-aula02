package main.java.com.github.kyriosdata.exemplo;

import java.util.Scanner;

public class somNumnat {

	public static void main(String[] args) {
		
		System.out.println("Entre com o número de números naturais consecutivos que deseja somar:");
		
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		
		int num = Integer.parseInt(ler.nextLine());
		
		int resultado = num * (num + 1) / 2;
		
		System.out.println("O resultado da Soma dos Primeiros naturais é: " + resultado);
		
		System.exit(0);

	}

    public static void somNume(int i) {
        if(i < 0) {
            throw new IllegalArgumentException("Número inválido."); //To change body of generated methods, choose Tools | Templates.
        }
            int resultado;
        if(i >= 0)
            resultado = i * (i + 1) / 2;
    }

}
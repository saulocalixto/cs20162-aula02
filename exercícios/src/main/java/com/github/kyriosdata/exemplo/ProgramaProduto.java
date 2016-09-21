package main.java.com.github.kyriosdata.exemplo;

import java.util.Scanner;

public class ProgramaProduto {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Digite os dois números que deseja multiplicar:");
		
		a = Integer.parseInt(ler.nextLine());
		b = Integer.parseInt(ler.nextLine());
                
                produto result = new produto();
                
                result.resultado(a, b);

	}

}
package main.java.com.github.saulocalixto.exercicios;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class ProgramaProduto {

    /**
     *
     * @param args
     */
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
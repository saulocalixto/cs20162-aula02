package main.java.com.github.saulocalixto.exercicios;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Potencia {

    /**
     *
     * @param args
     */
    public static int resultado (int x, int y) {
        
        if (x < 0 || y < 0){
            throw new IllegalArgumentException("Número inválido.");
        }
        
        int cont = 1, potencia = 1;

        while (cont <= y) {
            potencia = produto.resultado(potencia, x);
            cont++;
        }

        return (potencia);
    }

}

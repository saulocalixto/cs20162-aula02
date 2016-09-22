package main.java.com.github.saulocalixto.exercicios;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Primo {

    /**
     *
     * @param args
     */
    public static boolean primo(int n) {

        if (n <= 1) {
            throw new IllegalArgumentException("Número inválido.");
        }

        for (int cont = 2; cont <= (n - 1); cont++) {

            if (n % cont == 0) {
                return false;
            }
        }

        return true;

    }

}

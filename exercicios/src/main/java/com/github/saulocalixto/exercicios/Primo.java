package main.java.com.github.saulocalixto.exercicios;

import java.util.Scanner;

/**
 *Algoritmo que verifica se o número é primo.
 * @author Saulo Calixto
 */
public class Primo {

    /**
     *
     * @param n Número o qual quer descobrir se é primo ou não.
     * @return Se é primo ou não.
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

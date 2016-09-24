package com.github.saulocalixto.exercicios;

import java.util.Scanner;

/**
 *Algoritmo que verifica se o número tem a propriedade 3025
 * @author Saulo Calixto
 */
public class Pro3025 {

    /**
     *
     * @param n Número a ser verificado se tem a propriedade 3025
     * @return Se o número tem a propriedade ou não.
     */
    public static boolean resultado(int n) {

        if (n < 0 || n > 9999) {

            throw new IllegalArgumentException("Número inválido.");
        }

        double i = n / 100;
        double j = n % 100;
        double resultado = (i + j) * (i + j);

        return (resultado == n);

    }

}

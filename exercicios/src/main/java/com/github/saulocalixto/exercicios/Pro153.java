/*
 * Copyright (c) 2016. Engenharia de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 * Discente : Saulo de Araújo Calixto
 */

package com.github.saulocalixto.exercicios;

/**
 *Algoritmo que verifica se o número tem a propriedade 153.
 * @author Saulo Calixto
 */
public final class Pro153 {

    /**
     * Construtor privado para atender ao checkstyle.
     */

    private Pro153() {
    //Para atender ao checkstyle
}

    /**
     * Método para chamar o construtor privado e ter 100% no teste.
     */
    public static void chamarConstrutor() {
        Pro153 mdc = new Pro153();
    }

    /**
     * Número máximo da variável 9999.
     */
    private static final int MAX = 9999;

    /**
     * Constante contendo o valor 100 para poder separar o número.
     */
    private static final int DIVISORCEM = 100;

    /**
     * Constante contendo o valor 10 para poder separar o número.
     */
    private static final int DIVISORDEZ = 10;

    /**
     * Número que representa a potência a qual será elevado o número.
     */
    private static final int POTENCIA = 3;

    /**
     * @param n Número a ser verificado se tem a propriedade 153.
     * @throws IllegalArgumentException n não pode ser menor que 0 e não pode
     * ser maior que 9999
     * @return Retorna true caso o número tenha a propriedade 153. Retorna
     * false caso não.
     */
    public static boolean resultado(final int n) {

        if (n < 0 || n > MAX) {

            throw new IllegalArgumentException("Número inválido.");
        }

        int i, j, k;

        i = n / DIVISORCEM;
        j = (n - DIVISORCEM * i) / DIVISORDEZ;
        k = n % DIVISORDEZ;
        int resultado = (int) Math.pow(j, POTENCIA)
                + (int) Math.pow(i, POTENCIA) + (int) Math.pow(k, POTENCIA);

        return (n == resultado);
    }
}

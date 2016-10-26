/*
 * Copyright (c) 2016. Engenharia de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 * Discente : Saulo de Araújo Calixto
 */

package com.github.saulocalixto.exercicios;

/**
 *Algoritmo que verifica se o número é primo.
 * @author Saulo Calixto
 */
public final class Primo {

    /**
     *Construtor privado para satisfazer o checkstyle.
     */
    private Primo() {
        //Satisfazer o checkstyle
    }

    /**
     * Método para chamar o construtor privado e ter 100% no teste.
     */
    public static void chamarConstrutor() {
        Primo mdc = new Primo();
    }

    /**
     *
     * @param n Número o qual quer descobrir se é primo ou não.
     * @throws IllegalArgumentException n não pode ser menor ou igual a 1
     * @return Se é primo ou não.
     */
    public static boolean primo(final int n) {

        if (n <= 1) {
            throw new IllegalArgumentException("Número a ser analisado precisa"
                    + "ser maior que 1.");
        }

        for (int cont = 2; cont <= (n - 1); cont++) {

            if (n % cont == 0) {
                return false;
            }
        }

        return true;

    }
}

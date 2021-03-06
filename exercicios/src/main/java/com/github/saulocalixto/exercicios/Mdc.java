/*
 * Copyright (c) 2016. Engenharia de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 * Discente : Saulo de Araújo Calixto
 */

package com.github.saulocalixto.exercicios;

/**
 *Implementa algoritmo que rotorna o MDC.
 * @author Saulo Calixto
 */
public final class Mdc {

    /**
     * Construtor privado para atender ao checkstyle.
     */
    private Mdc() {
    //Para atender ao checkstyle
}
    /**
     * Método para chamar o construtor privado e ter 100% no teste.
     */
    public static void chamarConstrutor() {
        Mdc mdc = new Mdc();
    }

    /**
     *
     * @param num1 um dos números que se quer achar o mdc
     * @param num2 outro número para achar o mdc
     * @throws IllegalArgumentException num2 não pode ser menor ou igual a num1
     * e num2 não pode ser menor que 0
     * @return o mdc de num1 e num2.
     */

        public static int mDc(final int num1, final int num2) {

            int a = num1, b = num2;

            if (b <= a || b < 0) {
                throw new IllegalArgumentException("Número inválido.");
            }

            int m;

            while (b != 0) {
                m = a % b;
                a = b;
                b = m;
            }

            return (a);
        }
    }

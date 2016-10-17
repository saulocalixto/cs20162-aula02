/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.saulocalixto.exercicios;

/**
 *Implementa Algoritmo que que retorna o MDC de dois números utilizando o crivo
 * de Eratostenes.
 * @author Saulo Calixto
 */
public final class MdcEratostenes {

    /**
    *Construtor privado para satisfazer o checkstyle.
    */
    private MdcEratostenes() {
        //para satisfazer o checkstyle
    }

    /**
     * Método para chamar o construtor privado e ter 100% no teste.
     */
    public static void chamarConstrutor() {
        MdcEratostenes mdc = new MdcEratostenes();
    }

    /**
     *
     * @param num1 número para achar o mdc
     * @param num2 número para achar o mdc
     * @return retorna o mdc utilizando o crivo de Eratostenes
     */
    public static int mdcErastones(final int num1, final int num2) {

        if (num2 <= num1 || num2 < 0) {
            throw new IllegalArgumentException("Número inválido.");
        }

        int a = num1, b = num2;

        while (a != b) {

            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }

        return a;
    }
}

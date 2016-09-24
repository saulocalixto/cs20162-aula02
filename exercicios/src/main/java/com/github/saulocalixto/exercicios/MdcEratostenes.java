package com.github.saulocalixto.exercicios;

/**
 *Implementa Algoritmo que que retorna o MDC de dois números utilizando o crivo
 * de Eratostenes
 * @author Saulo Calixto
 */
public class MdcEratostenes {

    /**
     *
     * @param a número para achar o mdc
     * @param b número para achar o mdc
     * @return retorna o mdc utilizando o crivo de Eratostenes
     */
    public static int mdcErastones(int a, int b) {

        if (b <= a || b < 0) {
            throw new IllegalArgumentException("Número inválido.");
        }

        int m;

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

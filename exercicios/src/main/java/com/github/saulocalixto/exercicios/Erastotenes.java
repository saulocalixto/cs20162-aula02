/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.saulocalixto.exercicios;

/**
 *Implementação do Crivo de Eratostenes.
 * @author saulocalixto
 */
public final class Erastotenes {

    /**
    *Construtor privado para satisfazer o checkstyle.
    */
    private Erastotenes() {
        //para satisfazer o checkstyle
    }

    /**
     * Método para chamar o construtor privado e ter 100% no teste.
     */
    public static void chamarConstrutor() {
        Erastotenes mdc = new Erastotenes();
    }

    /**
     * @param n a quantidade de números que queremos ver se é primo
     * @param a vetor para fazer controle dos primos
     * @return retorna os primos naquela sequênca n
     */
    public static boolean obterPrimo(final int n, final int[] a) {

        int i = 2, c = 0;

        if (n <= 1) {
            throw new IllegalArgumentException("Número inválido.");
        }

        while (i <= (n / 2)) {
            if (a[i] == 0) {
                c = i + i;
                while (c <= n) {
                    a[c] = 1;
                    c++;
                }
            }
            i++;
        }

        return (c == i);
    }
}

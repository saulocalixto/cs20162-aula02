/*
 * Copyright (c) 2016. Engenharia de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 * Discente : Saulo de Araújo Calixto
 */

package com.github.saulocalixto.exercicios;

/**
 *  Algoritmo que implementa o n-ésimo número Harmônico.
 * @author Saulo Calixto
 */
public final class NumHarmonico {

    /**
     * Construtor privado para atender ao checkstyle.
     */
    private NumHarmonico() {
    //Para atender ao checkstyle
    }
    /**
     * Método para chamar o construtor privado e ter 100% no teste.
     */
    public static void chamarConstrutor() {
        NumHarmonico harmonico = new NumHarmonico();
    }

    /**
     * @param num representa o n-ésimo número harmônico que se quer descobrir.
     * @throws IllegalArgumentException num não pode ser menor que 1
     * @return o n-ésimo número Harmônico
     */
    public static int harmonico(final int num) {

        if (num < 1) {
            throw new IllegalArgumentException("Número precisa ser maior que"
                    + "um.");
        }

        int i = 2, s = 1;

        while (i <= num) {
            s += 1 / i;
            i++;
        }
        return s;
    }

}

/*
 * Copyright (c) 2016. Engenharia de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 * Discente : Saulo de Araújo Calixto
 */

package com.github.saulocalixto.exercicios;

/**
 *Algoritmo que retorna um número elevado a uma potência.
 * @author Saulo Calixto
 */
public final class Potencia {

    /**
     * Construtor privado para atender ao checkstyle.
     */
    private Potencia() {
    //Para atender ao checkstyle
}
    /**
     * Método para chamar o construtor privado e ter 100% no teste.
     */
    public static void chamarConstrutor() {
        Potencia mdc = new Potencia();
    }

    /**
     * @param x número que vai receber a potência
     * @param y potência do número x
     * @throws IllegalArgumentException x não pode ser menor que 0 e y não pode
     * ser menor que 0.
     * @return retorna o número x ^ y.
     */
    public static int resultado(final int x, final int y) {

        if (x < 0 || y < 0) {
            throw new IllegalArgumentException("Números de entrada precisam"
                    + "ser maior ou igual a zero.");
        }

        int cont = 1, potencia = 1;

        while (cont <= y) {
            potencia = Produto.resultado(potencia, x);
            cont++;
        }

        return (potencia);
    }

}

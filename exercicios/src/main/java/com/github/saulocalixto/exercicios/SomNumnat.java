package com.github.saulocalixto.exercicios;


/**
 *Algoritmo que faz soma dos números naturais.
 * @author Saulo Calixto
 */
public final class SomNumnat {

    /**
     *
     * Construtor privado para atender ao checkstyle.
     */
    private SomNumnat() {
    //Para atender ao checkstyle
}
    /**
     * Método para chamar o construtor privado e ter 100% no teste.
     */
    public static void chamarConstrutor() {
        SomNumnat soma = new SomNumnat();
    }

    /**
     * @param i representa quantos números naturais serão somados.
     * @throws IllegalArgumentException i não pode ser menor que 0
     * @return o resultado da soma dos primeiros naturais.
     */
    public static int somNume(final int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Número inválido.");
        }
        int resultado;

        resultado = i * (i + 1) / 2;

        return (resultado);
    }
}

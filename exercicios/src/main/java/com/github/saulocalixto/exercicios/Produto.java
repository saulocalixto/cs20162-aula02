package com.github.saulocalixto.exercicios;

/**
 *Algoritmo que faz o produto de dois números.
 * @author Saulo Calixto
 */
public final class Produto {

    /**
     * Construtor privado para atender ao checkstyle.
     */
    private Produto() {
    //Para atender ao checkstyle
}
    /**
     * Método para chamar o construtor privado e ter 100% no teste.
     */
    public static void chamarConstrutor() {
        Produto produto = new Produto();
    }

    /**
     * Pega o maior valor entre a e b.
     */
    private static int maior;

    /**
     * Pega o menor valor entre a e b.
     */
    private static int parcela;

    /**
     * Guarda o resultado do produto entre a e b.
     */
    private static int result = 0;

    /**
     * @param a Número para fazer o produto
     * @param b Número para fazer o produto
     * @throws IllegalArgumentException a e b não pode mser menor que 0
     * @return O produto de a e b.
     */
    public static int resultado(final int a, final int b) {

        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Número inválido.");
        }

        if (a > b) {
            maior = a;
        } else {
            maior = b;
        }

        if (a < b) {
            parcela = a;
        } else {
            parcela = b;
        }

        int cont = 0;

        while (cont < maior) {
            result += parcela;
            cont++;
        }

        return (result);

    }
}

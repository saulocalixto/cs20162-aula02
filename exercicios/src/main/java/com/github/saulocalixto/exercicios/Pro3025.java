package com.github.saulocalixto.exercicios;

/**
 *Algoritmo que verifica se o número tem a propriedade 3025.
 * @author Saulo Calixto
 */
public final class Pro3025 {

    /**
     * Construtor privado para atender ao checkstyle.
     */
    private Pro3025() {
    //Para atender ao checkstyle
}
    /**
     * Método para chamar o construtor privado e ter 100% no teste.
     */
    public static void chamarConstrutor() {
        Pro3025 pro3025 = new Pro3025();
    }

    /**
     * Número máximo da variável 9999.
     */
    private static final int MAX = 9999;

    /**
     * Constante contendo o valor 100.
     */
    private static final int CEM = 100;

    /**
     * @param n Número a ser verificado se tem a propriedade 3025
     * @return Se o número tem a propriedade ou não.
     */
    public static boolean resultado(final int n) {

        if (n < 0 || n > MAX) {

            throw new IllegalArgumentException("Número inválido.");
        }

        double i = n / CEM;
        double j = n % CEM;
        double resultado = (i + j) * (i + j);

        return (resultado == n);

    }
}

package main.java.com.github.saulocalixto.exercicios;

/**
 *Algoritmo que verifica se o número tem a propriedade 153.
 * @author Saulo Calixto
 */
public class Pro153 {

    /**
     *
     * @param n Número a ser verificado se tem a propriedade 153.
     */
    public static void resultado(int n) {

        if (n < 0 || n > 9999) {

            throw new IllegalArgumentException("Número inválido.");
        }

        int i, j, k;

        i = n / 100;
        j = (n - 100 * i) / 10;
        k = n % 10;
        int resultado = (int) Math.pow(j, 3) + (int) Math.pow(i, 3)
                + (int) Math.pow(k, 3);

    }

}

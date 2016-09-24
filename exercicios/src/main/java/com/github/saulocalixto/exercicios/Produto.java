package main.java.com.github.saulocalixto.exercicios;

/**
 *Algoritmo que faz o produto de dois números.
 * @author Saulo Calixto
 */
public class Produto {

    static private int maior;
    static private int parcela;
    static private int result = 0;

    /**
     *
     * @param a Número para fazer o produto
     * @param b Número para fazer o produto
     * @return O produto de a e b.
     */
    public static int resultado(int a, int b) {

        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Número inválido.");
        }

        maior = (a > b) ? a : b;
        parcela = (a < b) ? a : b;

        int cont = 0;

        while (cont < maior) {

            result += parcela;
            cont++;
        }

        return (result);

    }

}

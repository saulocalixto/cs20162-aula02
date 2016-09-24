
package main.java.com.github.saulocalixto.exercicios;

/**
 *
 * @author saulocalixto
 */
public class produto {

    static private int maior;
    static private int parcela;
    static private int result = 0;

    /**
     *
     * @param a
     * @param b
     */
    public static int resultado(int a, int b) {
        
        if(a >= 0 && b >= 0) {
            maior = (a > b) ? a : b;
            parcela = (a < b) ? a : b;

            int cont = 0;

            while (cont < maior) {

                result += parcela;
                cont++;
            }

            return (result);
        }
        else {
            throw new IllegalArgumentException("Número inválido.");
        }

    }
    
}

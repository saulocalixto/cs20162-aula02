
package main.java.com.github.kyriosdata.exemplo;

/**
 *
 * @author saulocalixto
 */
public class produto {

    static private int maior;
    static private int parcela;
    static private int result = 0;

    public static void resultado(int a, int b) {
        
        if(a >= 0 && b >= 0) {
            maior = (a > b) ? a : b;
            parcela = (a < b) ? a : b;

            int cont = 0;

            while (cont < maior) {

                result += parcela;
                cont++;
            }

            System.out.println("A multiplicação entre os número digitados é: " + result);
        }
        else {
            throw new IllegalArgumentException("Número inválido.");
        }

    }
    
}

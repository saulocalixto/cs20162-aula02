package main.java.com.github.saulocalixto.exercicios;

/**
 *
 * @author saulocalixto
 */
public class pro153 {

    /**
     *
     * @param n
     */
    public static void resultado(int n) {

        if (n >= 0 && n <= 999) {
            int i, j, k;

            i = n / 100;
            j = (n - 100 * i) / 10;
            k = n % 10;
            int resultado = (int) Math.pow(j, 3) + (int) Math.pow(i, 3)
                    + (int) Math.pow(k, 3);

        } else {
            throw new IllegalArgumentException("Número inválido.");
        }

    }

}

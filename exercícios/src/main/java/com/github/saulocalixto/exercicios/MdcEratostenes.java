package main.java.com.github.saulocalixto.exercicios;

/**
 *
 * @author sauloc
 */
public class Mdceratostenes {

    public static int mdcErastones(int a, int b) {

        if (b <= a || b < 0) {
            throw new IllegalArgumentException("Número inválido.");
        }

        int m;

        while (a != b) {

            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }

        return a;
    }
}

package main.java.com.github.saulocalixto.exercicios;


import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Pro3025 {
    
    /**
     *
     * @param n
     * @return
     */
    public static boolean resultado (int n) {
        
        if (n >= 0 && n <= 999){
        
            int i = n / 100, j = n % 100;
            
            return ( ( (i+j) * (i+j) ) == n );
            
        } else {
            
            throw new IllegalArgumentException("Número inválido.");
            
        }
        
    }
    
}

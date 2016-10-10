package com.github.saulocalixto.exercicios;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Implementação do Crivo de Eratostenes
 * @author saulocalixto
 */
public class Erastotenes {
    
    /**
     *
     * @param n a quantidade de números que queremos ver se é primo
     * @return retorna os primos naquela sequênca n
     */
    public static boolean Erastones (int n, int[] a) {
        
        int i = 2, c = 0;
        
        if (n <= 1) {
            throw new IllegalArgumentException("Número inválido.");
        }
        
        
        while (i <= (n / 2)) {
            if(a[i] == 0) {
                c = i + i;
                while(c <= n) {
                    a[c] = 1;
                    c++;
                }
            }
            i++;
        }
        
        return (c == i);  
    }
    
}

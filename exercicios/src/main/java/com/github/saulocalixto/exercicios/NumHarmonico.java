package main.java.com.github.saulocalixto.exercicios;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Algoritmo que implementa o n-ésimo número Harmônico
 * @author Saulo Calixto
 */
public class NumHarmonico {
    
    /**
     *
     * @param num representa o n-ésimo número harmônico que se quer descobrir
     * @return o n-ésimo número Harmônico
     */
    public static int harmonico (int num){
        
        if(num < 1) {
            throw new IllegalArgumentException("Número inválido.");
        }
        
        int i = 2, s = 1;
        
        while(i <= num){
            s += 1 / i;
            i++;
        }
        return s;
    }
    
}

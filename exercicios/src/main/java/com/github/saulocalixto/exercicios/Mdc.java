package main.java.com.github.saulocalixto.exercicios;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Implementa algoritmo que rotorna o MDC
 * @author Saulo Calixto
 */
public class Mdc {   
    
    /**
     *
     * @param b um dos números que se quer achar o mdc
     * @param a outro número para achar o mdc
     * @return o mdc dos dois números
     */   
        
        public static int mDc (int a, int b) {
            
            if(b <= a || b < 0) {
                throw new IllegalArgumentException("Número inválido.");
            }
            
            int m;

            while(b != 0){
                m = a % b;
                a = b;
                b = m;
            }

            return (a);
        }
    }

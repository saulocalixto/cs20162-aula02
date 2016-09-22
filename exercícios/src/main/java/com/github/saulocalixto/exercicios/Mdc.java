package main.java.com.github.saulocalixto.exercicios;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sauloc
 */
public class Mdc {   
    
    /**
     *
     * @param args
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

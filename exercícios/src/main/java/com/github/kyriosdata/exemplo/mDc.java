package main.java.com.github.kyriosdata.exemplo;


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
public class mDc {
    
    static Scanner ler = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int a, m, b;
        
        System.out.println("Digite os dois números de que deseja saber o MDC:");
        
        b = Integer.parseInt(ler.nextLine());
        a = Integer.parseInt(ler.nextLine());
        
        while(b != 0){
            m = a % b;
            a = b;
            b = m;
        }
        
        System.out.println("O MDC é " + a);
    }
    
}

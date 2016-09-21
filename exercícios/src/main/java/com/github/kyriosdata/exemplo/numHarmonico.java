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
public class numHarmonico {
    static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        
        int num;
        
        System.out.println("Digite a posição do número Harmônico desejada:");
        num = Integer.parseInt(ler.nextLine());
        
        System.out.println("O número é: " + harmonico(num));
        
    }
    
    static int harmonico (int num){
        
        int i = 2, s = 1;
        
        while(i <= num){
            s += 1 / i;
            i++;
        }
        return s;
    }
    
}

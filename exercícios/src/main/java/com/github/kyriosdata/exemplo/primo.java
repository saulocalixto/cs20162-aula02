package main.java.com.github.kyriosdata.exemplo;


import java.util.Scanner;


public class primo {
    
    static Scanner ler = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.println("Entre com o número que deseja saber se é primo");
        
        int num = Integer.parseInt(ler.nextLine());
        
        if(primo(num)){
            System.out.println("O Número é primo.");
        } else {
            System.out.println("O Número não é primo.");
        }
        
        
        
    }
    
    static boolean primo (int n){
        
        for(int cont = 2; cont <= (n-1); cont++ ){
            
            if(n % cont == 0){
                return false;
            }
        }
        
        return true;
        
    }
    
}

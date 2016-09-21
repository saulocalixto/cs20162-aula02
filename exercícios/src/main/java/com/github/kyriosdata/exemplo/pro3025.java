package main.java.com.github.kyriosdata.exemplo;


import java.util.Scanner;


public class pro3025 {
    
    static Scanner ler = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.println("Entre com o número que deseja verificar se faz"
                + " parte da propriedade 3025: ");
        
        int num = Integer.parseInt(ler.nextLine());
        
        if(propriedade(num)){
            System.out.println("Número tem a propriedade 3025.");
        } else {
            System.out.println("Número não tem a propriedade 3025.");
        }
        
      
    }
    
    static boolean propriedade (int n) {
        
        int i = n / 100, j = n % 100;
        
        return Math.pow( (i+j), 2 ) == n;
    }
    
}

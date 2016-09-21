package main.java.com.github.kyriosdata.exemplo;


import java.util.Scanner;


public class pro153 {
    
    static Scanner ler = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.println("Entre com o número que deseja verificar se faz"
                + " parte da propriedade 153: ");
        
        int num = Integer.parseInt(ler.nextLine());
        
        if(propriedade(num)){
            System.out.println("Número tem a propriedade 153.");
        } else {
            System.out.println("Número não tem a propriedade 153.");
        }
    }
    
    static boolean propriedade (int n) {
        
        int i, j ,k;
        
        i = n / 100;
        j = (n - 100 * i) / 10;
        k = n % 10;
        int resultado = (int) Math.pow( j, 3 ) + (int) Math.pow( i, 3 ) + 
                (int) Math.pow( k, 3 );
        
        return resultado == n;
    }
    
}

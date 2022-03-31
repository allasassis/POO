package javaapplication5;

import java.util.Scanner;

public class Exec3Din {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o 1° número:");
        int a = sc.nextInt();
        
        System.out.println("Digite o 2° número:");
        int b = sc.nextInt();
        
        System.out.println("Digite o X:");
        int x = sc.nextInt();
        
        String Operacao = Exec3Est.Operacao(a, b, x);
    }
}

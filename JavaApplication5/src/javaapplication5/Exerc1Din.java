package javaapplication5;
import java.util.Scanner;
public class Exerc1Din {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o valor do produto: ");
        int valor = sc.nextInt();
        
        System.out.println("Digite o código do produto: ");
        int code = sc.nextInt();
        
        String Aumento = Exerc1Est.Aumento(code, valor);
        System.out.println(Aumento);
        
    }
}

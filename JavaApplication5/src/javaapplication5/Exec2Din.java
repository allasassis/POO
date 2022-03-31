package javaapplication5;
import java.util.Scanner;
public class Exec2Din {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de KG que comprou de maçã: ");
        double pesoMaca = sc.nextDouble();
        
        System.out.println("Digite a quantidade de KG que comprou de morango: ");
        double pesoMorango = sc.nextDouble();
        
        System.out.println("Digite a quantidade de KG que comprou de pêra: ");
        double pesoPera = sc.nextDouble();
        
        String conta = new Exec2Est(pesoMaca, pesoMorango, pesoPera).CalcularPreco();
        System.out.println(conta);
        
    }
}

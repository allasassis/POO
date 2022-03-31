package javaapplication5;
import java.util.Scanner;
public class JavaApplication5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // EXERCICIO 3
        
        int a = sc.nextInt();
        System.out.println("Digite o 1° número:");
        
        int b = sc.nextInt();
        System.out.println("Digite o 2° número:");
        
        int x = sc.nextInt();
        System.out.println("Digite o 3° número:");
        

        // EXERCICIO 4 - FEITO
        
        System.out.println("Digite as horas trabalhadas: ");
        int horas = sc.nextInt();
        System.out.println("Digite o valor das horas trabalhadas: ");
        double valorHoras = sc.nextDouble();
        
        // salario bruto = quantidade de horas * o valor da hora
        
        double salarioBruto = horas * valorHoras;
        double reajuste;
        
        if (salarioBruto <= 500) {
            reajuste = salarioBruto * 1.15;
            System.out.println("O seu salário agora é: " + reajuste);
        } else if (salarioBruto > 500 && salarioBruto <= 1000) {
            reajuste = salarioBruto * 1.10;
            System.out.println("O seu salário agora é: " + reajuste);
        } else if (salarioBruto > 1000) {
            reajuste = salarioBruto * 1.05;
            System.out.println("O seu salário agora é: " + reajuste);
        }
        
        // EXERCICIO 5 - FEITO
        
        System.out.println("Digite a velocidade máxima permitida na via: ");
        int velMax = sc.nextInt();
        System.out.println("Digite a velocidade que VOCÊ estava na via: ");
        int velMot = sc.nextInt();
        
        double multa;
        int velDif = velMot - velMax;
        
        if (velDif <= 10) {
            multa = 50;
            System.out.println("A sua multa é de: " + multa + " reais!");
        } else if (velDif > 10 && velDif <= 30) {
            multa = 100;
            System.out.println("A sua multa é de: " + multa + " reais!");
        } else if (velDif > 30) {
            multa = 200;
            System.out.println("A sua multa é de: " + multa + " reais!");
        } 
        
        // EXERCICIO 6 - FEITO
        
        
        System.out.println("Digite a QUANTIDADE de horas trabalhadas: ");
        int hrTrab = sc.nextInt();
        System.out.println("Digite o VALOR das horas trabalhadas: ");
        int hrVlr = sc.nextInt();
        
        double dsctInss, dsctIr;
        double slrBrt = hrTrab * hrVlr;
        
        if (slrBrt <= 1000) {
            dsctInss = slrBrt * 0.08;
        } else {
            dsctInss = slrBrt * 0.09;
        }
        
        if (slrBrt <= 500) {
            dsctIr = 0;
        } else if (slrBrt > 500 && slrBrt <= 1000) {
            dsctIr = slrBrt * 0.06;
        } else {
            dsctIr = slrBrt * 0.07;
        }
        
        double salLiq = slrBrt - dsctInss - dsctIr;
        
        System.out.println("O seu salário liquido é de: " + salLiq);
    }
    
}

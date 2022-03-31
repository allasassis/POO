package javaapplication5;
public class Exerc1Est {
    public static String Aumento(int code, int valor) {
        
        double valorTotal;
        
        if (code == 1) {
           valorTotal = valor * 1.10;
           return "O novo valor é: " + valorTotal;
        } else if (code == 2) {
            valorTotal = valor * 1.15;
            return "O novo valor é: " + valorTotal;
        } else if (code == 3) {
            valorTotal = valor * 1.20;
            return "O novo valor é: " + valorTotal;
        } else {
            valorTotal = valor * 1.25;
            return "O novo valor é: " + valorTotal;
        }
        
    } 
}

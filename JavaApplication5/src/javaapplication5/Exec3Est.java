package javaapplication5;
public class Exec3Est {
    public static String Operacao(int a, int b, int x) {
        
        int resultado;
        if (x >= 10) {
            resultado = a + b;
            System.out.println("O resultado é: " + resultado);
        } else {
            resultado = a - b;
            System.out.println("O resultado é: " + resultado);
        }
        return null;
    }
}

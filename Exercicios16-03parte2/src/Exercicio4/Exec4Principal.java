package Exercicio4;
import java.util.Scanner;
public class Exec4Principal {
    public static void main(String args[]) {
    
    Scanner obj = new Scanner(System.in);
    Exec4Est objExec4 = new Exec4Est();
    
    System.out.println("Informe o número: ");
    objExec4.recebe(obj.nextInt());
    System.out.println("O sucessor é: " + objExec4.Sucessor() + ", e o antecessor é: " + objExec4.Antecessor());
    
}
}

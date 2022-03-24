package Exercicio5;
import java.util.Scanner;
public class Exec5Principal {
    public static void main(String args[]) {
    Scanner objS = new Scanner(System.in);
    Exec5Est obj = new Exec5Est();
    
    System.out.println("Informe a quantidade 1 e valor 1");
    obj.QtdVlr1(objS.nextFloat(), objS.nextFloat());
    
    System.out.println("Informe a quantidade 2 e valor 2");
    obj.QtdVlr2(objS.nextFloat(), objS.nextFloat());
    
    System.out.println("Informe a quantidade 3 e valor 3");
    obj.QtdVlr3(objS.nextFloat(), objS.nextFloat());
    
    System.out.println("Sub1 " + obj.Sub1());
    System.out.println("Sub2 " + obj.Sub2());
    System.out.println("Sub3 " + obj.Sub3());
    System.out.println("Total " + obj.Total());
    }
}

package Exercicio3;
import java.util.Scanner;
public class Exec3Principal {
   public static void main(String args[]){
       Scanner objScan = new Scanner(System.in);
       Exec3Est objExec3 = new Exec3Est();
       
System.out.println("Informe notas 1, 2 e 3");
objExec3.RecNotas(objScan.nextFloat(), objScan.nextFloat(), objScan.nextFloat());

System.out.println("Média das notas é: " + objExec3.media());
   }
}

package exercicios16.pkg03parte2;
import java.util.Scanner;
public class PrincipalExec2 {
    public static void main(String args[]){
        Scanner objScan = new Scanner(System.in);
        Exec2Est objExec2Est = new Exec2Est();
        float vlrTotal=0, vlrLitro=0;
        
        System.out.println("Informe o valor do litro e o valor gasto: ");
        objExec2Est.recebe(vlrLitro, vlrTotal);
        
        System.out.println("Quantidade de litros no tanque " + objExec2Est.qtdLitroNoTanque());
        
        
    }
}

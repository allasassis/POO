package exercicios16.pkg03;
import java.util.Scanner;
public class Exec1Principal {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        Exec1Principal objEst = new Exec1Principal();
        
        int qtdPao, qtdBroa;
        System.out.println("Informe quantidade de pão: ");
        qtdPao = obj.nextInt();
        
        System.out.println("Informe quantidade de broa: ");
        qtdBroa = obj.nextInt();
        
        objEst.recebe(qtdPao, qtdBroa);
        
        System.out.println("Valor total da compra" + objEst.TotalVenda());
        System.out.println("Valor poupança" + objEst.TotalVenda());
        
    }

    
}

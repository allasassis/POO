package Exercicio4;
public class Exec4Est {
    private int numero;
    
    public void recebe(int numero) {
        this.numero = numero;
    }
    
    public int Sucessor(){
        return this.numero + 1;
    }
    
    public int Antecessor() {
        return this.numero - 1;
    }
    
}

package Exercicio3;
public class Exec3Est {
    private float nota1, nota2, nota3;
    
    public void RecNotas(float nota1, float nota2, float nota3) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        
    }
    
    public float media() {
        return ((this.nota1 * 2) + (this.nota2 * 3) + (this.nota3 * 5)) / 10;
        
    }
}

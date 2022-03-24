package exercicios16.pkg03parte2;
public class Exec2Est {
    private float vlrLitro, vlrTotalGasto;
    
    public void recebe(float vlrLitro, float vlrTotalGasto) {
        this.vlrLitro = vlrLitro;
        this.vlrTotalGasto = vlrTotalGasto;
    }
    
    public float qtdLitroNoTanque() {
        return this.vlrTotalGasto / this.vlrLitro;
    }
    
}

package exercicios16.pkg03; 
public class Exec1 {
    private int qntdPao, qntdBroa;
    private float vlrPoupanca;
    
    public void recebe(int qntdPao, int qntdBroa) {
        this.qntdPao = qntdPao;
        this.qntdBroa = qntdBroa;
    }
    
    public float TotalVenda() {
        float vlrTotalPao, vlrTotalBroa, vlrTotalVenda;
        vlrTotalPao = this.qntdPao * 0.12f;
        vlrTotalBroa = this.qntdBroa * 1.50f;
        vlrTotalVenda = vlrTotalPao + vlrTotalBroa;
        this.vlrPoupanca = (vlrTotalVenda * 10/100);
        return vlrTotalVenda;
    }
    
    public float vlrPoupanca() {
        return this.vlrPoupanca;
    }
    
}

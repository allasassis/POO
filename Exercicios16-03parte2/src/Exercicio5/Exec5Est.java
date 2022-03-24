package Exercicio5;
public class Exec5Est {
    private float qtd1, qtd2, qtd3, vlr1, vlr2, vlr3;
    
    public void QtdVlr1(float qtd1, float vlr1){
        this.qtd1 = qtd1;
        this.vlr1 = vlr1;
    }
    
    public void QtdVlr2(float qtd2, float vlr2){
        this.qtd2 = qtd2;
        this.vlr2 = vlr2;
    }
    
    public void QtdVlr3(float qtd3, float vlr3){
        this.qtd3 = qtd3;
        this.vlr3 = vlr3;
    }
    
    public float Sub1(){
        return this.qtd1 * this.vlr1;
    }
    
    public float Sub2(){
        return this.qtd2 * this.vlr2;
    }
    
    public float Sub3(){
        return this.qtd3 * this.vlr3;
    }
    
    public float Total(){
        return (this.qtd1 * this.vlr1) + (this.qtd2 * this.vlr2) + (this.qtd3 * this.vlr3);
    }
    
    
}

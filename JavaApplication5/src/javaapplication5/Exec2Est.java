package javaapplication5;
public class Exec2Est {
    
    private static double morangoPeso;
    private static double macaPeso;
    private static double peraPeso;
    private static double valorTotal;
    private static double pesoTotal;
    
    private static final double PRECO_MORANGO_5KG = 2.50;
    private static final double PRECO_MACA_5KG = 2.80;
    private static final double PRECO_PERA_5KG = 2.20;
    
    private static final double PRECO_MORANGO_5KGMAIS = 2.20;
    private static final double PRECO_MACA_5KGMAIS = 2.50;
    private static final double PRECO_PERA_5KGMAIS = 2.10;
    
    public Exec2Est(double morangoPeso, double macaPeso, double peraPeso) {
        
        this.macaPeso = macaPeso;
        this.morangoPeso = morangoPeso;
        this.peraPeso = peraPeso;
         
    }
    
    public static String CalcularPreco() {
    
    if (morangoPeso > 5.0) {
        valorTotal += morangoPeso * PRECO_MORANGO_5KGMAIS;
    } else {
        valorTotal += morangoPeso * PRECO_MORANGO_5KG;
    }

    if (macaPeso > 5.0) {
        valorTotal += macaPeso * PRECO_MACA_5KGMAIS;
    } else {
        valorTotal += macaPeso * PRECO_MACA_5KG;
    }
    
    if (peraPeso > 5.0) {
        valorTotal += peraPeso * PRECO_PERA_5KGMAIS;
    } else {
        valorTotal += peraPeso * PRECO_PERA_5KG;
    }
    
    
    pesoTotal = peraPeso + morangoPeso + macaPeso;    
        
        
    if (pesoTotal > 24 && valorTotal > 75) {
        
        valorTotal = valorTotal * 0.95;
        
    }
        
        return "O valor total desconto foi " + valorTotal;

    } 
}

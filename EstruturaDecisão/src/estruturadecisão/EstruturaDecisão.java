package estruturadecisão;
import java.util.Scanner;
public class EstruturaDecisão {
    public static void main(String[] args) {
        
    /*    String nome = "J";
        char nome1 = 'D'; // CHAR usa aspas simples, enquanto string usa aspas duplas
        
        if (nome.equals("J")) */
    
    // EXERCICIO 1
    Scanner sc = new Scanner(System.in);
    int numero = sc.nextInt();
    double metade;
    
        if (numero > 20) {
            metade = numero / 2;
            System.out.println("A metade do número é: " + metade);
        } else {
            System.out.println("Seu número não é válido");
        }
        
        
        
    // EXERCICIO 2
    
    int num2 = sc.nextInt();
    
    if (num2 >= 50 && num2 <= 100) {
        System.out.println("Pertence ao intervalo");
    } else {
        System.out.println("Não pertence ao intervalo");
    }
    
    // EXERCICIO 3
    
    int num3 = sc.nextInt();
    int num4 = sc.nextInt();
    int dif1 = num3 - num4;
    int dif2 = num4 - num3;
    
    if (num3 == num4) {
        System.out.println("Números iguais");
    } else if (num3 > num4) {
        System.out.println("A diferença entre os números é: " + dif1);
    } else if (num4 > num3) {
        System.out.println("A diferença entre os números é: " + dif2);
    }
    
    
    
    // EXERCICIO 4
    
    double db1 = sc.nextDouble();
    double db2 = sc.nextDouble();
    
    if (db1 > db2) {
        System.out.println("Em ordem decrescente vem o numero: " + db2 + " e depois o " + db1);
    } else {
        System.out.println("Em ordem decrescente vem o numero: " + db1 + " e depois o " + db2);
    }
    
    
    // EXERCICIO 5
    
    int tmpTrab = sc.nextInt();
    double sal = sc.nextDouble();
    double bonus;
    
    if (tmpTrab >= 5) {
        bonus = sal * 0.2;
        System.out.println("O bônus foi de: " + bonus);
    } else {
        bonus = sal * 0.1;
        System.out.println("O bônus foi de: " + bonus);
    }
    
    
    // EXERCICIO 6
    
    int idade = sc.nextInt();
    
    if (idade >= 18) {
        System.out.println("Você é maior de idade");
    } else {
        System.out.println("Você é MENOR de idade");
    }
    
    
    // EXERCICIO 7
    
    double alt = sc.nextDouble();
    double peso = sc.nextDouble();
    double pesoIdealH, pesoIdealM;
    
    pesoIdealH = (72.7 * alt) - 58;
    pesoIdealM = (62.1 * alt) - 44.7;
    
    System.out.println("Se você for homem o seu peso ideal é: " + pesoIdealH);
    System.out.println("Se você for mulher o seu peso ideal é: " + pesoIdealM);
    
    // EXERCICIO 8
    
    String senha, tentativa;
    senha = sc.next();
    
    if (senha.equals("R10p5")) {
        System.out.println("Acesso concedido!");
    } else {
        System.out.println("Acesso NEGADO!");
    }
    
    
    // EXERCICIO 9
    
    double salBruto = sc.nextDouble();
    double valorPrest = sc.nextDouble();
    double porcentagem = (valorPrest * 0.3);
    
    
    if ((salBruto / 0.3) >= porcentagem) {
        System.out.println("Empréstimo concedido!");
    }
    
    
    // EXERCICIO 10
    
    int idadeNadador = sc.nextInt();
    
    if (idadeNadador < 5) {
        System.out.println("Bebê");
    } else if (idadeNadador >= 5 && idadeNadador <= 7) {
        System.out.println("Infantil A");
    } else if (idadeNadador >= 8 && idadeNadador <= 10) {
        System.out.println("Infantil B");
    } else if (idadeNadador >= 11 && idadeNadador <= 13) {
        System.out.println("Juvenil A");
    } else if (idadeNadador >= 14 && idadeNadador <= 17) {
        System.out.println("Juvenil A");
    } else if (idadeNadador >= 18) {
        System.out.println("Sênior");
    }
    
    // EXERCICIO 11
    
    double salInss = sc.nextDouble();
    double desconto;
    
    if (salInss <= 600) {
        System.out.println("Você está isento");
    } else if (salInss > 600 && <= 1200) {
        desconto = salInss * 0.2;
        System.out.println("Você está isento de: " + desconto);
    } else if (salInss > 1200 && <= 2000) {
        desconto = salInss * 0.25;
        System.out.println("Você está isento de: " + desconto);
    } else if (salInss > 2000) {
        desconto = salInss * 0.3;
        System.out.println("Você está isento de: " + desconto);
    }
    
    // EXERCICIO 12
    
    String user;
    System.out.println("Você quer somar, subtrair, multiplicar ou dividir? Em seguida digite os dois números");
    user = sc.next();
    int number1 = sc.nextInt();
    int number2 = sc.nextInt();
    double resultado;
    
    if (user.equals("somar")) {
       resultado = number1 + number2;
       System.out.println("A SOMA dos números é: " + resultado);
    } else if (user.equals("subtrair")) {
        resultado = number1 - number2;
        System.out.println("A SUBTRAÇÃO dos números é: " + resultado);
    } else if (user.equals("dividir")) {
        resultado = number1 / number2;
        System.out.println("A DIVISÃO dos números é: " + resultado);
    } else if (user.equals("multiplicar")) {
        resultado = number1 * number2;
        System.out.println("A MULTIPLICAÇÃO dos números é: " + resultado);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
}

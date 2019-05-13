
public class ContaBancaria {
    String nomeDoCliente; 
    int numero;
    double saldo = 500.00;

    public void sacar (double valorasersacado) {

    if (saldo >= valorasersacado) {
        
        saldo = saldo - valorasersacado;
        System.out.println("Seu saldo disponível agora é de:" + saldo);
    } 

    else {
        System.out.println("Saldo insuficiente.");
    }
}

    public void depositar (double valoraserdepositado) {
        
    if (valoraserdepositado < 0) {
        
        System.out.println("Valor inválido.");
    }
    
    else {
        saldo = saldo + valoraserdepositado;
        System.out.println("Seu saldo disponível agora é de:" + saldo);
    }
        
    }
}
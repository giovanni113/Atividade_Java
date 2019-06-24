import java.util.Scanner;

public class ContaBancaria {

    private Double cpf;
    private Double senha;
    private String nomeDoCliente;
    private int numero;
    double saldo = 500.00;
  
    Scanner scan = new Scanner(System.in);

    public void sacar(double valorasersacado) {

        if (saldo >= valorasersacado) {

            saldo = saldo - valorasersacado;
            System.out.println("Seu saldo disponível agora é de:" + saldo);
            System.out.println("");
        } else {
            System.out.println("Saldo insuficiente.");
            System.out.println("");
        }
    }

    public void depositar(double valoraserdepositado) {

        if (valoraserdepositado < 0) {

            System.out.println("Valor inválido.");
        } else {
            saldo = saldo + valoraserdepositado;
            System.out.println("Seu saldo disponível agora é de:" + saldo);
            System.out.println("");
        }

    }

    public Double getCpf() {
        return cpf;
    }

    public void setCpf(Double cpf) {
        this.cpf = cpf;
    }

    public Double getSenha() {
        return senha;
    }

    public void setSenha(Double senha) {
        this.senha = senha;
    }

    public String getNomeDoCliente() {
        return nomeDoCliente;
    }

    public void setNomeDoCliente(String nomeDoCliente) {
        this.nomeDoCliente = nomeDoCliente;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Scanner getScan() {
        return scan;
    }

    public void setScan(Scanner scan) {
        this.scan = scan;
    }
    
}

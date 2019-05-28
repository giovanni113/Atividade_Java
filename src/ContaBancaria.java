import java.util.Scanner;

public class ContaBancaria {


    Double cadastrocpf;
    Double cpf;
    Double cadastrosenha;
    Double senha;
    Double nomeDoCliente;
    int numero;
    double saldo = 500.00;
    int option;

    Scanner scan = new Scanner(System.in);

    public void sacar(double valorasersacado) {

        if (saldo >= valorasersacado) {

            saldo = saldo - valorasersacado;
            System.out.println("Seu saldo disponível agora é de:" + saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void depositar(double valoraserdepositado) {

        if (valoraserdepositado < 0) {

            System.out.println("Valor inválido.");
        } else {
            saldo = saldo + valoraserdepositado;
            System.out.println("Seu saldo disponível agora é de:" + saldo);
        }

    }
}

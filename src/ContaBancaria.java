
import java.util.Scanner;

public class ContaBancaria {
    
    ContaBancaria contaBancaria = new ContaBancaria();

    String cadastro;
    String senha;
    String nomeDoCliente;
    int numero;
    double saldo = 500.00;
    int option;

    Scanner scan = new Scanner(System.in);

    public void comparar(double valorasercomparado) {

        if (cadastro.equals(valorasercomparado)) {

            do {
                System.out.println("Digite sua senha:");
                System.out.println("=== 1- Saque ===");
                System.out.println("=== 2- Depósito ===");
                System.out.println("=== 3- Encerrar ===");
                System.out.println(" Opção: ");
                option = scan.nextInt();

                switch (option) {
                    case 1:
                        contaBancaria = new ContaBancaria();
                        System.out.println("Valor a ser sacado:");
                        contaBancaria.sacar(scan.nextDouble());
                        break;
                    case 2:
                        contaBancaria = new ContaBancaria();
                        System.out.println("Valor a ser depositado:");
                        contaBancaria.depositar(scan.nextDouble());
                        break;
                    case 3:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Opção inválida.");
                }
            } while (option != 0);
        }
    }

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

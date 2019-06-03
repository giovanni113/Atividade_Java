import java.util.Scanner;
import java.util.ArrayList;

public class ClassePrincipal {

    public static void main(String[] args) {

        int option;
        int i = 0;
        ContaBancaria contaBancaria = new ContaBancaria();
        Scanner scan = new Scanner(System.in);
        ArrayList<Double> cadastrocpf = new ArrayList();
        ArrayList<Double> cadastrosenha = new ArrayList();

        do {
            System.out.println("======== Selecione uma opção =======");
            System.out.println("=== 1- Cadastrar ===");
            System.out.println("=== 2- Log in ===");
            System.out.print("-> Opção: ");
            option = scan.nextInt();
            System.out.println("");

            switch (option) {
                case 1:
                    System.out.print("Digite seu CPF: ");
                    cadastrocpf.add(scan.nextDouble());
                    System.out.println("");
                    System.out.print("Digite sua nova senha: ");
                    cadastrosenha.add(scan.nextDouble());
                    System.out.println("");
                    break;
                case 2:
                    System.out.print("Digite seu CPF: ");
                    contaBancaria.cpf = (scan.nextDouble());
                    System.out.println("");
                    System.out.print("Digite sua senha: ");
                    contaBancaria.senha = (scan.nextDouble());
                    System.out.println("");
                default:
                    System.out.println("Opção inválida.");

                    if ( i < cadastrocpf.size() &&  i < cadastrosenha.size()) {

                        if (!cadastrocpf.contains(contaBancaria.cpf) && !cadastrosenha.contains(contaBancaria.senha)) {

                            do {
                                System.out.println("Digite sua senha:");
                                System.out.println("=== 1- Saque ===");
                                System.out.println("=== 2- Depósito ===");
                                System.out.println("=== 3- Verificar Saldo ===");
                                System.out.println("=== 4- Encerrar ===");
                                System.out.print("-> Opção: ");
                                option = scan.nextInt();
                                System.out.println("");

                                switch (option) {
                                    case 1:
                                        contaBancaria = new ContaBancaria();
                                        System.out.print("Valor a ser sacado:");
                                        contaBancaria.sacar(scan.nextDouble());
                                        break;
                                    case 2:
                                        contaBancaria = new ContaBancaria();
                                        System.out.print("Valor a ser depositado:");
                                        contaBancaria.depositar(scan.nextDouble());
                                        break;
                                    case 3:
                                        System.out.print("Seu saldo atual é de: ");
                                        System.out.println(contaBancaria.saldo);
                                        System.out.println("");
                                        break;
                                    case 4:
                                        System.exit(0);
                                        break;
                                    default:
                                        System.out.println("Opção inválida.");

                                }

                            } while (option != 0);
                        } else {
                            System.out.println("");
                            System.out.println("Log in inválido.");
                            System.out.println("");
                        }
                    }

            }

        } while (option != 0);
        System.out.println("Programa encerrado.");
//        ContaBancaria contaBancaria = new ContaBancaria();
//        
//        System.out.println("Digite seu Nome:");
//        contaBancaria.nomeDoCliente = scan.next();
//        
//        System.out.println("Digite sua senha:");
//        contaBancaria.numero = scan.nextInt();
//        
//        System.out.println("Valor a ser sacado:");
//        contaBancaria.sacar  (scan.nextDouble());
//        
//        System.out.println("Valor a ser depositado:");
//        contaBancaria.depositar (scan.nextDouble());
    }
}

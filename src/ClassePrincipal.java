import java.util.Scanner;

public class ClassePrincipal {

    public static void main(String[] args) {

        int option;
        ContaBancaria contaBancaria = new ContaBancaria();
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("======== Selecione uma opção =======");
            System.out.println("=== 1- Cadastrar ===");
            System.out.println("=== 2- Senha ===");
            System.out.println(" Opção: ");
            option = scan.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Digite seu CPF: ");
                    contaBancaria.cadastrocpf = (scan.nextDouble());
                    System.out.println("Digite sua nova senha: ");
                    contaBancaria.cadastrosenha = (scan.nextDouble());
                    break;
                case 2:
                    System.out.println("Digite seu CPF: ");
                    contaBancaria.cpf = (scan.nextDouble());
                    System.out.println("Digite sua senha: ");
                    contaBancaria.senha = (scan.nextDouble());

                    if (contaBancaria.cadastrosenha.equals(contaBancaria.senha) && contaBancaria.cadastrocpf.equals(contaBancaria.cpf)) {

                        do {
                            System.out.println("Digite sua senha:");
                            System.out.println("=== 1- Saque ===");
                            System.out.println("=== 2- Depósito ===");
                            System.out.println("=== 3- Verificar Saldo ===");
                            System.out.println("=== 4- Encerrar ===");
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
                                    System.out.println("Seu saldo atual é de: ");
                                    System.out.println(contaBancaria.saldo);
                                    break;
                                case 4:
                                    System.exit(0);
                                    break;
                                default:
                                    System.out.println("Opção inválida.");

                            }

                        }while (option != 0); 
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

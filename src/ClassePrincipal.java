import java.util.Scanner;

public class ClassePrincipal {

    public static void main(String[] args) {

        int option;

        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("======== Selecione uma opção =======");
            System.out.println("=== 1- Cadastrar ===");
            System.out.println("=== 2- Senha ===");
            System.out.println(" Opção: ");
            option = scan.nextInt();

            switch (option) {
                case 1:
                    System.out.println("");
                    break;
                case 2:
                    do {
                        ContaBancaria contaBancaria = new ContaBancaria();
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
                    System.out.println("Programa encerrado.");

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

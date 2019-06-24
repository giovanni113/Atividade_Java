import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ClassePrincipal {

    public static void main(String[] args) {

        int option;
        int i = 0;
        ContaBancaria contaBancaria = new ContaBancaria();
        Scanner scan = new Scanner(System.in);

        List<ContaBancaria> contas = new ArrayList<>();

        do {
            System.out.println("======== Selecione uma opção =======");
            System.out.println("=== 1 - Cadastrar ===");
            System.out.println("=== 2 - Log in ===");
            System.out.println("=== 3 - Encerrar ===");
            System.out.print("-> Opção: ");
            option = scan.nextInt();
            System.out.println("");

            switch (option) {
                case 1:
                    ContaBancaria conta = new ContaBancaria();

                    System.out.print("Digite seu CPF: ");
                    conta.setCpf(scan.nextDouble());
                    System.out.println("");

                    System.out.print("Digite sua nova senha: ");
                    conta.setSenha(scan.nextDouble());
                    System.out.println("");

                    System.out.print("Digite seu nome: ");
                    conta.setNomeDoCliente(scan.next());
                    System.out.println("");

                    contas.add(conta);

                    break;
                case 2:
                    System.out.print("Digite seu CPF: ");
                    Double cpf = scan.nextDouble();

                    System.out.println("");
                    System.out.print("Digite sua senha: ");
                    Double senha = scan.nextDouble();
                    System.out.println("");

                    for (int j = 0; contas.size() > j; j++) {
                        if (contas.get(j).getCpf().equals(cpf) && contas.get(j).getSenha().equals(senha)) {

                            do {
                                System.out.println("Digite sua senha:");
                                System.out.println("=== 1 - Saque ===");
                                System.out.println("=== 2 - Depósito ===");
                                System.out.println("=== 3 - Verificar Saldo ===");
                                System.out.println("=== 4 - Verificar Conta ===");
                                System.out.println("=== 5 - Encerrar ===");
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
                                        System.out.print("CPF: ");
                                        System.out.println(contas.get(j).getCpf());
                                        System.out.println("");
                                        
                                        System.out.print("Senha: ");
                                        System.out.println(contas.get(j).getSenha());
                                        System.out.println("");
                                        
                                        System.out.print("Nome: ");
                                        System.out.println(contas.get(j).getNomeDoCliente());
                                        System.out.println("");
                                        break;
                                    case 5: 
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
                    break;

                case 3:
                    System.exit(0);
                    break;
            }

        } while (option != 0);
        System.out.println("Programa encerrado.");
    }

}

//                              
//



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
                    System.out.println("Digite sua nova senha: ");
                    contaBancaria.cadastro = scan.next();
                    break;
                case 2:
                    System.out.println("Digite sua senha: ");
                    contaBancaria.comparar(scan.nextDouble());
                    break;
                        
            }
                    System.out.println("Programa encerrado.");
            
            
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

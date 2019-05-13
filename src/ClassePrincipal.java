
import java.util.Scanner;

public class ClassePrincipal {
    
    public static void main(String[] args) {
        
        ContaBancaria contaBancaria = new ContaBancaria();
        
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Digite seu Nome:");
        contaBancaria.nomeDoCliente = scan.next();
        
        System.out.println("Digite sua senha:");
        contaBancaria.numero = scan.nextInt();
        
        System.out.println("Valor a ser sacado:");
        contaBancaria.sacar  (scan.nextDouble());
        
        System.out.println("Valor a ser depositado:");
        contaBancaria.depositar (scan.nextDouble());
       
    }
}


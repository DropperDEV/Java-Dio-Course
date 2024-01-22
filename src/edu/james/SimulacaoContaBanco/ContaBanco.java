package edu.james.SimulacaoContaBanco;
import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número da conta:");
        int numeroConta;

        while (!sc.hasNextInt()) {
            System.out.println("Por favor, digite um número válido para a conta:");
            sc.next();
        }

        numeroConta = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite o seu nome:");
        String nomeCliente = sc.nextLine();

        System.out.println("Digite o nome da agência:");
        String agencia = sc.nextLine();

        System.out.println("Digite o seu saldo:");

        double saldo;
        while (true) {
            try {
                saldo = Double.parseDouble(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Por favor, digite um valor numérico para o saldo:");
            }
        }

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco. Sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.%n", nomeCliente, agencia, numeroConta, saldo);
        sc.close();
    }
}

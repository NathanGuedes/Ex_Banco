package application;

import entities.BankAccount;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {

            BankAccount account;

            // Solicitando o número da conta
            System.out.print("Enter account number: ");
            int accountNumber = sc.nextInt();
            sc.nextLine(); // Consumir a quebra de linha pendente

            // Solicitando o nome do titular da conta
            System.out.print("Enter account holder: ");
            String accountHolder = sc.nextLine();

            // Verificando se haverá depósito inicial
            System.out.print("Is there an initial deposit (y/n)? ");
            char initialDeposit = sc.nextLine().charAt(0);
            while (initialDeposit != 'y' && initialDeposit != 'n') {
                System.out.print("Is there an initial deposit (y/n)? ");
                initialDeposit = sc.next().charAt(0);
            }

            // Criando a conta bancária com ou sem depósito inicial
            if (initialDeposit == 'y') {
                System.out.print("Enter initial deposit value: ");
                double initialDepositValue = sc.nextDouble();
                account = new BankAccount(accountNumber, accountHolder, initialDepositValue);
            } else {
                account = new BankAccount(accountNumber, accountHolder);
            }

            // Exibindo os dados da conta
            System.out.println();
            System.out.println("Account data: ");
            System.out.println(account);

            // Realizando um depósito
            System.out.println();
            System.out.print("Enter a deposit value: ");
            double depositValue = sc.nextDouble();
            account.deposit(depositValue);
            System.out.println("Updated account data: ");
            System.out.println(account);

            // Realizando um saque
            System.out.println();
            System.out.print("Enter a withdraw value: ");
            double withdrawValue = sc.nextDouble();
            account.withdraw(withdrawValue);
            System.out.println("Updated account data: ");
            System.out.println(account);
        }
    }
}

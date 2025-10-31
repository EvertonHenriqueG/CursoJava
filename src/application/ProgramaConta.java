package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class ProgramaConta {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Conta conta;

        System.out.print("Digite o número da conta: ");
        int number =  sc.nextInt();
        System.out.print("Digite o titular da conta: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.println("Tem depósito inicial (y/n)? ");
        char response = sc.next().charAt(0);
        if (response == 'y') {
            System.out.print("Digite o valor inicial: ");
            double initialDeposit = sc.nextDouble();
            conta = new Conta(number, holder, initialDeposit);
        }
        else {
            conta = new Conta(number, holder);
        }

        System.out.println();
        System.out.println("Dados da conta:");
        System.out.println(conta);

        System.out.println();
        System.out.print("Digite um valor de deposito: ");
        double depositValue = sc.nextDouble();
        conta.deposit(depositValue);
        System.out.println("Dados da conta atualizados: ");
        System.out.println(conta);

        System.out.println();
        System.out.print("Digite um valor para saque: ");
        double withdrawValue = sc.nextDouble();
        conta.wihdraw(withdrawValue);
        System.out.println("Dados da conta atualizados: ");
        System.out.println(conta);



        sc.close();
    }
}

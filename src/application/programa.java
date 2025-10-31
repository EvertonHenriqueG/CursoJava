package application;

import java.util.Scanner;
import java.util.Locale;

import entities.empregador;

public class programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        empregador empregador = new empregador();

        System.out.print("Digite o nome do funcionário: ");
        empregador.name = sc.nextLine();

        System.out.print("Digite o valor do salário (grosso):");
        empregador.salariogrosso = sc.nextDouble();

        System.out.print("Digite o valor de imposto do salário:");
        empregador.tax = sc.nextDouble();

        System.out.println();
        System.out.println("Empregado: " + empregador);

        System.out.println();

        System.out.print("Qual a porcentagem de aumento? : ");
        double porncentagem = sc.nextDouble();
        empregador.incrementoSalario(porncentagem);

        System.out.println();
        System.out.println("Dados atualizados: " + empregador);

        sc.close();

    }
}

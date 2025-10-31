package application;

import utilitarios.Conversao;

import java.util.Scanner;
import java.util.Locale;

public class Ativ {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do dólar: ");
        double precoDolar = sc.nextDouble();
        System.out.println("Digite a quantia que deseja comprar");
        double quantidade = sc.nextDouble();
        double resultado = Conversao.dolarParaReal(quantidade, precoDolar);
        System.out.printf("Valor a ser pago em reais = %.2f%n", resultado);
    }
}

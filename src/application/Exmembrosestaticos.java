package application;

import utilitarios.Calculator;

import java.util.Scanner;
import java.util.Locale;

public class Exmembrosestaticos {


    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite o valor do raio");
        double raio = sc.nextDouble();

        double c = Calculator.circumferencia(raio);

        double v = Calculator.volume(raio);

        System.out.printf("Circumferencia: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("Valor do PI: %.2f%n", Calculator.PI);

        sc.close();
    }
}

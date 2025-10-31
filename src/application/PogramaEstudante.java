package application;

import java.util.Scanner;
import java.util.Locale;

import entities.Estudante;

public class PogramaEstudante {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        Estudante estudante = new Estudante();

        estudante.name = sc.nextLine();
        estudante.grade1 = sc.nextDouble();
        estudante.grade2 = sc.nextDouble();
        estudante.grade3 = sc.nextDouble();

        System.out.printf("FINAL GRADE: %.2F%n", estudante.finalGrade());

        if (estudante.finalGrade() < 60.0) {
            System.out.println("reprovado");
            System.out.printf("%.2f Pontos faltando", estudante.pontosFalando());
        } else {
            System.out.println("Aprovado");
        }


        sc.close();
    }
}

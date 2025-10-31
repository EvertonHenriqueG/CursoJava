package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pensionato;

public class DesafioPensionato {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Pensionato[] vect = new Pensionato[10];

        System.out.println("Digite quantos quartos deseja alugar? ");
        int n =  sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Aluguel #" + i + ":");
            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Quarto: ");
            int roomNumber = sc.nextInt();

            vect[roomNumber] = new Pensionato(name, email);
        }

        System.out.println();
        System.out.println("DADOS DELES");
        for (int i = 0; i < 10; i++) {
            if (vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
            }

        }



        sc.close();
    }
}

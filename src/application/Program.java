package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Entre com os dados do produto:");

        System.out.print("Nome: ");
        product.name = sc.nextLine();

        System.out.print("Preço: ");
        product.price = sc.nextDouble();

        System.out.print("Quantidade: ");
        product.quantity = sc.nextInt();


        System.out.println();
        System.out.println("Dados do produto: " + product);

        System.out.println();
        System.out.print("Entre com o número de produtos a ser adicionado ao estoque: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Dados atualizados: " + product);

        System.out.println();
        System.out.print("Entre com o número de produtos para serem removidos do estoque: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Dados atualizados: " + product);

        sc.close();
    }
}

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product02;

public class Program02 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();

        Product02 product02 = new Product02(name, price);

        product02.setName("Computer");
        System.out.println("Updated name: " +product02.getName());
        product02.setPrice(1200.00);
        System.out.println("Update price: " + product02.getPrice());

        System.out.println();
        System.out.println("Product data: " + product02);

        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product02.addProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product02);

        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product02.removeProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product02);

        sc.close();
    }
}

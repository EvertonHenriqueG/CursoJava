package application;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Locale;
import java.util.List;

import entities.Employee;

public class Programa2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("Quantos funcionarios vão ser registrados?");
        int N =sc.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.println();
            System.out.println("Funcionario #" + (i+1) + ":");
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            Employee emp = new Employee(id, name, salary);

            list.add(emp);
        }

        System.out.print("Entre com o id do funcionario que tera o salario incrementado: ");
        int idsaslary = sc.nextInt();
        Integer pos = position (list, idsaslary);
        if (pos == null) {
            System.out.println("Este Id não existe!");
        } else {
            System.out.print("Entre com a porncetagem: ");
            double percent = sc.nextDouble();
            list.get(pos).increaseSalary(percent);
        }

        System.out.println();
        System.out.println("Lista de funcionarios: ");
        for (Employee emp : list) {
            System.out.println(emp);
        }




        sc.close();

    }

    public static Integer position (List<Employee> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }
}

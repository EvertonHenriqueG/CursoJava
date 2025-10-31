package entities;

public class empregador {
    public String name;
    public double salariogrosso;
    public double tax;

    public double salarioLiquido() {
        return salariogrosso - tax;
    }

    public void incrementoSalario(double porcentagem) {
        salariogrosso += salariogrosso * porcentagem / 100.0;
    }

    public String toString() {
        return name + ", $ " + String.format("%.2f", salarioLiquido());
    }
}

import java.util.Scanner;

public class Exercício12Aula4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o salário: ");
        double salario = sc.nextDouble();

        double desconto;

        if (salario <= 600) {
            desconto = 0;
        } else if (salario <= 1200) {
            desconto = salario * 0.20;
        } else if (salario <= 2000) {
            desconto = salario * 0.25;
        } else {
            desconto = salario * 0.30;
        }

        System.out.println("O desconto do INSS é: " + desconto);
    }
}
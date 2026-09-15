import java.util.Scanner;

public class Exercício7Aula4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o salário: ");
        double salario = sc.nextDouble();
        System.out.print("Digite os anos de empresa: ");
        int anos = sc.nextInt();

        double bonus;

        if (anos >= 5) {
            bonus = salario * 0.20;
        } else {
            bonus = salario * 0.10;
        }

        System.out.println("O valor do bônus é: " + bonus);
    }
}
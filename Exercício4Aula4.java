import java.util.Scanner;

public class Exercício4Aula4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double n1 = sc.nextDouble();
        System.out.print("Digite o segundo número: ");
        double n2 = sc.nextDouble();

        if (n1 > n2) {
            System.out.println(n1);
            System.out.println(n2);
        } else {
            System.out.println(n2);
            System.out.println(n1);
        }
    }
}
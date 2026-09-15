import java.util.Scanner;

public class Exercício1Aula4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        if (numero > 20) {
            double metade = numero / 2.0;
            System.out.println("A metade é: " + metade);
        }
    }
}
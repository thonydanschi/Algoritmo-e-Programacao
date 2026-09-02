import java.util.Scanner;

public class Exercício3Aula3 {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int n1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int n2 = sc.nextInt();
        int produto = n1 * n2;
        System.out.println("O produto é: " + produto);
    }
}

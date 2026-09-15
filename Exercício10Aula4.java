import java.util.Scanner;

public class Exercício10Aula4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int n1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int n2 = sc.nextInt();
        System.out.print("Digite o terceiro número: ");
        int n3 = sc.nextInt();

        if (n1 == n2 && n2 == n3) {
            System.out.println("Os números são iguais");
        } else {
            int maior = n1;
            if (n2 > maior) {
                maior = n2;
            }
            if (n3 > maior) {
                maior = n3;
            }
            System.out.println("O maior número é: " + maior);
        }
    }
}
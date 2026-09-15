import java.util.Scanner;

public class Exercício13Aula4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double n1 = sc.nextDouble();
        System.out.print("Digite o segundo número: ");
        double n2 = sc.nextDouble();
        System.out.print("Digite a operação (+, -, *, /): ");
        char operacao = sc.next().charAt(0);

        double resultado;

        if (operacao == '+') {
            resultado = n1 + n2;
            System.out.println("Resultado: " + resultado);
        } else if (operacao == '-') {
            resultado = n1 - n2;
            System.out.println("Resultado: " + resultado);
        } else if (operacao == '*') {
            resultado = n1 * n2;
            System.out.println("Resultado: " + resultado);
        } else if (operacao == '/') {
            if (n2 <= 0) {
                System.out.println("Impossível dividir!");
            } else {
                resultado = n1 / n2;
                System.out.println("Resultado: " + resultado);
            }
        } else {
            System.out.println("Sinal Inválido");
        }
    }
}
import java.util.Scanner;

public class Exercício6Aula4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a altura (em metros): ");
        double altura = sc.nextDouble();
        System.out.print("Digite o sexo (M/F): ");
        char sexo = sc.next().charAt(0);

        double peso;

        if (sexo == 'M' || sexo == 'm') {
            peso = (72.7 * altura) - 58;
        } else {
            peso = (62.1 * altura) - 44.7;
        }

        System.out.println("O peso ideal é: " + peso + " kg");
    }
}
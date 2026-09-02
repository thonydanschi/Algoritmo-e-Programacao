import java.util.Scanner;

public class Exercício12Aula3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        double n = sc.nextDouble();

        double quadrado = Math.pow(n, 2);
        double cubo = Math.pow(n, 3);
        double raiz = Math.sqrt(n);
        double potencia10 = Math.pow(n, 10);

        System.out.println("Quadrado: " + quadrado);
        System.out.println("Cubo: " + cubo);
        System.out.println("Raiz quadrada: " + raiz);
        System.out.println("Potência 10: " + potencia10);
    }
}
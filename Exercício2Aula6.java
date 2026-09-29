import java.util.Scanner;

public class Exercício2Aula6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int contador = 0;   
        int pares = 0;
        int impares = 0;

        while (contador < 10) {
            System.out.print("Digite o número " + (contador + 1) + ": ");
            int numero = entrada.nextInt();

            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }

            contador++;
        }

        System.out.println("Quantidade de pares: " + pares);
        System.out.println("Quantidade de ímpares: " + impares);

        entrada.close();
    }

}
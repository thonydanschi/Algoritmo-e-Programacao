import java.util.Scanner;

public class Exercício6Aula6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int contador = 0;                   
        int menor = 0;                      

        while (contador < 10) {             
            System.out.print("Digite o número " + (contador + 1) + ": ");
            int numero = entrada.nextInt();

            if (contador == 0 || numero < menor) {
                menor = numero;
            }

            contador++;                     
        }

        System.out.println("O menor número é: " + menor);

        entrada.close();
    }
}
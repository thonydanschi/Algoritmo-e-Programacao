import java.util.Scanner;

public class Exercício3Aula6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int limite = entrada.nextInt();

        int valor = 1;                 

        while (valor <= limite) {       
            valor = valor * 2;          
        }

        entrada.close();
    }
}
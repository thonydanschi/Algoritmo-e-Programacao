import java.util.Scanner;

public class Exercício7Aula6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int contador = 0;                   
        int contadorNormal = 0;           

        while (contador < 10) {           
            System.out.print("Pessoa " + (contador + 1) + " - Altura (m): ");
            double altura = entrada.nextDouble();

            System.out.print("Pessoa " + (contador + 1) + " - Peso (kg): ");
            double peso = entrada.nextDouble();

            double imc = peso / (altura * altura);
            System.out.println("IMC: " + imc);

            if (imc >= 18.5 && imc <= 24.9) {
                contadorNormal++;
            }

            contador++;                    
        }

        System.out.println("Pessoas com IMC entre 18,5 e 24,9: " + contadorNormal);

        entrada.close();
    }
}
import java.util.Scanner;

public class Exercício5Aula3 {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        double n1 = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double n2 = sc.nextDouble();
        System.out.print("Digite a terceira nota: ");
        double n3 = sc.nextDouble();
        double media = (n1 + n2 + n3) / 3.0;
        System.out.println("A média é: " + media);
    }
}


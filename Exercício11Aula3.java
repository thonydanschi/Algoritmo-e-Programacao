import java.util.Scanner;

public class Exercício11Aula3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = sc.nextInt();
        System.out.print("Digite o ano atual: ");
        int anoAtual = sc.nextInt();

        int idade = anoAtual - anoNascimento;
        int idadeEm2030 = 2030 - anoNascimento;

        System.out.println("Idade atual: " + idade);
        System.out.println("Idade em 2030: " + idadeEm2030);
    }
}
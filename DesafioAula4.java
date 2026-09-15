import java.util.Scanner;
// Regras para se votar no Brasil:
//Nacionalidade é verificada primeiro — se não for brasileiro (nem português com Estatuto de Igualdade), já bloqueia tudo.
//Conscrito vem em seguida — mesmo sendo brasileiro e maior de idade, quem está no serviço militar obrigatório não pode votar nesse período.
//Idade mínima (16 anos) elimina quem é jovem demais.
//Se passou por todas essas barreiras, só falta decidir se o voto é obrigatório ou facultativo: só é obrigatório se a pessoa tiver entre 18 e 69 anos e for alfabetizada. 
//Qualquer coisa fora disso (16-17, 70+, ou analfabeto de qualquer idade dentro da faixa apta) cai no último else — facultativo.
public class DesafioAula4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a idade: ");
        int idade = sc.nextInt();

        System.out.print("É brasileiro(a) ou português(a) com Estatuto de Igualdade? (S/N): ");
        char nacionalidade = sc.next().charAt(0);

        System.out.print("É alfabetizado(a)? (S/N): ");
        char alfabetizado = sc.next().charAt(0);

        System.out.print("Está cumprindo serviço militar obrigatório (conscrito)? (S/N): ");
        char conscrito = sc.next().charAt(0);

        if (nacionalidade == 'N' || nacionalidade == 'n') {
            System.out.println("Não pode votar - nacionalidade não permitida");
        } else if (conscrito == 'S' || conscrito == 's') {
            System.out.println("Não pode votar - conscritos não podem votar durante o serviço militar");
        } else if (idade < 16) {
            System.out.println("Não pode votar - idade mínima não atingida");
        } else if (idade >= 18 && idade <= 69 && (alfabetizado == 'S' || alfabetizado == 's')) {
            System.out.println("Apto a votar - Voto obrigatório");
        } else {
            System.out.println("Apto a votar - Voto facultativo");
        }
    }
}
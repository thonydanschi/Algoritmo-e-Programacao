import java.util.Scanner;

public class Exercício9Aula6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("===== CARDÁPIO =====");
        System.out.println("100 - Cachorro quente   R$ 1,20");
        System.out.println("101 - Bauru simples     R$ 1,30");
        System.out.println("102 - Bauru com ovo     R$ 1,50");
        System.out.println("103 - Hambúrguer        R$ 1,20");
        System.out.println("104 - Cheeseburguer     R$ 1,30");
        System.out.println("105 - Refrigerante      R$ 1,00");
        System.out.println();

        double totalCompra = 0;             
        char continuar;

        do {
            System.out.print("Digite o código do produto: ");
            int codigo = entrada.nextInt();

            System.out.print("Digite a quantidade: ");
            int quantidade = entrada.nextInt();

            double preco = 0;
            String produto = "";

            switch (codigo) {
                case 100:
                    produto = "Cachorro quente";
                    preco = 1.20;
                    break;
                case 101:
                    produto = "Bauru simples";
                    preco = 1.30;
                    break;
                case 102:
                    produto = "Bauru com ovo";
                    preco = 1.50;
                    break;
                case 103:
                    produto = "Hambúrguer";
                    preco = 1.20;
                    break;
                case 104:
                    produto = "Cheeseburguer";
                    preco = 1.30;
                    break;
                case 105:
                    produto = "Refrigerante";
                    preco = 1.00;
                    break;
                default:
                    System.out.println("Código inválido!");
            }

            if (preco > 0) {
                double totalProduto = preco * quantidade;
                totalCompra = totalCompra + totalProduto;
                System.out.println(quantidade + " x " + produto + " = R$ " + totalProduto);
            }

            System.out.print("Deseja continuar comprando? (S/N): ");
            continuar = entrada.next().charAt(0);
            System.out.println();

        } while (continuar == 'S' || continuar == 's');

        System.out.println("Valor total da compra: R$ " + totalCompra);

        entrada.close();
    }
}
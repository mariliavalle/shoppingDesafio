import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do seu limite: ");
        CartaoCredito cartao = new CartaoCredito(scan.nextDouble());

        Compra brusinha;
        int decisao = 0;

        do {
            System.out.println("Descrição da compra: ");
            String descricao = scan.next();

            System.out.println("Valor da compra: ");
            double valor = scan.nextDouble();

            brusinha = new Compra(descricao, valor);

            if (cartao.lancaCompra(brusinha)) {
                System.out.println("Compra realizada!");
                System.out.println("Digite 0 para continuar comprado ou 1 para sair");
                decisao = scan.nextInt();
            } else {
                System.out.println("Compra finalizada, saldo insuficiente!");
                break;
            }

        } while (cartao.getSaldo() > 0 && decisao == 0);


        System.out.println("-------------------------");
        System.out.println("Lista de Compras:");
        for (Compra compra : cartao.getCompras()) {
            System.out.println(compra);
        }
        System.out.println("-------------------------");

        System.out.println("Saldo cartão: " + cartao.getSaldo());

    }
}
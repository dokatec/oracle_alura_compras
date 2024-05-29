import Models.Cartao;
import Models.Produto;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Cartao cartao = new Cartao();
        Produto produto = new Produto();
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o limite do cartão: ");
        double limite = leitura.nextDouble();
        cartao.setCredito(limite);
        System.out.println("Digite a descrição da compra: ");
        String nome = leitura.next();
        produto.setProduto(nome);
        System.out.println("Digite o valor da compra: ");
        double valor = leitura.nextDouble();
        cartao.setDebito(valor);

        if (limite >= valor) {
            double saldo = limite - valor;
            cartao.setSaldo(saldo);
            System.out.println("Compra realizada: " + "SALDO: " + cartao.getSaldo());
        } else if (limite <= valor) {
            System.out.println("Saldo insuficiente: " + cartao.getSaldo());
        }

    }
}

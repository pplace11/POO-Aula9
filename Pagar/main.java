package Pagar;

public class main {
    public static void main(String[] args) {
        Pagamento pagamentoAPagamento = new PagamentoAPronto();
        Pagamento pagamentoPrestacoes = new PagamentoAPronto();

        double valorTotalAVista = pagamentoAPagamento.calcularTotal(5);
        System.out.println("Valor total a vista é " + valorTotalAVista + " euros.");

        double valorTotalAPrazo = pagamentoPrestacoes.calcularTotal(5);
        System.out.println("Valor total a prazo é " + valorTotalAPrazo + " euros.");
    }
}

package Pagar;

public interface Pagamento {
    double calcularDesconto(double valorBase, double taxa);
    double calcularTotal(int produtos);
}

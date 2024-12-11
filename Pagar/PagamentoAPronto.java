package Pagar;

public class PagamentoAPronto implements Pagamento {
    @Override
    public double calcularDesconto(double valorBase, double taxa){
        return valorBase - (valorBase * taxa / 100);
    }

    @Override
    public double calcularTotal(int produtos){
        double precoUnitario = 10.0;
        return produtos * precoUnitario * (1 - calcularDesconto(precoUnitario, 10));
    }
}

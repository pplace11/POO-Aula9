package Pagar;

public class PagamentoPrestacoes implements Pagamento {
    @Override
    public double calcularDesconto(double valorBase, double taxa){
        return 0;
    }

    @Override
    public double calcularTotal(int produtos){
        double precoUnitario = 10.0;
        double juros = 5.0;
        return produtos * precoUnitario * (1 + juros / 100);
    }
}

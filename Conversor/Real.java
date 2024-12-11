package Conversor;

public class Real implements Conversao {
    private static final double TAXA_Euro = 6.31;
    private static final double TAXA_Dolar = 5.97;

    @Override
    public double converterParaEuro(double valor) {
        return valor / TAXA_Euro;
    }

    @Override
    public double converterParaDolar(double valor) {
        return valor / TAXA_Dolar;
    }
}

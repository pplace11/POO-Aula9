package Conversor;

public class Libra implements Conversao {
    private static final double TAXA_Euro = 1.17;
    private static final double TAXA_Dolar = 1.38;

    @Override
    public double converterParaEuro(double valor) {
        return valor / TAXA_Euro;
    }

    @Override
    public double converterParaDolar(double valor) {
        return valor / TAXA_Dolar;
    }
}

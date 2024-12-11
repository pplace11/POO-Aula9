package Conversor;

public class Peso implements Conversao {
    private static final double TAXA_Euro = 21.34;
    private static final double TAXA_Dolar = 20.20;

    @Override
    public double converterParaEuro(double valor) {
        return valor * TAXA_Euro;
    }

    @Override
    public double converterParaDolar(double valor) {
        return valor * TAXA_Dolar;
    }
}

package CoversaoMedidas;

public class Metro implements ConverteMedidas {
    private double valor;

    public Metro(double valor){
        this.valor = valor;
    }

    @Override
    public double converteAcima(){
        return valor / 1000;
    }

    @Override
    public double converteBaixo(){
        return valor / 100;
    }
}

package CoversaoMedidas;

public class Minuto implements ConverteMedidas {
    private double valor;

    public Minuto(double valor){
        this.valor = valor;
    }

    @Override
    public double converteAcima(){
        return valor / 60;
    }

    @Override
    public double converteBaixo(){
        return valor * 60;
    }
    
}

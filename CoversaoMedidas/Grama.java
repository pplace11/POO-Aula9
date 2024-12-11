package CoversaoMedidas;

public class Grama implements ConverteMedidas {
    private double valor;

    public Grama(double valor){
        this.valor = valor;
    }

    @Override
    public double converteAcima(){
        return valor / 1000;
    }

    @Override
    public double converteBaixo(){
        return valor * 1000;
    }
    
}

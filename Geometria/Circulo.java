package Geometria;

public class Circulo implements Medidas {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    public double calcularVolume() {
        return 0;
    }
    
}

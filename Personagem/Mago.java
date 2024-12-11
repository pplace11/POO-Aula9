package Personagem;

public class Mago implements Atacavel, Defensavel {
    private double tamanhoAcao;
    private int inteligencia;

    public Mago(double tamanhoAcao, int inteligencia){
        this.tamanhoAcao = tamanhoAcao;
        this.inteligencia = inteligencia;
    }

    @Override
    public int calcularDano(){
        double areaTriangulo = 0.5 * tamanhoAcao * tamanhoAcao;
        return (int) (areaTriangulo * inteligencia);
    }

    @Override
    public int calcularDefesa(){
        return (int) Math.pow(tamanhoAcao, 2);
    }
}

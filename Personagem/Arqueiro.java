package Personagem;

public class Arqueiro implements Atacavel, Defensavel {
    private double raioAcao;
    private int agilidade;

    public Arqueiro(double raioAcao, int agilidade){
        this.raioAcao = raioAcao;
        this.agilidade = agilidade;
    }

    @Override
    public int calcularDano(){
        double areaCirculo = Math.PI * Math.pow(raioAcao, 2);
        return (int) (areaCirculo + Math.pow(agilidade, 2));
    }

    @Override
    public int calcularDefesa(){
        return 0;
    }
}

package Personagem;

public class Guerreiro implements Atacavel, Defensavel {
    private int forca;
    private int recistencia;

    public Guerreiro(int forca, int recistencia){
        this.forca = forca;
        this.recistencia = recistencia;
    }

    @Override
    public int calcularDano(){
        return (int) Math.pow(forca, recistencia);
    }

    @Override
    public int calcularDefesa(){
        return (int) Math.pow(recistencia, forca);
    }
}

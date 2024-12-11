package CoversaoMedidas;

public class Main {
    public static void main(String[] args) {
        Metro metro = new Metro(1500);
        System.out.println("1500 metros equivalem a " + metro.converteAcima() + "km");
        System.out.println("1500 metros equivalem a " + metro.converteBaixo() + "cm");

        Minuto minuto = new Minuto(60);
        Grama grama = new Grama(500);
    }
}

package Personagem;

public class main {
    public static void main(String[] args) {
        Guerreiro guerreiro = new Guerreiro(10, 5);
        Arqueiro arqueiro = new Arqueiro(5.0, 8);
        Mago mago = new Mago(3.0, 12);

        System.out.println("Guerreiro: ");
        System.out.println("Dano: " + guerreiro.calcularDano());
        System.out.println("Defesa: " + guerreiro.calcularDefesa());

        System.out.println("\nArqueiro: ");
        System.out.println("Dano: " + arqueiro.calcularDano());
        System.out.println("Defesa: " + arqueiro.calcularDefesa());

        System.out.println("\nMago: ");
        System.out.println("Dano: " + mago.calcularDano());
        System.out.println("Defesa: " + mago.calcularDefesa());
    }
}

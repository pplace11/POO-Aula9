package Geometria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a figura geométrica (Circulo ou Retangulo):  ");
        String figura = scanner.nextLine().toLowerCase();

        switch (figura) {
            case "circulo":
                System.out.println("Digite o raio do círculo:");
                double raio = scanner.nextDouble();
                Circulo circulo = new Circulo(raio);
                System.out.println("Área: " + circulo.calcularArea());
                System.out.println("Perímetro: " + circulo.calcularPerimetro());
                break;
            case "retangulo":
                System.out.println("Digite a largura do retangulo: ");
                double base = scanner.nextDouble();
                System.out.println("Digite a altura do retangulo: ");
                double altura = scanner.nextDouble();
                Retangulo retangulo = new Retangulo(base, altura);
                System.out.println("Área: " + retangulo.calcularArea());
                System.out.println("Perímetro: " + retangulo.calcularPerimetro());
                break;
            default:
                System.out.println("Fugura inválida.");
        }
    }
    
}

package Conversor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor a ser convertido: ");
        double valor = scanner.nextDouble();

        System.out.println("Escolha a moeda (Libra, Real, Peso): ");
        String moeda = scanner.nextLine().toUpperCase();

        Conversao conversor = null;
        switch (moeda) {
            case "LIBRA":
                conversor = new Libra();
                break;
            case "REAL":
                conversor = new Real();
                break;
            case "PESo":
                conversor = new Peso();
                break;
            default:
                System.out.println("Moeda inválida!!!");
                return;
        }
        if(conversor != null){
            double valorEmEuro = conversor.converterParaEuro(valor);
            double valorEmDolar = conversor.converterParaDolar(valor);

            System.out.println(valor + " " + moeda + "equivalem a: ");
            System.out.println(valorEmEuro + "euro");
            System.out.println(valorEmDolar + "dolar");
        }
    }
}

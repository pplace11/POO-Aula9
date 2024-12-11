package Loja;

public class Main {
    public static void main(String[] args) {
        GestaoSimples gestaoSimples = new GestaoSimples();
        gestaoSimples.adicionarProduto("Maça", 5);
        gestaoSimples.adicionarProduto("Banana", 3);
        gestaoSimples.listarProdutos();

        GestaoEmPacks gestaoEmPacks = new GestaoEmPacks(12);
        gestaoEmPacks.adicionarProduto("Refrigirante", 12);
        gestaoEmPacks.adicionarProduto("Biscoito", 10);
        gestaoEmPacks.listarProdutos();
    }
}

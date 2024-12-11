package Loja;

public class GestaoEmPacks implements GestaoProdutos {
    private int tamanhoPack;
    private Map<String, Integer> produtos = new HashMap<>();

    public GestaoEmPacks(int tamanhoPack) {
        this.tamanhoPack = tamanhoPack;
    }

    @Override
    public void adicionarProduto(String nome, int quantidade) {
        if (quantidade % tamanhoPack != 0) {
            System.out.println("A quantidade deve ser um múltiplo de " + tamanhoPack);
            return;
        }
        produtos.put(nome, produtos.getOrDefault(nome, 0) + quantidade);
    }
}

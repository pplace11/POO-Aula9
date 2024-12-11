package Loja;

public interface GestaoProdutos {
    void adicionarProduto(String nome, int quantidade);
    void removerProduto(String nome);
    void listarProdutos();
    boolean procurarProduto(String nome);
}

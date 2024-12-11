package Loja;

import java.util.HashMap;
import java.util.Map;

public class GestaoSimples implements  GestaoProdutos{
    private Map<String, Integer> produtos = new HashMap<>();

    @Override
    public void adicionarProduto(String nome, int quantidade){
        produtos.put(nome, produtos.getOrDefault(nome, 0) + quantidade);
    }

    @Override
    public void removerProduto(String nome){
        produtos.remove(nome);
    }

    @Override
    public void listarProdutos(){
        for (Map.Entry<String, Integer> entry : produtos.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    @Override
    public boolean procurarProduto(String nome){
        return produtos.containsKey(nome);
    }
}

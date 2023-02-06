package products;

import java.util.List;

public class Mercado extends Produtos{

    private String descricao;

    private double peso;

    public Mercado(List<Produtos> listaProdutos, int idProduto, String nome, Double preco, Enum<Categoria> categoria, String marca, String descricao, double peso) {
        super(listaProdutos, idProduto, nome, preco, categoria, marca);
        this.descricao = descricao;
        this.peso = peso;
    }
}

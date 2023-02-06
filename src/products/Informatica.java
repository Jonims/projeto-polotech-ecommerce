package products;

import java.util.List;

public class Informatica extends Produtos{

    private String descricao;

    private boolean importado;

    private boolean software;

    public Informatica(List<Produtos> listaProdutos, int idProduto, String nome, Double preco, Enum<Categoria> categoria, String marca, String descricao, boolean importado, boolean software) {
        super(listaProdutos, idProduto, nome, preco, categoria, marca);
        this.descricao = descricao;
        this.importado = importado;
        this.software = software;
    }
}

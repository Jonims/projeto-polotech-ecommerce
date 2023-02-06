package products;

import java.util.List;

public class Livro extends Produtos{

    private String nomeAutor;

    private String nomeLivro;

    private String editora;

    private String edicao;

    private String anoLancado;

    public Livro(List<Produtos> listaProdutos, int idProduto, String nome, Double preco, Enum<Categoria> categoria, String marca, String nomeAutor, String nomeLivro, String editora, String edicao, String anoLancado) {
        super(listaProdutos, idProduto, nome, preco, categoria, marca);
        this.nomeAutor = nomeAutor;
        this.nomeLivro = nomeLivro;
        this.editora = editora;
        this.edicao = edicao;
        this.anoLancado = anoLancado;
    }
}

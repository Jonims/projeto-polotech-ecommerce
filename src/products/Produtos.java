package products;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Produtos implements Comparable<Produtos>{

    private List<Produtos> listaProdutos = new ArrayList<Produtos>();

    private int idProduto;

    private String nome;

    private Double preco;

    private Enum<Categoria> categoria;

    private String marca;

    public Produtos(List<Produtos> listaProdutos, int idProduto, String nome, Double preco, Enum<Categoria> categoria, String marca) {
        this.listaProdutos = listaProdutos;
        this.idProduto = idProduto;
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
        this.marca = marca;
    }

    public void adicionarProduto(Produtos produto) {
        listaProdutos.add(produto);
    }

    public void editarProduto(Produtos produto) {
        int posicao = listaProdutos.indexOf(produto);
        listaProdutos.set(posicao, produto);
    }

    public List<Produtos> visualizarProduto(){
        return listaProdutos;
    }

    public void removerProduto(Produtos produto) {
        listaProdutos.remove(produto);
    }

    public List<Produtos> filtrarPorCategoria(List<Produtos> listaProdutos, Enum categoria){
        List<Produtos> filtraProduto = new ArrayList<Produtos>();
        for (Produtos produto: listaProdutos) {
            if(produto.getCategoria().equals(categoria)){
                filtraProduto.add(produto);
            }
        }
        return filtraProduto;
    }
    public List<Produtos> filtrarPorMarca(List<Produtos> listaProdutos, String marca){
        List<Produtos> filtraProdutoMarca = new ArrayList<Produtos>();
        for (Produtos produto: listaProdutos) {
            if(produto.getMarca().equals(marca)){
                filtraProdutoMarca.add(produto);
            }
        }
        return filtraProdutoMarca;
    }

    public List<Produtos> ordenarPreco(List<Produtos> listaProdutos, Double preco) {

        Collections.sort(listaProdutos);
        return listaProdutos;
    }

    public List<Produtos> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(List<Produtos> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Enum<Categoria> getCategoria() {
        return categoria;
    }

    public void setCategoria(Enum<Categoria> categoria) {
        this.categoria = categoria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Produtos{" +
                "listaProdutos=" + listaProdutos +
                ", idProduto=" + idProduto +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", categoria=" + categoria +
                ", marca='" + marca + '\'' +
                '}';
    }

    @Override
    public int compareTo(Produtos produto) {
        if(this.preco > produto.preco){
            return -1;
        }else if(this.preco == produto.preco){
            return 0;
        }else {
            return -1;
        }
    }
}

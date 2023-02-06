package users;

import java.util.ArrayList;
import java.util.List;

public class Usuarios {
    private List<Usuarios> listaPessoas = new ArrayList<Usuarios>();
    private int idAdmSistema;
    private String login;
    private String senha;
    private String endereco;
    private String email;
    private String telefone;

    public List<Usuarios> getListaPessoas() {
        return listaPessoas;
    }

    public void setListaPessoas(List<Usuarios> listaPessoas) {
        this.listaPessoas = listaPessoas;
    }

    public int getIdAdmSistema() {
        return idAdmSistema;
    }

    public void setIdAdmSistema(int idAdmSistema) {
        this.idAdmSistema = idAdmSistema;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Usuarios{" +
                "listaPessoas=" + listaPessoas +
                ", idAdmSistema=" + idAdmSistema +
                ", login='" + login + '\'' +
                ", senha='" + senha + '\'' +
                ", endereco='" + endereco + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}

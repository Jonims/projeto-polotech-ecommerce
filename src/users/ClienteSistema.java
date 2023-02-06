package users;

public class ClienteSistema extends Usuarios{

    private int idClienteSistema;

    private String nome;

    private String cpf;

    public int getIdClienteSistema() {
        return idClienteSistema;
    }

    public void setIdClienteSistema(int idClienteSistema) {
        this.idClienteSistema = idClienteSistema;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "ClienteSistema{" +
                "idClienteSistema=" + idClienteSistema +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}

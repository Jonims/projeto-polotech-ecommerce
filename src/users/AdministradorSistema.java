package users;

public class AdministradorSistema extends Usuarios{

    private int idAdmSistema;

    private String razaoSocial;

    private String cnpj;

    public int getIdAdmSistema() {
        return idAdmSistema;
    }

    public void setIdAdmSistema(int idAdmSistema) {
        this.idAdmSistema = idAdmSistema;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "AdministradorSistema{" +
                "idAdmSistema=" + idAdmSistema +
                ", razaoSocial='" + razaoSocial + '\'' +
                ", cnpj='" + cnpj + '\'' +
                '}';
    }
}

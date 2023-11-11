import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Fornecedor extends Pessoa {
  private String cnpj;
  private String logradouro;
  private String bairro;
  private String cidade;
  private String estado;
  private String cep;
  private int id;

  // Construtor
  public Fornecedor(int id, String nome, String cnpj, String logradouro, String bairro, String cidade, String estado,
      String cep, String cpf, String telefone, String email, Date dataCadastro, Date dataNascimento) {
    super(id, nome, cpf, telefone, email, dataCadastro, dataNascimento);
    this.id = id;
    this.cnpj = cnpj;
    this.logradouro = logradouro;
    this.bairro = bairro;
    this.cidade = cidade;
    this.estado = estado;
    this.cep = cep;
  }



   public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return "Fornecedor{" +
                "id=" + id +
                ", nome='" + getNome() + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", logradouro='" + logradouro + '\'' +
                ", bairro='" + bairro + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                ", cep='" + cep + '\'' +
                ", cpf='" + getCpf() + '\'' +
                ", telefone='" + getTelefone() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", dataCadastro=" + sdf.format(getDataCadastro()) +
                ", dataNascimento=" + sdf.format(getDataNascimento()) +
                '}';
    }
   


  // Getters e Setters
  public String getCnpj() {
    return cnpj;
  }

  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  public String getLogradouro() {
    return logradouro;
  }

  public void setLogradouro(String logradouro) {
    this.logradouro = logradouro;
  }

  public String getBairro() {
    return bairro;
  }

  public void setBairro(String bairro) {
    this.bairro = bairro;
  }

  public String getCidade() {
    return cidade;
  }

  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

  public String getCep() {
    return cep;
  }

  public void setCep(String cep) {
    this.cep = cep;
  }

}
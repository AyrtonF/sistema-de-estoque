import java.text.SimpleDateFormat;
import java.util.Date;

public class Produto {
  private int id;
  private String codigo;
  private String nome;
  private String descricao;
  private Fornecedor fornecedor;
  private Date dataCadastro;

  // Construtor
  public Produto(int id, String codigo, String nome, String descricao, Fornecedor fornecedor, Date dataCadastro) {
    this.id = id;
    this.codigo = codigo;
    this.nome = nome;
    this.descricao = descricao;
    this.fornecedor = fornecedor;
    this.dataCadastro = dataCadastro;
  }

  // Métodos específicos para Produtos

// Dentro da classe Produto
public void exibirEmMatriz() {
   SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
  System.out.printf("| %-5d | %-10s | %-20s | %-20s | %-20s | %-20s |\n",
          getId(), getCodigo(), getNome(), getDescricao(),
          getFornecedor().getNome(), sdf.format(getDataCadastro()));
}

 @Override
  public String toString() {
    return "Produto [id=" + id + ", codigo=" + codigo + ", nome=" + nome + ", descricao=" + descricao + ", fornecedor="
        + fornecedor + ", dataCadastro=" + dataCadastro + "]";
  }
  
  // Getters e Setters
  public int getId() {
    return id;
  }


  public void setId(int id) {
    this.id = id;
  }

  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public Fornecedor getFornecedor() {
    return fornecedor;
  }

  public void setFornecedor(Fornecedor fornecedor) {
    this.fornecedor = fornecedor;
  }

  public Date getDataCadastro() {
    return dataCadastro;
  }

  public void setDataCadastro(Date dataCadastro) {
    this.dataCadastro = dataCadastro;
  }

}
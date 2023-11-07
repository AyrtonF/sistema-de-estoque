import java.util.Date;
import java.util.List;

public class Fornecedor extends Pessoa {
  private String cnpj;
  private String logradouro;
  private String bairro;
  private String cidade;
  private String estado;
  private String cep;

  // Construtor
  public Fornecedor(int id, String nome, String cnpj, String logradouro, String bairro, String cidade, String estado,
      String cep, String cpf, String telefone, String email, Date dataCadastro, Date dataNascimento) {
    super(id, nome, cpf, telefone, email, dataCadastro, dataNascimento);
    this.cnpj = cnpj;
    this.logradouro = logradouro;
    this.bairro = bairro;
    this.cidade = cidade;
    this.estado = estado;
    this.cep = cep;
  }



  // Método para cadastrar um novo fornecedor
    public static Fornecedor cadastrarFornecedor(int id, String nome, String cnpj, String logradouro, String bairro, String cidade, String estado, String cep, String cpf, String telefone, String email, Date dataCadastro, Date dataNascimento) {
        return new Fornecedor(id, nome, cnpj, logradouro, bairro, cidade, estado, cep, cpf, telefone, email, dataCadastro, dataNascimento);
    }
    
    // Método para buscar um fornecedor por nome
    public static Fornecedor buscarFornecedorPorNome(List<Fornecedor> fornecedores, String nome) {
        for (Fornecedor fornecedor : fornecedores) {
            if (fornecedor.getNome().equalsIgnoreCase(nome)) {
                return fornecedor;
            }
        }
        return null; // Fornecedor não encontrado
    }
    
    // Método para listar todos os fornecedores
    public static void listarFornecedores(List<Fornecedor> fornecedores) {
        for (Fornecedor fornecedor : fornecedores) {
            System.out.println(fornecedor.getNome());
        }
    }
    
    // Método para deletar um fornecedor
    public static void deletarFornecedor(List<Fornecedor> fornecedores, int id) {
        Fornecedor fornecedor = null;
        for (Fornecedor f : fornecedores) {
            if (f.getId() == id) {
                fornecedor = f;
                break;
            }
        }
        if (fornecedor != null) {
            fornecedores.remove(fornecedor);
            System.out.println("Fornecedor removido com sucesso.");
        } else {
            System.out.println("Fornecedor não encontrado.");
        }
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
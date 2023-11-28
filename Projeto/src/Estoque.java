public class Estoque {
  private Produto produto;
  private int quantidade;
  private String armazen;
  private String prateleira;

  // Construtor
  public Estoque(Produto produto, int quantidade, String armazen, String prateleira) {
    this.produto = produto;
    this.quantidade = quantidade;
    this.armazen = armazen;
    this.prateleira = prateleira;
  }

  // Métodos específicos para Estoque (Atualizar, Adicionar, Remover, Listar Disponíveis)


 @Override
  public String toString() {
    return "Estoque [produto=" + produto + ", quantidade=" + quantidade + ", armazen=" + armazen + ", prateleira="
        + prateleira + "]";
  }


  // Getters e Setters
  public Produto getProduto() {
    return produto;
  }

  public void setProduto(Produto produto) {
    this.produto = produto;
  }

  public int getQuantidade() {
    return quantidade;
  }

  public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
  }

  public String getArmazen() {
    return armazen;
  }

  public void setArmazen(String armazen) {
    this.armazen = armazen;
  }

  public String getPrateleira() {
    return prateleira;
  }

  public void setPrateleira(String prateleira) {
    this.prateleira = prateleira;
  }

}
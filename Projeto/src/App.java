import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class App {
    static ArrayList<Fornecedor> fornecedores = new ArrayList<>();
    static ArrayList<Produto> produtos = new ArrayList<>();
    static ArrayList<Estoque> estoque = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opc;

        do {
            exibirMenu();
            Scanner scan = new Scanner(System.in);
            opc = scanner.nextInt();
            switch (opc) {
                case 1:
                    int opcProduto;
                    do {
                        menuProduto();
                        opcProduto = scanner.nextInt();
                        switch (opcProduto) {
                            case 1:
                                cadastrarProduto();
                                break;
                            case 2:
                                buscarProdutoPorNomeEId();
                                break;
                            case 3:
                                listarProdutos();
                                break;
                            case 4:
                                deletarProduto();
                                break;
                            case 0:
                                System.out.println("Saindo da operação...");
                                break;
                            default:
                                System.out.println("Opção invalida, tente novamente");
                                break;
                        }
                    } while (opcProduto != 0);
                    break;
                case 2:
                    int opcEstoque;
                    do {

                        menuEstoque();
                        opcEstoque = scanner.nextInt();
                        switch (opcEstoque) {
                            case 1:
                                atualizarEstoqueDeProdutos();
                                break;
                            case 2:
                                adicionarEstoqueDeProdutos();
                                break;
                            case 3:
                                listarProdutosDisponiveis();
                                break;
                            case 4:
                                deletarProdutoDoEstoque();
                                break;
                            case 0:
                                System.out.println("Saindo da operação...");
                                break;
                            default:
                                System.out.println("Opção invalida, tente novamente");
                                break;
                        }
                    } while (opcEstoque != 0);
                    break;

                case 3:
                    int opcFornecedor;
                    do {

                        menuFornecedor();

                        opcFornecedor = scanner.nextInt();
                        switch (opcFornecedor) {
                            case 1:
                                cadastrarFornecedor();
                                break;
                            case 2:
                                buscarFornecedor();
                                break;
                            case 3:
                                listarFornecedores();
                                break;

                            case 4:
                                deletarFornecedor();
                                break;
                            case 0:
                                System.out.println("Saindo da operação...");
                                break;
                            default:
                                System.out.println("Opção invalida, tente novamente");
                                break;
                        }
                    } while (opcFornecedor != 0);

                    break;
                case 0:
                    System.out.println("Encerrando Programa...");
                    break;
                default:
                    System.out.println("Opção invalida, tente novamente");
                    break;
            }
            System.out.println();

        } while (opc != 0);

    }

    public static void exibirMenu() {
        System.out.println("##### GERENCIAMENTO #####");
        System.out.println("# 1 - PRODUTO           #");
        System.out.println("# 2 - ESTOQUE           #");
        System.out.println("# 3 - FORNECEDOR        #");
        System.out.println("# 0 - ENCERRAR          #");
        System.out.println("########################");
        System.out.print("Escolha uma opção desejada para operar: ");
    }

    public static void menuFornecedor() {
        System.out.println();
        System.out.println("####### FORNECEDOR #######");
        System.out.println("# 1 - CADASTRAR          #");
        System.out.println("# 2 - BUSCAR             #");
        System.out.println("# 3 - LISTAR             #");
        System.out.println("# 4 - DELETAR            #");
        System.out.println("# 0 - SAIR               #");
        System.out.println("##########################");
        System.out.print("Escolha uma opção desejada para operar: ");

    }

    public static void menuProduto() {
        System.out.println();
        System.out.println("######## PRODUTO #########");
        System.out.println("# 1 - CADASTRAR PRODUTO  #");
        System.out.println("# 2 - BUSCAR POR NOME    #");
        System.out.println("# 3 - LISTAR             #");
        System.out.println("# 4 - DELETAR PRODUTO    #");
        System.out.println("# 0 - SAIR               #");
        System.out.println("##########################");
        System.out.print("Escolha uma opção desejada para operar: ");

    }

    public static void menuEstoque() {
        System.out.println();
        System.out.println("######## ESTOQUE #########");
        System.out.println("# 1 - ATUALIZAR ESTOQUE  #");
        System.out.println("# 2 - ADICIONAR PRODUTO  #");
        System.out.println("# 3 - LISTAR DISPONIVEIS #");
        System.out.println("# 4 - DELETAR PRODUTO    #");
        System.out.println("# 0 - SAIR               #");
        System.out.println("########################");
        System.out.print("Escolha uma opção desejada para operar: ");

    }

    // metodos do fornecedor
    public static void cadastrarFornecedor() {

        Scanner scanner = new Scanner(System.in);
        int id = 1;
        System.out.println("Digite o nome do fornecedor:");
        String nome = scanner.nextLine();

        System.out.println("Digite o CNPJ do fornecedor:");
        String cnpj = scanner.nextLine();

        System.out.println("Digite o logradouro do fornecedor:");
        String logradouro = scanner.nextLine();

        System.out.println("Digite o bairro do fornecedor:");
        String bairro = scanner.nextLine();

        System.out.println("Digite a cidade do fornecedor:");
        String cidade = scanner.nextLine();

        System.out.println("Digite o estado do fornecedor:");
        String estado = scanner.nextLine();

        System.out.println("Digite o CEP do fornecedor:");
        String cep = scanner.nextLine();

        System.out.println("Digite o CPF do fornecedor:");
        String cpf = scanner.nextLine();

        System.out.println("Digite o telefone do fornecedor:");
        String telefone = scanner.nextLine();

        System.out.println("Digite o email do fornecedor:");
        String email = scanner.nextLine();

        // Preencher as datas
        Date dataNascimento = obterData("Digite a data de nascimento do fornecedor (dd/MM/yyyy): ");
        Date dataCadastro = obterData("Digite a data de cadastro do fornecedor (dd/MM/yyyy): ");

        // Criar uma instância de Fornecedor
        Fornecedor novoFornecedor = new Fornecedor(id, nome, cnpj, logradouro, bairro, cidade, estado, cep, cpf,
                telefone, email, dataCadastro, dataNascimento);
        // Preencher os dados no objeto
        novoFornecedor.setId(id++);
        novoFornecedor.setNome(nome);
        novoFornecedor.setCnpj(cnpj);
        novoFornecedor.setLogradouro(logradouro);
        novoFornecedor.setBairro(bairro);
        novoFornecedor.setCidade(cidade);
        novoFornecedor.setEstado(estado);
        novoFornecedor.setCep(cep);
        novoFornecedor.setCpf(cpf);
        novoFornecedor.setTelefone(telefone);
        novoFornecedor.setEmail(email);
        novoFornecedor.setDataCadastro(dataCadastro);
        novoFornecedor.setDataNascimento(dataNascimento);

        // Adicionar o fornecedor à lista
        fornecedores.add(novoFornecedor);

        System.out.println("Fornecedor cadastrado com sucesso!");
    }

    private static Date obterData(String mensagem) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(mensagem);

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            // Lê a entrada do usuário e converte para um objeto Date
            return sdf.parse(scanner.nextLine());
        } catch (ParseException e) {
            System.out.println("Formato de data inválido. Use o formato dd/MM/yyyy.");
            // Chama recursivamente o método para obter uma nova data
            return obterData(mensagem);
        }
    }

    public static void buscarFornecedor() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do fornecedor a ser buscado:");
        String nome = scanner.nextLine();

        Fornecedor fornecedorEncontrado = null;

        for (Fornecedor fornecedor : fornecedores) {
            // Verifica se o nome do fornecedor atual é igual ao nome buscado (ignorando
            // maiúsculas/minúsculas)
            if (fornecedor.getNome().equalsIgnoreCase(nome)) {
                fornecedorEncontrado = fornecedor;
                break;
            }
        }

        if (fornecedorEncontrado != null) {
            System.out.println("Fornecedor encontrado:");
            System.out.println(fornecedorEncontrado); // Chama o método toString implicitamente
        } else {
            System.out.println("Fornecedor não encontrado.");
        }
    }

    public static void listarFornecedores() {
        List<Fornecedor> listaFornecedores = fornecedores;

        if (!fornecedores.isEmpty()) {
            System.out.println("Lista de Fornecedores:");
            for (Fornecedor fornecedor : listaFornecedores) {
                System.out.println(fornecedor);
            }
        } else {
            System.out.println("Nenhum fornecedor cadastrado.");
        }
    }

    public static void deletarFornecedor() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o ID do fornecedor a ser deletado:");
        int id = scanner.nextInt();

        // Lógica para deletar o fornecedor diretamente do ArrayList
        boolean fornecedorDeletado = false;
        Fornecedor fornecedorExcluido = null;
        for (Fornecedor fornecedor : fornecedores) {
            if (fornecedor.getId() == id) {
                fornecedorExcluido = fornecedor;
                fornecedores.remove(fornecedor);
                fornecedorDeletado = true;
                break; // Para sair do loop após deletar o fornecedor
            }
        }

        if (fornecedorDeletado) {
            System.out.println(fornecedorExcluido);
            System.out.println("Fornecedor deletado com sucesso.");

        } else {
            System.out.println("Fornecedor não encontrado para deletar.");
        }
    }

    // metodos do produto

    public static void cadastrarProduto() {
        Scanner scanner = new Scanner(System.in);
        int idProduto = produtos.size() + 1; // Gera um novo ID para o produto

        System.out.println("Digite o nome do produto:");
        String nomeProduto = scanner.nextLine();

        System.out.println("Digite a descrição do produto:");
        String descricaoProduto = scanner.nextLine();

        String codigo = gerarCodigo();

        // Selecionar fornecedor
        Fornecedor fornecedorProduto = selecionarFornecedorPorNomeEId();
        if (fornecedorProduto == null) {
            System.out.println("Não foi possível cadastrar o produto sem um fornecedor válido. Tente novamente");
            return; // Retorna se o fornecedor não for válido
        }

        // Preencher as datas (você pode ajustar conforme necessário)
        Date dataCadastroProduto = obterData("Digite a data de cadastro do produto (dd/MM/yyyy):");

        // Criar uma instância de Produto
        Produto novoProduto = new Produto(idProduto, codigo, nomeProduto, descricaoProduto, fornecedorProduto,
                dataCadastroProduto);

        // Adicionar o produto à lista
        produtos.add(novoProduto);

        System.out.println("Produto cadastrado com sucesso!");
        listarProdutosEmMatriz();
    }

    private static String gerarCodigo() {
        return "PROD" + UUID.randomUUID().toString().substring(0, 6).toUpperCase();
    }

    public static Fornecedor selecionarFornecedorPorNomeEId() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do fornecedor:");
        String nomeFornecedor = scanner.nextLine();

        System.out.println("Digite o ID do fornecedor:");
        int idFornecedor = scanner.nextInt();

        // Procura o fornecedor na lista
        for (Fornecedor fornecedor : fornecedores) {
            if (fornecedor.getNome().equalsIgnoreCase(nomeFornecedor) && fornecedor.getId() == idFornecedor) {
                return fornecedor; // Retorna o fornecedor encontrado
            }
        }

        System.out.println("Fornecedor não encontrado.");
        return null; // Retorna null se o fornecedor não for encontrado
    }

    public static void buscarProdutoPorNomeEId() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do produto a ser buscado:");
        String nomeProduto = scanner.nextLine();

        System.out.println("Digite o ID do produto a ser buscado:");
        int idProduto = scanner.nextInt();

        Produto produtoEncontrado = null;

        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nomeProduto) && produto.getId() == idProduto) {
                produtoEncontrado = produto;
                break;
            }
        }

        if (produtoEncontrado != null) {
            System.out.println("Produto encontrado:");
            System.out.println(produtoEncontrado);
        } else {
            System.out.println("Produto não encontrado.");
            return;
        }
    }

    public static void listarProdutos() {
        if (!produtos.isEmpty()) {
            System.out.println("Lista de Produtos:");
            for (Produto produto : produtos) {
                listarProdutosEmMatriz();
            }
        } else {
            System.out.println("Nenhum produto cadastrado.");

        }
    }

    public static void deletarProduto() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o ID do produto a ser deletado:");
        int idProduto = scanner.nextInt();

        System.out.println("Digite o nome do produto a ser deletado:");
        scanner.nextLine(); // Consumir a quebra de linha pendente
        String nomeProduto = scanner.nextLine();

        Produto produtoDeletado = null;

        // Itera sobre a lista de produtos para encontrar o produto
        for (Produto produto : produtos) {
            if (produto.getId() == idProduto && produto.getNome().equalsIgnoreCase(nomeProduto)) {
                produtoDeletado = produto;
                break;
            }
        }

        if (produtoDeletado != null) {
            produtos.remove(produtoDeletado);
            System.out.println();
            System.out.println("Produto deletado com sucesso.");
            listarProdutosEmMatriz();
        } else {
            System.out.println("Produto não encontrado para deletar.");
        }
    }

    // metodos do estoque

    public static void atualizarEstoqueDeProdutos() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o ID do produto a ser atualizado no estoque:");
        int idProduto = scanner.nextInt();

        Estoque estoqueAtualizado = null;

        for (Estoque estoqueItem : estoque) {
            if (estoqueItem.getProduto().getId() == idProduto) {
                int opcaoAtualizacao;

                do {
                    System.out.println("Escolha o que deseja atualizar:");
                    System.out.println("1 - Quantidade em Estoque");
                    System.out.println("2 - Local de Armazenamento");
                    System.out.println("3 - Prateleira");
                    System.out.println("0 - Sair");

                    opcaoAtualizacao = scanner.nextInt();

                    switch (opcaoAtualizacao) {
                        case 1:
                            System.out.println("Digite a nova quantidade em estoque:");
                            int novaQuantidade = scanner.nextInt();
                            estoqueItem.setQuantidade(novaQuantidade);
                            System.out.println("Quantidade em estoque atualizada com sucesso.");
                            break;
                        case 2:
                            System.out.println("Digite o novo local de armazenamento:");
                            String novoArmazenamento = scanner.next();
                            estoqueItem.setArmazen(novoArmazenamento);
                            System.out.println("Local de armazenamento atualizado com sucesso.");
                            break;
                        case 3:
                            System.out.println("Digite a nova prateleira:");
                            String novaPrateleira = scanner.next();
                            estoqueItem.setPrateleira(novaPrateleira);
                            System.out.println("Prateleira atualizada com sucesso.");
                            break;
                        case 0:
                            System.out.println("Saindo da atualização...");
                            break;
                        default:
                            System.out.println("Opção inválida. Tente novamente.");
                            break;
                    }
                } while (opcaoAtualizacao != 0);

                estoqueAtualizado = estoqueItem;
                break;
            }
        }

        if (estoqueAtualizado != null) {
            System.out.println("Estoque atualizado com sucesso:");
            listarProdutosEstoqueEmMatriz();
        } else {
            System.out.println("Produto não encontrado no estoque.");
        }
    }

    public static void adicionarEstoqueDeProdutos() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o ID do produto a ser adicionado ao estoque:");
        int idProduto = scanner.nextInt();

        Estoque estoqueAdicionado = null;

        for (Produto produto : produtos) {
            if (produto.getId() == idProduto) {
                System.out.println("Digite a quantidade a ser adicionada ao estoque:");
                int quantidadeAdicionada = scanner.nextInt();

                System.out.println("Digite o local de armazenamento:");
                String localArmazenamento = scanner.next();

                System.out.println("Digite a prateleira:");
                String prateleira = scanner.next();

                Estoque novoEstoque = new Estoque(produto, quantidadeAdicionada, localArmazenamento, prateleira);
                estoque.add(novoEstoque);
                estoqueAdicionado = novoEstoque;
                break;
            }
        }

        if (estoqueAdicionado != null) {
            listarProdutosEstoqueEmMatriz();
        } else {
            System.out.println("Produto não encontrado para adicionar ao estoque.");
        }
    }

    public static void listarProdutosDisponiveis() {
        if (!estoque.isEmpty()) {
            System.out.println("Produtos Disponíveis no Estoque:");
            listarProdutosEstoqueEmMatriz();
        } else {
            System.out.println("Nenhum produto disponível no estoque.");
        }
    }

    public static void deletarProdutoDoEstoque() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o ID do produto a ser deletado do estoque:");
        int idProduto = scanner.nextInt();

        Estoque estoqueRemovido = null;

        for (Estoque estoqueItem : estoque) {
            if (estoqueItem.getProduto().getId() == idProduto) {
                estoqueRemovido = estoqueItem;
                estoque.remove(estoqueItem);
                break;
            }
        }

        // if (estoqueRemovido != null) {
        // System.out.println(estoqueRemovido);
        // } else {
        // System.out.println("Produto não encontrado no estoque.");
        // }

        if (estoqueRemovido != null) {
            System.out.println("Produto removido do estoque com sucesso:");
            listarProdutosEstoqueEmMatriz();
        } else {
            System.out.println("Produto não encontrado no estoque para remover.");
        }

    }

    public static void listarProdutosEstoqueEmMatriz() {
        // Verifica se há produtos no estoque
        if (estoque.isEmpty()) {
            System.out.println("Nenhum produto no estoque.");
            return;
        }

        // Cabeçalho da matriz
        System.out.println("-------------------------------------------------------------");
        System.out.printf("| %-5s | %-20s | %-10s | %-15s | %-10s |\n",
                "ID", "Nome do Produto", "Quantidade", "Armazenamento", "Prateleira");
        System.out.println("-------------------------------------------------------------");

        // Itera sobre os produtos no estoque
        for (Estoque estoqueItem : estoque) {
            System.out.printf("| %-5d | %-20s | %-10d | %-15s | %-10s |\n",
                    estoqueItem.getProduto().getId(),
                    estoqueItem.getProduto().getNome(),
                    estoqueItem.getQuantidade(),
                    estoqueItem.getArmazen(),
                    estoqueItem.getPrateleira());
        }

        // Linha final da matriz
        System.out.println("-------------------------------------------------------------");
    }

    public static void listarProdutosEmMatriz() {
        // Verifica se há produtos no ArrayList
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
            return;
        }

        // Cabeçalho da matriz
        System.out.println(
                "---------------------------------------------------------------------------------------------------------------------");
        System.out.printf("| %-5s | %-10s | %-20s | %-20s | %-20s | %-20s |\n",
                "ID", "Código", "Nome do Produto", "Descrição", "Fornecedor", "Data de Cadastro");
        System.out.println(
                "---------------------------------------------------------------------------------------------------------------------");

        // Itera sobre os produtos no ArrayList
        for (Produto produto : produtos) {
            produto.exibirEmMatriz();
        }

        // Linha final da matriz
        System.out.println(
                "---------------------------------------------------------------------------------------------------------------------");
    }

}
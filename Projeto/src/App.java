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

                                break;

                            case 2:
                                break;

                            case 3:

                                break;

                            case 4:

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

                                break;
                            case 2:
                                break;
                            case 3:

                                break;

                            case 4:

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
        Date dataCadastro = obterData("Digite a data de cadastro do fornecedor (dd/MM/yyyy): ");
        Date dataNascimento = obterData("Digite a data de nascimento do fornecedor (dd/MM/yyyy): ");

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
            // Verifica se o nome do fornecedor atual é igual ao nome buscado (ignorando maiúsculas/minúsculas)
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
                System.out.println(listaFornecedores);
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
        for (Fornecedor fornecedor : fornecedores) {
            if (fornecedor.getId() == id) {
                fornecedores.remove(fornecedor);
                fornecedorDeletado = true;
                break; // Para sair do loop após deletar o fornecedor
            }
        }
    
        if (fornecedorDeletado) {
            System.out.println("Fornecedor deletado com sucesso.");
        } else {
            System.out.println("Fornecedor não encontrado para deletar.");
        }
    }
    
    // metodos do produto

    // metodos do estoque

}
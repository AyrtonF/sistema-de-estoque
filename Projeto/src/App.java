import java.util.*;
import java.text.SimpleDateFormat;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opc;
         int opcOp;
        char outraOpc;
        List<Fornecedor> fornecedores = new ArrayList<>();
        List<Produto> produtos = new ArrayList<>();
        List<Estoque> estoque = new ArrayList<>();

        
        do {
            exibirMenu();
            opc = scanner.nextInt();
            switch (opc) {
                
                case 1:
                    // menuEstoque();
                    break;
                case 2:
                    // menuProduto();
                    break;

                case 3:
                do {
                    
                menuFornecedor();
                opcOp = scanner.nextInt();
                switch (opcOp) {
                    case 1:
                        //cadastrarFornecedor();
                        break;
                
                    default:
                        break;
                }
                } while (opcOp != 0);

                    break;
                default:
                    System.out.println("Opção invalida, tente novamente");
                    break;
            }
            System.out.println();
            System.out.println("Deseja encerrar o programa? [s/n]");
            outraOpc = scanner.next().charAt(0);

        } while (opc != 0 || outraOpc != 's');

    }

    public static void exibirMenu() {
        System.out.println("##### GERENCIAMENTO #####");
        System.out.println("# 1 - ESTOQUE           #");
        System.out.println("# 2 - PRODUTO           #");
        System.out.println("# 3 - FORNECEDOR        #");
        System.out.println("# 0 - ENCERRAR          #");
        System.out.println("########################");
        System.out.print("Escolha uma opção desejada para operar: ");
    }

    public static void menuFornecedor() {
        int opcOp;
        System.out.println();
        System.out.println("####### FORNECEDOR #######");
        System.out.println("# 1 - CADASTRAR          #");
        System.out.println("# 2 - BUSCAR             #");
        System.out.println("# 3 - LISTAR             #");
        System.out.println("# 4 - DELETAR            #");
        System.out.println("# 0 - SAIR               #");
        System.out.println("########################");
        System.out.print("Escolha uma opção desejada para operar: ");


    }

}
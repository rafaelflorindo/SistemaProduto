import modelo.Produto;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> listaProdutos = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Escolha uma das opções abaixo:");
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Listar Produtos");
            System.out.println("3 - Ativar Produto");
            System.out.println("4 - Inativar Produto");
            System.out.println("5 - Sair");
            System.out.print("Digite um número correspondente à sua escolha: ");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    Produto novoProduto = new Produto();
                    novoProduto.cadastrarProduto(scan);
                    listaProdutos.add(novoProduto);
                    System.out.println("Produto cadastrado com sucesso!");
                    break;

                case 2:
                    if (listaProdutos.isEmpty()) {
                        System.out.println("Nenhum produto cadastrado.");
                    } else {
                        for (Produto p : listaProdutos) {
                            p.listarProduto();
                            System.out.println("----------------------------");
                        }
                    }
                    break;

                case 3:
                    System.out.print("Informe o código do produto: ");
                    int codigoAtivar = scan.nextInt();
                    boolean encontradoAtivar = false;

                    for (Produto p : listaProdutos) {
                        if (p.codigo == codigoAtivar) {
                            p.alterarStatus(true);
                            encontradoAtivar = true;
                            break;
                        }
                    }

                    if (!encontradoAtivar) {
                        System.out.println("Produto não encontrado.");
                    }
                    break;

                case 4:
                    System.out.print("Informe o código do produto: ");
                    int codigoInativar = scan.nextInt();
                    boolean encontradoInativar = false;

                    for (Produto p : listaProdutos) {
                        if (p.codigo == codigoInativar) {
                            p.alterarStatus(false);
                            encontradoInativar = true;
                            break;
                        }
                    }

                    if (!encontradoInativar) {
                        System.out.println("Produto não encontrado.");
                    }
                    break;

                case 5:
                    System.out.println("Saindo do Sistema!!!");
                    break;

                default:
                    System.out.println("Opção inválida, tente novamente!!!");
            }
        } while (opcao != 5);
        scan.close();
    }
}
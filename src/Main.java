import modelo.Produto;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto();
        Scanner scan = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("Escolha uma das opções abaixo:");
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Listar Produto");
            System.out.println("3 - Ativar Produto");
            System.out.println("4 - Inativar Produto");
            System.out.println("5 - Sair");
            System.out.println("Digite um número correspondente a sua escolha: ");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    produto.cadastrarProduto(scan);
                    break;
                case 2:
                    produto.listarProduto();
                    break;
                case 3:
                    produto.alterarStatus(true);
                    break;
                case 4:
                    produto.alterarStatus(false);
                    break;
                case 5:
                    System.out.println("Saindo do Sistema!!!");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente!!!");
            }
        }while (opcao !=5);
        scan.close();
    }
}
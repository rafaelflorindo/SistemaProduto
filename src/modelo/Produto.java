package modelo;
import java.util.Scanner;

public class Produto {
    public int codigo;
    public String nome;
    public double preco;
    public int quantidadeEstoque;
    public boolean status = true;

    public void cadastrarProduto(Scanner scan){
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe os dados para o cadastro do produto.");
        System.out.println("Codigo: ");   this.codigo = scan.nextInt();
        scan.nextLine(); //limpar buffer
        System.out.println("Nome: ");   this.nome = scan.nextLine();
        System.out.println("Quantidade: ");   this.quantidadeEstoque = scan.nextInt();
        System.out.println("Preço: ");  this.preco = scan.nextDouble();
    }

    public void alterarStatus(boolean estado){
        String mensagem;
        if(this.status == estado){
            mensagem = "Status do produto são iguais, não atualizado";
        }else{
            this.status = estado;
            mensagem = "Status do produto atualizado";
        }
        System.out.println(mensagem);
    }

    public double calcularValorProdutoEstoque(){
        return this.preco * this.quantidadeEstoque;
    }
    public void listarProduto(){
        System.out.println(">> Listando Produto Cadastrado <<");
        System.out.println("Código: " + this.codigo);
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: R$ " + this.preco);
        System.out.println("Quantidade em estoque: " + this.quantidadeEstoque);
        System.out.println("Total: R$ " + calcularValorProdutoEstoque());

        if(this.status == true) {
            System.out.println("Produto ativo");
        }else {
            System.out.println("Produto inativo");
        }
    }
}
package comercio2;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Loja loja = new Loja(5000);

		while (true) {
			System.out.println("=========== Buteco do SI ==============");
			System.out.println("1) Listar todos os produtos");
			System.out.println("2) Cadastrar um novo produto");
			System.out.println("3) Adicionar estoque de um produto");
			System.out.println("4) Remover um produto do comércio");
			System.out.println("5) Vender algum produto existente");
			System.out.println("6) Relatório de compra e vendas");
			System.out.println("7) Sair do programa");
			System.out.println("Escolha uma opção: ");

			int opcao = scanner.nextInt();
			scanner.nextLine();

			if (opcao == 1) {
				loja.listarProdutos();

			} else if (opcao == 2) {
				System.out.print("Nome do produto: ");
				String nome = scanner.nextLine();
				System.out.print("Categoria: ");
				String categoria = scanner.nextLine();
				System.out.print("Custo de compra: ");
				double custoCompra = scanner.nextDouble();
				System.out.print("Valor de venda: ");
				double valorVenda = scanner.nextDouble();
				loja.cadastrarProduto(nome, categoria, custoCompra, valorVenda);

			} else if (opcao == 3) {
				System.out.print("Código do produto: ");
				int codigoProduto = scanner.nextInt();
				System.out.print("Quantidade a adicionar: ");
				int quantidade = scanner.nextInt();
				if (quantidade <= 0) {
					System.out.println("Quantidade invalída! Favor adicionar um valor positivo.");
					return;
				}

				loja.adicionarEstoque(codigoProduto, quantidade);

			} else if (opcao == 4) {
				System.out.print("Código do produto a remover: ");
				int codigoRemover = scanner.nextInt();
				loja.removerProduto(codigoRemover);

			} else if (opcao == 5) {
				System.out.print("Código do produto a vender: ");
				int codigoVender = scanner.nextInt();
				System.out.print("Quantidade a vender: ");
				int quantidadeVender = scanner.nextInt();
				loja.venderProduto(codigoVender, quantidadeVender);

			} else if (opcao == 6) {
				loja.relatorio();

			} else if (opcao == 7) {
				System.out.println("Saindo do programa. Dados salvos.");
				scanner.close();
				System.exit(0);

			} else {
				System.out.println("Opção inválida. Tente novamente.");

			}

		}
	
	}

}

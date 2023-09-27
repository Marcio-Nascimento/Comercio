package comercio2;

import java.util.ArrayList;

public class Loja {
	private double dinheiroDisponivel;
	private ArrayList<Produto> produtos;

	public Loja(double dinheiroDisponivel) {
		this.dinheiroDisponivel = dinheiroDisponivel;
		this.produtos = new ArrayList<>();
	}

	double carteira = dinheiroDisponivel;

	public double getDinheiroDisponivel() {
		return carteira;
	}

	public void setDinheiroDisponivel() {
		this.dinheiroDisponivel = carteira;

	}

	public void listarProdutos() {
		if (produtos.isEmpty()) {
			System.out.println("Nenhum produto cadastrado no sistema.");
		} else {
			for (Produto produto : produtos) {
				System.out.println(produto.toString());
			}
		}
	}

	public void cadastrarProduto(String nome, String categoria, double custoCompra, double valorVenda) {
		Produto produto = new ProdutoComEstoque(nome, categoria, custoCompra, valorVenda);
		produtos.add(produto);
		System.out.println(nome + " cadastrado com sucesso. Código: " + produto.getCodigo() + ", Estoque: "
				+ produto.getEstoque());
	}

	public void adicionarEstoque(int codigoProduto, int quantidade) {
		for (Produto produto : produtos) {
			if (produto.getCodigo() == codigoProduto && produto instanceof ProdutoComEstoque) {
				ProdutoComEstoque produtoEstoque = (ProdutoComEstoque) produto;
				double custoTotal = produtoEstoque.getCustoCompra() * quantidade;
				if (dinheiroDisponivel >= custoTotal) {
					produtoEstoque.adicionarEstoque(quantidade);
					dinheiroDisponivel -= custoTotal;
					System.out.println("Estoque de " + produtoEstoque.getNome() + " adicionado com sucesso.");
				} else {
					System.out.println("Dinheiro insuficiente para comprar o estoque.");
				}
				return;
			}
		}
	}

	public void removerProduto(int codigoProduto) {
		for (Produto produto : produtos) {
			if (produto.getCodigo() == codigoProduto) {
				System.out.println(produto.getNome() + " removido com sucesso.");
				produtos.remove(produto);
				return;
			}
		}
		System.out.println("Produto não encontrado.");
	}

	public void venderProduto(int codigoProduto, int quantidade) {
		Produto produtoParaVenda = encontrarProdutoPorCodigo(codigoProduto);

		if (produtoParaVenda == null) {
			System.out.println("Produto não encontrado.");
			return;
		}

		produtoParaVenda.vender(quantidade);
	}

	private Produto encontrarProdutoPorCodigo(int codigo) {
		for (Produto produto : produtos) {
			if (produto.getCodigo() == codigo) {
				return produto;
			}
		}
		return null;
	}

	public void relatorio() {
		System.out.println("Dinheiro disponível: " + dinheiroDisponivel);
		System.out.println("Produtos:");
		listarProdutos();
	}
}

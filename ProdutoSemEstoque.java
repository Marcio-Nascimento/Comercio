package comercio2;

public class ProdutoSemEstoque extends Produto {
    public ProdutoSemEstoque(String nome, String categoria, double custoCompra, double valorVenda) {
        super(nome, categoria, custoCompra, valorVenda);
    }

    @Override
    public void vender(int quantidade) {
        System.out.println("Este produto não pode ser vendido.");
    }
}
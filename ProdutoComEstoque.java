package comercio2;

public class ProdutoComEstoque extends Produto {
    public ProdutoComEstoque (String nome, String categoria, double custoCompra, double valorVenda) {
        super(nome, categoria, custoCompra, valorVenda);
    }

    @Override
    public void vender(int quantidade) {
        int estoqueAtual = getEstoque();
        if (estoqueAtual >= quantidade) {
            estoqueAtual -= quantidade;
            setEstoque(estoqueAtual);
            System.out.println("Venda de " + quantidade + " unidades de " + getNome() +
                    " realizada com sucesso.");
        } else {
            System.out.println("Estoque insuficiente para realizar a venda.");
        }
    }
}

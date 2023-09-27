package comercio2;

public class Produto {
    private static int contadorCodigo = 1;
    private int codigo;
    private String nome;
    private String categoria;
    private int estoque;
    private double custoCompra;
    private double valorVenda;

    public Produto(String nome, String categoria, double custoCompra, double valorVenda) {
        this.codigo = contadorCodigo++;
        this.nome = nome;
        this.categoria = categoria;
        this.estoque = 0;
        this.custoCompra = custoCompra;
        this.valorVenda = valorVenda;
    }
    
    public static int getContadorCodigo() {
        return contadorCodigo;
    }

    public static void setContadorCodigo(int contadorCodigo) {
        Produto.contadorCodigo = contadorCodigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public double getCustoCompra() {
        return custoCompra;
    }

    public void setCustoCompra(double custoCompra) {
        this.custoCompra = custoCompra;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public void adicionarEstoque(int quantidade) {
        estoque += quantidade;
    }

    public void vender(int quantidade) {
        estoque -= quantidade;
    }

    @Override
    public String toString() {
        return nome + " (cód.: " + codigo + " | estoque: " + estoque + " | " + categoria + " | custo de compra: "
                + custoCompra + " | valor de venda: " + valorVenda + ")";
    }
}

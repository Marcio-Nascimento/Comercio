package comercio2;

public class Categoria {
	private String perifericos;
	private String eletrodomesticos;
	private String acessorios;

class Perifericos extends Categoria {
	private String modelo;
	private int ano;

	public Perifericos(String modelo, int ano) {
		this.modelo = modelo;
		this.ano = ano;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
}

class Eletrodomesticos extends Categoria {
	private int potencia;
	private int duracao;

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public Eletrodomesticos(int potencia, int duracao) {
        this.potencia = potencia;
        this.duracao = duracao;
	}
}

class Acessorios extends Categoria {
    private int grauDeConfortabilidade;

    public Acessorios(int grauDeConfortabilidade) {
        this.grauDeConfortabilidade = grauDeConfortabilidade;

	}

	public int getGrauDeConfortabilidade() {
		return grauDeConfortabilidade;
	}

	public void setGrauDeConfortabilidade(int grauDeConfortabilidade) {
		this.grauDeConfortabilidade = grauDeConfortabilidade;
    }
    }
    }


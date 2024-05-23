package ColectionsJavaAPI2023.map;

public class Produto {

	private String nome;
	private Double preco;
	private Integer quantidade;

	public Produto(String nome, Double preco, Integer quantidade) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public Double getPreco() {
		return preco;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	@Override
	public String toString() {
		return String.format("[nome=%s, preco=%s, quantidade=%s]\n", nome, preco, quantidade);
	}
	

}

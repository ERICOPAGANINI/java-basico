package ColectionsJavaAPI2023.list;

public class Item {

	String nome;
	Double preco;
	Integer quantidade;
	
	public Item(String nome, Double preco, Integer quantidade) {
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
	
	public String toString(){
		return nome + ", unidades " + quantidade+ ", preco unitario " + preco + ", preco total " + preco*quantidade+ "\n"; 
	}
}

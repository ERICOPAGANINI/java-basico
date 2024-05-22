package ColectionsJavaAPI2023.set;

import java.util.Objects;

public class Produto implements Comparable<Produto>{

	private String nome;
	private Long codigo;
	private Double preco;
	private Integer quantidade;

	public Produto() {
	}

	public Produto(String nome, Long codigo, Double preco, Integer quantidade) {
		this.nome = nome;
		this.codigo = codigo;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	@Override
	public int compareTo(Produto p) {
		
		return nome.compareToIgnoreCase(p.getNome());
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(codigo, other.codigo);
	}

	public String getNome() {
		return nome;
	}

	public Long getCodigo() {
		return codigo;
	}

	public Double getPreco() {
		return preco;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", codigo=" + codigo + ", preco=" + preco + ", quantidade=" + quantidade + "]";
	}

	
	
	

}

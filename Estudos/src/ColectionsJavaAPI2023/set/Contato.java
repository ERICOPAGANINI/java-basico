package ColectionsJavaAPI2023.set;

import java.util.Objects;

public class Contato {
	private String nome;
	private Integer numeroContato;

	public Contato() {
		
	}
	
	public Contato(String nome, Integer numeroContato) {
		this.nome = nome;
		this.numeroContato = numeroContato;
	}

	public Contato(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public Integer getNumeroContato() {
		return numeroContato;
	}

	public void setNumero(int numeroContato) {
		this.numeroContato = numeroContato;
	}

	@Override
	public String toString() {
		return "(" + nome + "," + numeroContato +"}";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contato other = (Contato) obj;
		return Objects.equals(nome, other.nome);
	}

}

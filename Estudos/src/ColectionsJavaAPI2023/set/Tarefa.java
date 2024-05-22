package ColectionsJavaAPI2023.set;

import java.util.Objects;

public class Tarefa {

	private String descricao;
	private boolean cumpriu;
	
	
	public Tarefa() {
	}

	public Tarefa(String descricao, boolean cumpriu) {
		this.descricao = descricao;
		this.cumpriu = cumpriu;
	}


	public Tarefa (String descricao) {
		this.descricao = descricao;
	}


	public String getDescricao() {
		return descricao;
	}

	public boolean isCumpriu() {
		return cumpriu;
	}
	

	public void setCumpriu(boolean cumpriu) {
		this.cumpriu = cumpriu;
	}

	@Override
	public String toString() {
		return descricao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(descricao);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tarefa other = (Tarefa) obj;
		return Objects.equals(descricao, other.descricao);
	}
	
	


	
	
}

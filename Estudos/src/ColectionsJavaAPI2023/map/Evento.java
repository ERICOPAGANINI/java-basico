package ColectionsJavaAPI2023.map;

import java.util.Objects;

public class Evento {

	private String nomeEvento;
	private String nomeAtracao;

	public Evento() {
	}

	public Evento(String nomeEvento, String nomeAtracao) {
		this.nomeEvento = nomeEvento;
		this.nomeAtracao = nomeAtracao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nomeAtracao, nomeEvento);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Evento other = (Evento) obj;
		return Objects.equals(nomeAtracao, other.nomeAtracao) && Objects.equals(nomeEvento, other.nomeEvento);
	}

	public String getNomeEvento() {
		return nomeEvento;
	}

	public String getNomeAtracao() {
		return nomeAtracao;
	}

	@Override
	public String toString() {
		return String.format(nomeEvento, nomeAtracao);
	}

}

package ColectionsJavaAPI2023.set;

import java.util.Objects;

public class Aluno implements Comparable<Aluno> {

	private String nome;
	private Long matricula;
	private Double nota;
	 
	public Aluno(String nome, Long matricula, Double nota) {
		this.nome = nome;
		this.matricula = matricula;
		this.nota = nota;
	}

	public Aluno() {
	}

	@Override
	public int compareTo(Aluno a) {
	
		return nome.compareToIgnoreCase(a.getNome());
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(matricula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(matricula, other.matricula);
	}

	public String getNome() {
		return nome;
	}

	public Long getMatricula() {
		return matricula;
	}

	public Double getNota() {
		return nota;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ListaAlunos [nome=");
		builder.append(nome);
		builder.append(", matricula=");
		builder.append(matricula);
		builder.append(", nota=");
		builder.append(nota);
		builder.append("]");
		return builder.toString();
	}

	

	
}

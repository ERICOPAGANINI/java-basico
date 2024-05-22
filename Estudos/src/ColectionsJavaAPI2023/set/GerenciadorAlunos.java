package ColectionsJavaAPI2023.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
	
	Set<Aluno> setAlunos;
	
	public GerenciadorAlunos() {
		setAlunos = new TreeSet<>();
	}
	
	public void adicionarAluno(String nome, Long matricula, Double nota) {
		setAlunos.add(new Aluno(nome, matricula, nota));
	}
	
	public void removerAluno(Long matricula) {
		setAlunos.removeIf(aluno -> aluno.getMatricula().equals(matricula));
	}
	
	public void exibirAlunosPorNome() {
		setAlunos.stream()
		.sorted(Comparator.comparing(Aluno::getNome))
		.forEach(System.out::println);
	}
	
	public void exibirAlunosPorNota() {
		setAlunos.stream()
		.sorted(Comparator.comparing(Aluno::getNota))
		.forEach(System.out::println);
	}
	
	public void exibirAlunos() {
		setAlunos.forEach(System.out::println);
	}
	
	public static void main(String[] args) {
		GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();
		
		gerenciadorAlunos.adicionarAluno("João", 12345L, 85d);
		gerenciadorAlunos.adicionarAluno("Maria", 12346L, 60d);
		gerenciadorAlunos.adicionarAluno("Pedro", 12347L, 70d);
		gerenciadorAlunos.adicionarAluno("Jesus", 77777L, 77d);
		gerenciadorAlunos.exibirAlunos();
		gerenciadorAlunos.removerAluno(12345L);
		System.out.println("Nova Lista");
		gerenciadorAlunos.exibirAlunos();
		System.out.println("Alunos por Nome");
		gerenciadorAlunos.exibirAlunosPorNome();
		System.out.println("Alunos por Nota");
		gerenciadorAlunos.exibirAlunosPorNota();

	}

}

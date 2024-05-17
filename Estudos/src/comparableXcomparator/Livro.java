package comparableXcomparator;

import java.util.Comparator;

public class Livro implements Comparable<Livro> {

	private String titulo;
	private String autor;
	private int ano;

	public Livro(String titulo, String autor, int ano) {
		this.titulo = titulo;
		this.autor = autor;
		this.ano = ano;
	}

	// USADO PARA ORDENAR OS LIVROS POR ANO
	public int compareTo(Livro livro) {
		return titulo.compareTo(livro.titulo);
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public int getAno() {
		return ano;
	}

}

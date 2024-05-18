package ColectionsJavaAPI2023.list;

public class Livro {
	private String titulo;
	private String autor;
	private Integer ano;
	
	public Livro(String titulo, String autor, Integer ano) {
		this.titulo = titulo;
		this.autor = autor;
		this.ano = ano;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getAutor() {
		return autor;
	}
	public Integer getAno() {
		return ano;
	}
	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", autor=" + autor + ", ano=" + ano + "]";
	}
	
	
	
	
	

}

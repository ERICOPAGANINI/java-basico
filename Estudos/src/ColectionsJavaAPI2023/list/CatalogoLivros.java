package ColectionsJavaAPI2023.list;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
	
	private List<Livro> livrosList;
	
	public CatalogoLivros() {
		this.livrosList = new ArrayList<>();
	}
	
	public void adicionarLivro(String nome, String autor, Integer ano) {
		livrosList.add(new Livro(nome, autor, ano));
	}
	
	
	public List<Livro> pesquisarPorAutor(String autor){
		List<Livro> livrosPorAutor = new ArrayList<>();
		if (!livrosList.isEmpty()){
			for (Livro l : livrosList) {
				if(l.getAutor().equalsIgnoreCase(autor)) {
					livrosPorAutor.add(l);
				}
			}
		}
		return livrosPorAutor;
	}
	
	public List<Livro> pesquisaPorIntervaloAnos(Integer anoInicial, Integer anoFinal){
		List<Livro> livrosPorIntervaloDeAno = new ArrayList<>();
		if(!livrosList.isEmpty()) {
			for (Livro l :livrosList) {
				if (anoInicial<=l.getAno() && l.getAno()<=anoFinal) {
					livrosPorIntervaloDeAno.add(l);
				}
			}
		}return livrosPorIntervaloDeAno;
		
	}
	
	public Livro pesquisaPorTitulo(String nome) {
		Livro livroPorTitulo = null;
		if(!livrosList.isEmpty()) {
			for(Livro l : livrosList) {
				if(l.getTitulo().equalsIgnoreCase(nome)) {
					livroPorTitulo =l;
					break;
				}
			}
		}return livroPorTitulo;
	}

}

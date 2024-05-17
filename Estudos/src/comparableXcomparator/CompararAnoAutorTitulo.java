package comparableXcomparator;

import java.util.Comparator;

public class CompararAnoAutorTitulo implements Comparator<Livro> {

	public int compare(Livro livroUm, Livro livroDois) {
		int ano = Integer.compare(livroUm.getAno(), livroDois.getAno());
		if (ano != 0)
			return ano;
		int autor = livroUm.getAutor().compareTo(livroDois.getAutor());
		if (autor != 0)
			return autor;
		return livroUm.getTitulo().compareTo(livroDois.getTitulo());
	}

}

package comparableXcomparator;

import java.util.Comparator;

public class CompararAutor implements Comparator<Livro> {

	// Classe para comparar livro por autor
		public int compare(Livro livroUm, Livro livroDois) {
			return livroUm.getAutor().compareTo(livroDois.getAutor());
		}
	}




package comparableXcomparator;

import java.util.Comparator;

public class CompararAno implements Comparator<Livro> {

			public int compare(Livro livroUm, Livro livroDois) {
				return Integer.compare(livroUm.getAno(), livroDois.getAno());
			}

		}


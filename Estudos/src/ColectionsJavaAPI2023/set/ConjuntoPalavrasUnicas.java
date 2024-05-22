package ColectionsJavaAPI2023.set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
	
	private Set<Palavra> conjuntoPalavra;
	private String palavra2;
	
	public ConjuntoPalavrasUnicas () {
		conjuntoPalavra = new HashSet<>();
	}
	
	public void adicionarPalavra(String palavra) {
		conjuntoPalavra.add(new Palavra(palavra));
	}
	
	public void removerPalavra(String palavra) {
		Palavra palavraPesquisa = new Palavra(palavra);
		for(Palavra palavraParaRemover: conjuntoPalavra) {
			if(palavraParaRemover.getPalavra()==palavraPesquisa.getPalavra()) {
				conjuntoPalavra.remove(palavraParaRemover);
				break;
			};
		}
	}
	
	public boolean verificarPalavra(String palavra) {
		Palavra palavraComparar = new Palavra(palavra);
		return conjuntoPalavra.contains(palavraComparar);
	}
	
	
	public void exibirPalavrasUnicas() {
		System.out.println(conjuntoPalavra);
	}
}

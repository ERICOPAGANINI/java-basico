package ColectionsJavaAPI2023.set;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

	private Set<Contato> contatosSet;

	public AgendaContatos() {
		contatosSet = new HashSet<>();
	}

	public void adicionarContato(String nome, int numero) {
		contatosSet.add(new Contato(nome, numero));
	}

	public void exibirContatos() {
		if (!contatosSet.isEmpty()) {
			System.out.println(contatosSet);
		} else {
			System.out.println("O conjunto está vazio!");
		}
	}

	public Set<Contato> pesquisarPorNome(String nome) {
		Contato pesquisaContato = new Contato(nome);
		Set<Contato> contatosNomesIguais = new HashSet<>();
		for (Contato c : contatosSet) {
			if (c.getNome().startsWith(nome)) {
				contatosNomesIguais.add(c);
			}
		}
		return contatosNomesIguais;
	}

	public Contato atualizarNumeroContato(String nome, int novoNumero) {
		Contato contatoParaMudar = new Contato();
		if (!contatosSet.isEmpty()) {
			for (Contato c : contatosSet) {
				if (c.getNome().startsWith(nome)) {
					c.setNumero(novoNumero);
					contatoParaMudar = c;
					break;
				}
			}
			return contatoParaMudar;
		} else
			return null;

	}

}

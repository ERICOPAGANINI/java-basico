package ColectionsJavaAPI2023.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
	public List<Pessoa> pessoaList;
	
	public OrdenacaoPessoas() {
		this.pessoaList = new ArrayList<>();
	}
	
	public void adicionarPessoa(String nome, Integer idade, Double altura) {
		Pessoa pessoa = new Pessoa(nome ,idade, altura);
		pessoaList.add(pessoa);
	}
	
	public List<Pessoa> ordenarPorIdade(){
		List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
		Collections.sort(pessoasPorIdade);
		return pessoasPorIdade;
	}
	
	public List<Pessoa> ordenarPorAltura(){
		List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
		Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
		return pessoasPorAltura;
	}
	
	
	

}

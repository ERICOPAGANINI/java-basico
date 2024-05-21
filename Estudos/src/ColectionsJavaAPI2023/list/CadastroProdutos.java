package ColectionsJavaAPI2023.list;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
	public Set<Produto> setProdutos;

	public CadastroProdutos() {
		setProdutos = new HashSet<>();
	}
	
	public void adicionarProduto(String nome,Long codigo,  Double preco, Integer quantidade) {
		setProdutos.add(new Produto(nome, codigo, preco, quantidade));
	}
	
	public Set<Produto> exibirProdutosPorNome(){
		Set<Produto> produtosPorNome = new TreeSet<>(setProdutos);
		if(!setProdutos.isEmpty()) {
			return produtosPorNome;
		}else { 
			throw new RuntimeException("O conjunto está vazio!");
		}
	}
	
	public Set<Produto> exibirProdutosPorPreco() {
	    Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
	    if (!setProdutos.isEmpty()) {
	      produtosPorPreco.addAll(setProdutos);
	      return produtosPorPreco;
	    } else {
	      throw new RuntimeException("O conjunto está vazio!");
	    }
	  }
	
	public static void main(String[] args) {
		 // Criando uma instância do CadastroProdutos
	    CadastroProdutos cadastroProdutos = new CadastroProdutos();

	    // Adicionando produtos ao cadastro
	    cadastroProdutos.adicionarProduto("Smartphone", 1L,  1000d, 10);
	    cadastroProdutos.adicionarProduto("Notebook", 2L,  1500d, 5);
	    cadastroProdutos.adicionarProduto("Mouse", 1L,  30d, 20);
	    cadastroProdutos.adicionarProduto("Teclado",4L,  50d, 15);

	    // Exibindo todos os produtos no cadastro
	    System.out.println(cadastroProdutos.setProdutos);

	    // Exibindo produtos ordenados por nome
	    System.out.println(cadastroProdutos.exibirProdutosPorNome());

	    // Exibindo produtos ordenados por preço
	    System.out.println(cadastroProdutos.exibirProdutosPorPreco());
		
	}
}

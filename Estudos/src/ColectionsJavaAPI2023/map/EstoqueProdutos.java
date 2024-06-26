package ColectionsJavaAPI2023.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

	private Map<Long, Produto> estoqueProdutosMap;

	public EstoqueProdutos() {
		this.estoqueProdutosMap = new HashMap<>();
	}

	public void adicionarProduto(Long codigo, String nome, Integer quantidade, Double preco) {
		estoqueProdutosMap.put(codigo, new Produto(nome, preco, quantidade));
	}

	public void exibirProdutos() {
		System.out.println(estoqueProdutosMap);
	}

	public Double calculaValorTotalEstoque() {
		Double valorTotalEstoque = 0d;
		if (!estoqueProdutosMap.isEmpty()) {
			for (Produto p : estoqueProdutosMap.values()) {
				valorTotalEstoque += p.getPreco() * p.getQuantidade();
			}
		}
		return valorTotalEstoque;
	}

	public Produto obterProdutoMaisCaro() {
		Produto produtoMaisCaro = null;
		Double maiorPreco = Double.MIN_VALUE;

		if (!estoqueProdutosMap.isEmpty()) {
			for (Produto p : estoqueProdutosMap.values()) {
				if (p.getPreco() > maiorPreco) {
					produtoMaisCaro = p;
					maiorPreco=p.getPreco();
				}
			}

		}
		return produtoMaisCaro;
	}
	
	public Produto obterProdutoMaisBarato() {
		return estoqueProdutosMap.values().stream()
				.min(Comparator.comparingDouble(Produto::getPreco))
				.orElse(null);
		
	}
	
	public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
		Produto produtoMaiorQuantidadeValorNoEstoque = null;
		Double maiorValorTotalNoEstoque= 0d;
		
		if(!estoqueProdutosMap.isEmpty()) {
			for(Produto p: estoqueProdutosMap.values()) {
				if(p.getPreco()*p.getQuantidade() > maiorValorTotalNoEstoque) {
					produtoMaiorQuantidadeValorNoEstoque = p;
					maiorValorTotalNoEstoque = p.getPreco()*p.getQuantidade();
				}
			}
		}return produtoMaiorQuantidadeValorNoEstoque;
	}
	

	public static void main(String[] args) {
		EstoqueProdutos estoque = new EstoqueProdutos();

		// Exibe o estoque vazio
		estoque.exibirProdutos();

		// Adiciona produtos ao estoque
		estoque.adicionarProduto(0L, "Bala bombom",6000, 2.0);
		estoque.adicionarProduto(1L, "Notebook", 1, 1500.0);
		estoque.adicionarProduto(2L, "Mouse", 5, 25.0);
		estoque.adicionarProduto(3L, "Monitor", 10, 400.0);
		estoque.adicionarProduto(4L, "Teclado", 2, 40.0);
		estoque.adicionarProduto(5L, "Jujuba", 1000, 5.0);

		// Exibe os produtos no estoque
		estoque.exibirProdutos();

		// Calcula e exibe o valor total do estoque
		System.out.println("Valor total do estoque: R$" + estoque.calculaValorTotalEstoque());

		// Obtém e exibe o produto mais caro
		Produto produtoMaisCaro = estoque.obterProdutoMaisCaro();
		System.out.println("Produto mais caro: " + produtoMaisCaro);

		// Obtém e exibe o produto mais barato
		Produto produtoMaisBarato = estoque.obterProdutoMaisBarato();
		System.out.println("Produto mais barato: " + produtoMaisBarato);

		// Obtém e exibe o produto com a maior quantidade em valor no estoque
		Produto produtoMaiorQuantidadeValorTotal = estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque();
		System.out.println("Produto com maior quantidade em valor no estoque: " + produtoMaiorQuantidadeValorTotal);
	}

}

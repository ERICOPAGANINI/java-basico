package ColectionsJavaAPI2023.list;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	
	private List<Item> itensCarrinho;
	
	public CarrinhoDeCompras() {
		itensCarrinho = new ArrayList<>();
	}
	
	public void adicionarItem(String nome, Double preco, Integer quantidade) {
		itensCarrinho.add(new Item(nome, preco, quantidade));
	}
	
	public void removerItem(String nome) {
		List<Item> itensARemover = new ArrayList<>();
		
		for(Item i :itensCarrinho) {
			if(i.getNome().equalsIgnoreCase(nome)) {
				itensARemover.add(i);
			}
			itensCarrinho.removeAll(itensARemover);
		}
		
	}
	
	public Double calcularValorTotal() {
		Double valorTotal=0.0;
		for(Item i : itensCarrinho) {
			valorTotal+=i.getPreco()*i.getQuantidade();
		}
		return valorTotal;
	}
	
	public void exibirItens() {
		System.out.println(itensCarrinho.toString());
	}

}

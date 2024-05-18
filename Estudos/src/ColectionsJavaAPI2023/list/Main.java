package ColectionsJavaAPI2023.list;

public class Main {

	public static void main(String[] args) {
		ListaTarefa listaTarefa = new ListaTarefa();
		System.out.println("O numero total de elementos na lista e: " + listaTarefa.obterNumeroTotalDeTarefas());
		System.out.println("---------------");
		listaTarefa.adicionarTarefa("Tarefa 1");
		listaTarefa.adicionarTarefa("Tarefa 2");
		listaTarefa.adicionarTarefa("Tarefa 3");
		listaTarefa.adicionarTarefa("Tarefa 4");
		listaTarefa.adicionarTarefa("Tarefa 5");
		listaTarefa.adicionarTarefa("Tarefa 6");
		listaTarefa.adicionarTarefa("Tarefa 7");
		System.out.println("O numero total de elementos na lista e: " + listaTarefa.obterNumeroTotalDeTarefas());
		System.out.println("---------------");
		listaTarefa.removerTarefa("Tarefa 2");
		System.out.println("O numero total de elementos na lista e: " + listaTarefa.obterNumeroTotalDeTarefas());
		listaTarefa.obterDescricoesTarefas();
		System.out.println("---------------");
		listaTarefa.removerTarefa("tarefa 5");
		listaTarefa.removerTarefa("TAREFA 4");
		System.out.println("O numero total de elementos na lista e: " + listaTarefa.obterNumeroTotalDeTarefas());
		listaTarefa.obterDescricoesTarefas();
		System.out.println("--------------------------------------------------------------------");
		CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
		carrinhoDeCompras.adicionarItem("Bife Ancho", 40.00, 1);
		carrinhoDeCompras.adicionarItem("Suco de Uva Integral", 15.00, 1);
		carrinhoDeCompras.adicionarItem("Suco de Laranja Integral", 15.00, 1);
		carrinhoDeCompras.adicionarItem("Coca Cola Zero", 15.00, 1);
		carrinhoDeCompras.adicionarItem("Arroz SEPE BIANCO", 20.00, 1);
		carrinhoDeCompras.adicionarItem("Tomate", 5.00, 5);
		carrinhoDeCompras.adicionarItem("Pimentão Verde", 5.00, 3);
		carrinhoDeCompras.adicionarItem("Cebola", 3.00, 3);
		carrinhoDeCompras.removerItem("suco de laranja integral");
		carrinhoDeCompras.exibirItens();
	System.out.println(carrinhoDeCompras.calcularValorTotal());	
		
		
	}

}

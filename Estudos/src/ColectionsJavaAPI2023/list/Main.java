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
		carrinhoDeCompras.adicionarItem("Suco de Laranja Integral", 15.00, 1);
		carrinhoDeCompras.adicionarItem("Coca Cola Zero", 15.00, 1);
		carrinhoDeCompras.adicionarItem("Arroz SEPE BIANCO", 20.00, 1);
		carrinhoDeCompras.adicionarItem("Tomate", 5.00, 5);
		carrinhoDeCompras.adicionarItem("Pimentão Verde", 5.00, 3);
		carrinhoDeCompras.adicionarItem("Cebola", 3.00, 3);
		System.out.println(carrinhoDeCompras.calcularValorTotal());
		System.out.println("--------------------------------------------------------------------");

		// Criando uma instância do catálogo de livros
		CatalogoLivros catalogoLivros = new CatalogoLivros();

		// Adicionando livros ao catálogo
		catalogoLivros.adicionarLivro("Microsserviços Prontos Para a Produção", "Susan J. Fowler", 2017);
		catalogoLivros.adicionarLivro("Java Guia do Programador", "Peter Jandl Junior", 2021);
		catalogoLivros.adicionarLivro("Java Guia do Programador", "Peter Jandl Junior", 2021);
		catalogoLivros.adicionarLivro("Código Limpo", "Robert C. Martin", 2009);
		catalogoLivros.adicionarLivro("O Codificador Limpo", "Robert C. Martin", 2012);
		System.out.println(catalogoLivros.pesquisarPorAutor("Robert C. Martin"));
	    System.out.println(catalogoLivros.pesquisarPorAutor("Autor Inexistente"));
	    System.out.println(catalogoLivros.pesquisaPorIntervaloAnos(2010, 2022));
	    System.out.println(catalogoLivros.pesquisaPorIntervaloAnos(2025, 2030));
	    System.out.println(catalogoLivros.pesquisaPorTitulo("Java Guia do Programador"));
	    System.out.println(catalogoLivros.pesquisaPorTitulo("Título Inexistente"));

	}

}

package ColectionsJavaAPI2023.list;

public class Main {
	
	public static void main (String[] args) {
		ListaTarefa listaTarefa = new ListaTarefa();
		System.out.println("O numero total de elementos na lista e: " +listaTarefa.obterNumeroTotalDeTarefas());
		System.out.println("---------------");
		listaTarefa.adicionarTarefa("Tarefa 1");
		listaTarefa.adicionarTarefa("Tarefa 2");
		listaTarefa.adicionarTarefa("Tarefa 3");
		listaTarefa.adicionarTarefa("Tarefa 4");
		listaTarefa.adicionarTarefa("Tarefa 5");
		listaTarefa.adicionarTarefa("Tarefa 6");
		listaTarefa.adicionarTarefa("Tarefa 7");
		System.out.println("O numero total de elementos na lista e: " +listaTarefa.obterNumeroTotalDeTarefas());
		System.out.println("---------------");
		listaTarefa.removerTarefa("Tarefa 2");
		System.out.println("O numero total de elementos na lista e: " +listaTarefa.obterNumeroTotalDeTarefas());
		listaTarefa.obterDescricoesTarefas();
		System.out.println("---------------");
		listaTarefa.removerTarefa("tarefa 5");
		listaTarefa.removerTarefa("TAREFA 4");
		System.out.println("O numero total de elementos na lista e: " +listaTarefa.obterNumeroTotalDeTarefas());
		listaTarefa.obterDescricoesTarefas();

		



	}

}

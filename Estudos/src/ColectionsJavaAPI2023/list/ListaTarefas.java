package ColectionsJavaAPI2023.list;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
	
	private Set<Tarefa> listaTarefas;
	
	public ListaTarefas() {
		listaTarefas = new HashSet<>();
	}
	
	public void  adicionarTarefa(String descricao) {
		listaTarefas.add(new Tarefa(descricao));
	}
	
	public void removerTarefa(String descricao) {
		Tarefa tarefaParaRemover = new Tarefa(descricao);
		if(!listaTarefas.isEmpty()) {
			for(Tarefa t: listaTarefas) {
				  if(t.getDescricao()==tarefaParaRemover.getDescricao()) {
					  listaTarefas.remove(t);
					  break;
				  }
			}
		}else System.out.println("A lista de tarefas esta vazia");
		
	}
		
	public void exibirTarefas() {
		System.out.println(listaTarefas);
	}
	
	public Integer contarTarefas() {
		return listaTarefas.size();
	}
	
	public Set<Tarefa> obterTarefasConcluidas() {
		Set<Tarefa> tarefasCumpridas = new HashSet<>();
		if(!listaTarefas.isEmpty()) {
			for(Tarefa t: listaTarefas) {
				if(t.isCumpriu()==true) {
					tarefasCumpridas.add(t);
				}
			}return tarefasCumpridas;
		}else return null;
	}
	
	public Set<Tarefa> obterTarefasPendentes() {
		Set<Tarefa> tarefasPendentes = new HashSet<>();
		if(!listaTarefas.isEmpty()) {
			for(Tarefa t: listaTarefas) {
				if(t.isCumpriu()==false) {
					tarefasPendentes.add(t);
				}
			}return tarefasPendentes;
		}else return null;
	}
	
	public void marcarTarefaConcluida(String descricao) {
		Tarefa marcarConcluida = new Tarefa(descricao);
		if(!listaTarefas.isEmpty()) {
			for(Tarefa t : listaTarefas) {
				if(t.getDescricao().equalsIgnoreCase(descricao)) {
					t.setCumpriu(true);
				}
			}
		} else System.out.println("A lista de tarefas esta vazia");
		
	}
	
	public void marcarTarefaPendente(String descricao) {
		if(!listaTarefas.isEmpty()) {
			for(Tarefa t : listaTarefas) {
				if(t.getDescricao().equalsIgnoreCase(descricao)) {
					t.setCumpriu(false);
				}
			}
		} else System.out.println("A lista de tarefas esta vazia");
		
	}
	
	public void limparListaTarefas() {
		listaTarefas.removeAll(listaTarefas);
	}
	
	

	
}

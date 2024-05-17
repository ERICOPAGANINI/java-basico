package ColectionsJavaAPI2023.list;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
	
	private List<Tarefa> tarefaList; 
	
	public ListaTarefa() {
		this.tarefaList = new ArrayList<>();
	}

	public void adicionarTarefa (String descricao) {
		tarefaList.add(new Tarefa(descricao));
	}
	
	public void removerTarefa(String descricao) {
		List<Tarefa> tarefasARemover = new ArrayList<>();
		
		for(Tarefa t : tarefaList){
			if(t.getDescricao().equalsIgnoreCase(descricao)){
				tarefasARemover.add(t);
			}
		}
		tarefaList.removeAll(tarefasARemover);
	}
	
	public Integer obterNumeroTotalDeTarefas() {
		return tarefaList.size();
	}
	
	public void obterDescricoesTarefas() {
		System.out.println(tarefaList);
	}
}

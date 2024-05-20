package ColectionsJavaAPI2023.list;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
	//atributo
	private Set<Convidado> convidadosSet;
	
	public ConjuntoConvidados (){
		this.convidadosSet = new HashSet<>();
	}
	
	public void adicionarConvidado(String nome, Integer codigoConvite) {
		convidadosSet.add(new Convidado(nome, codigoConvite));
	}
	public void removerConvidadoPorCodigoConvite(Integer codigoConvite) {
		for(Convidado convidadoParaRemover :convidadosSet) {
			if(convidadoParaRemover.getCodigoConvite().equals(codigoConvite)) {
				convidadosSet.remove(convidadoParaRemover);
				break;
			}
		}
		
	}
	
	public Integer contarConvidados() {
		return convidadosSet.size();
	}
	
	public void exibirConvidados() {
		System.out.println(convidadosSet);
	}

}

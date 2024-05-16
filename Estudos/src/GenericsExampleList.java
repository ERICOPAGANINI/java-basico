
import java.util.ArrayList;
import java.util.List;

public class GenericsExampleList {
	
	public static void main (String[] args) {
		// Exemplo sem operador diamond
		
		List listaSemGenerics = new ArrayList();
		listaSemGenerics.add("String 1 - sem generics");
		listaSemGenerics.add(2);
		
		
		// Exemplo com operador diamond
		List<String> listaComGenerics = new ArrayList<>();
		listaComGenerics.add("String 1 - com generics");
		listaComGenerics.add("String 2- com generics");
		listaComGenerics.add("String 3- com generics");
		
		
		//Iterando sobre a lista com generics:
		for(String elemento: listaComGenerics) {
			System.out.println(elemento);
		}
		
		//Iterando sobre a lista sem generics
		
		for(Object objeto : listaSemGenerics) {
			String str  =(String) objeto;
			System.out.println(str);
		}

		
	}

}

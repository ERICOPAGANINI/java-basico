import java.util.HashMap;
import java.util.Map;

public class GenericsExempleMap {

	public static void main(String[] args) {
		//Exemplo sem Generics
		
		Map mapaSemGenerics = new HashMap();
		mapaSemGenerics.put("Chave 1 sem generics", 10);
		mapaSemGenerics.put("Chave 2 sem generics", 20);
		
		// Exemplo com generics
		
		Map <String, Integer> mapaComgenerics = new HashMap<>();
		mapaComgenerics.put("Chave 1 com generics", 10);
		mapaComgenerics.put("Chave 2 com generics", 20);
		
		// Iterando sobre o mapa com Generics
		for (Map.Entry<String, Integer> entry : mapaComgenerics.entrySet()){
			String chave = entry.getKey();
			int valor = entry.getValue();
			System.out.println("Chave: " + chave + ", Valor: " + valor);
		
		}
		
		//Iterando sobre o mapa sem Generics (necessário fazer cast)
		for (Object obj :mapaSemGenerics.entrySet()) {
			Map.Entry entry = (Map.Entry) obj;
			String chave = (String) entry.getKey();
			Object valor = entry.getValue();
			System.out.println("Chave: " + chave + ", Valor: " + valor);

		}
		
		
		

		
	}

}

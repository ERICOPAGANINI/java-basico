import java.util.Random;

public class ExemploDoWhile {
	
	
	public static void main (String[] args) {
		/*Joãozinho resolveu ligar para o seu amigo, 
		 * dizendo que hoje se entupiu de comer docinhos
		 * */
		System.out.println("Discando...");
		
		do {
			System.out.println("Telefone tocando");
			
		}while(tocando()==true);
		System.out.println("Alo !!!");
	}
	
	public static boolean tocando() {
		boolean atendeu = new Random().nextInt(3)==1;
		System.out.println("Atendeu? " + atendeu);
		return !atendeu;
	}
}

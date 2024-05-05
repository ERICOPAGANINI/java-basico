import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
	public static void main (String[] args) {
		
		/*
		 * Joãozinho recebeu R$ 50,00 de mesada e foi em uma loja de doces 
		 * gastar todo o seu dinheiro, logo, enquanto o valor dos doces não 
		 * igualar a R$ 50,00 ele foi adicionando itens no carrinho.
		 * 
		 * */
		
		double mesada = 50.0;
		
		while (mesada>0) {
			Double valorDoce = valorAleatorio();
			System.out.println("Doce de valor " + valorDoce + " adicionado no carrinho.");
			if(mesada<valorDoce) {
				valorDoce=mesada;
			}
			
			mesada-=valorDoce;
		}
		System.out.println("Mesada " + mesada);
		System.out.println("Joãozinho gastou toda sua mesada em doces.");
		}
		
	public static double valorAleatorio() {
		return Math.round (ThreadLocalRandom.current().nextDouble(2,15));
	}

	

}

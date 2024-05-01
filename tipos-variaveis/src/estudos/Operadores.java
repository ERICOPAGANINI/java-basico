package estudos;

import java.util.Date;

public class Operadores {

	public static void main(String[] args) {
		//operador de atribuição
		String nome = "GLEYSON";
		int idade = 22;
		double peso = 68.5;
		char sexo = 'M';
		boolean doadorOrgao = false;
		Date dataNascimento = new Date();
		System.out.println(dataNascimento);
		
		//aritiméticos	
		
		double soma = 10.5 + 15.7;
		int subtração = 113 - 25;
		int multiplicacao = 20 * 7;
		int divisao = 15 / 3;
		int modulo = 18 % 3;
		double resultado = (10 * 7) + (20/4);
		System.out.println(modulo);
		
		//ATENÇÃO! O operador de adição (+), quando utilizado em variáveis do tipo texto, realizará a “concatenação de textos”.

		String nomeCompleto = "LINGUAGEM" + "JAVA";
		System.out.println(nomeCompleto);
		
		//concatenação
		
		String concatenacao ="?"; 
		System.out.println(concatenacao);
		concatenacao = 1+1+1+"1";
		System.out.println(concatenacao);
		concatenacao = 1+"1"+1+1;
		System.out.println(concatenacao);
		concatenacao = 1+"1"+1+"1";
		System.out.println(concatenacao);
		concatenacao = "1"+1+1+1;
		System.out.println(concatenacao);
		concatenacao = "1"+(1+1+1);
		System.out.println(concatenacao);

		//operadores unarios
		
		int numero = 5;
		System.out.println(- numero);
		numero ++;
		System.out.println(numero);
		System.out.println(numero ++);
		System.out.println(numero);//
		System.out.println(++ numero);
		boolean verdadeiro = true;
		System.out.println("Inverteu " + !verdadeiro);
	}

}

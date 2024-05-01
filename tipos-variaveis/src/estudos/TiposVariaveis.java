package estudos;

public class TiposVariaveis {

	public static void main(String[] args) {
		// tipos primitivos e variaveis
		byte idade = 123;
		short ano = 2021;
		int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
		long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo
		float pi = 3.14F;
		double salario = 1275.33;
		
		short numeroCurto = 1;
		int numeroNormal = numeroCurto;
		short numeroCurto2 = (short) numeroNormal;// casting;
		
		//constantes
		
		final double VALOR_DE_PI = 3.14; // a palavra reservada final faz o valor ficar constante
		
		
	}

}

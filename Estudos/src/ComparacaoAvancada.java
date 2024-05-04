

public class ComparacaoAvancada {

	public static void main(String[] args) {
		String nome1 = "JAVA";
		String nome2 = "JAVA";

		System.out.println(nome1 == nome2); // true

		String nome3 = new String("JAVA");

		System.out.println(nome1 == nome3); // false

		String nome4 = nome3;

		System.out.println(nome3 == nome4); // true

		// UTILIZANDO EQUALS equals na par
		System.out.println(nome1.equals(nome2)); // TRUE
		System.out.println(nome2.equals(nome3)); // TRUE
		System.out.println(nome3.equals(nome4)); // TRUE
		System.out.println();

		// EQUALS VS ==
		System.out.println("Equals vs ==");
		int numero1 = 130;
		int numero2 = 130;
		System.out.println(numero1 == numero2); // true
		Integer num1 = 130;
		Integer num2 = 130;
		System.out.println(num1 == num2); // false
		/* A razão pela qual o resultado é false, é devido o Java tratar os valores
		Como objetos a partir de agora.
		Qual a solução ?
		Quando queremos comparar objetos, usamos o método equals */
		System.out.println(num1.equals(num2));
		
		//OPERADOR & ABREVIADO
		System.out.println("Operador Abreviado");
		int numeroUm = 1;
		int numeroDois= 2;

		if(numeroUm== 2 & numeroDois ++ == 2 )
		    System.out.println("As 2 condições são verdadeiras");

		System.out.println("O numero 1 agora e " + numeroUm);
		System.out.println("O numero 2 agora e " + numeroDois);
	}
}

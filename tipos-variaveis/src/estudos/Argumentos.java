package estudos;

public class Argumentos {
	
	public static void main (String[] args) {
		String nome =  args [0];
		String sobrenome = args[1];
		String idade = args[2];
		String altura = args[3];
		
		System.out.println("Ola, me chamo " + nome + " " + sobrenome);
		System.out.println("Tenho " + idade + " de idade e " + altura + "m de altura.");
	}

}

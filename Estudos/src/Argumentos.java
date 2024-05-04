

public class Argumentos {
	
	public static void main (String[] args) {
		String nome =  args [0];
		String sobrenome = args[1];
		Integer idade = Integer.valueOf(args[2]);
		Double altura = Double.valueOf(args[3]);
		
		System.out.println("Ola, me chamo " + nome + " " + sobrenome);
		System.out.println("Tenho " + idade + " de idade e " + altura + "m de altura.");
	}

}

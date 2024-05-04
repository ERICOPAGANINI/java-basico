
public class ResultadoEscolar {
	public static void main (String[] args) {
		
		Double media = 70.0;
		Double notaAluno = 70.0;
		
		if (notaAluno >= media) {
			System.out.println("Aprovado");
		}
		
		else if (50.0<=notaAluno && notaAluno<media) {
			
			System.out.println("Aluno em Recuperação");
		} else System.out.println("Reprovado");
		
	}

}

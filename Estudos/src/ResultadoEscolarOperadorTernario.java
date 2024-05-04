
public class ResultadoEscolarOperadorTernario {
	public static void main (String[] args) {
		Double media = 70.0;
		Double notaLimite = 50.0;
		
		Double notaAluno = 69.0;
	
		String resultado = notaAluno>=media ? "Aprovado" : notaAluno >= notaLimite && notaAluno <media ? "Recuperação" : "Reprovado";
		
		System.out.println(resultado);
		
	}

}

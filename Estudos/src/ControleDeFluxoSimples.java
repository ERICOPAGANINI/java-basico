
public class ControleDeFluxoSimples {
	
	public static void main(String[] args) {
		
		Double saldoConta = 300.0 ;
		Double valorSaque = 350.0;
		
		if (valorSaque <= saldoConta) {
			saldoConta -=valorSaque;
		}else {
			System.out.println("O valor para saque é maior que o saldo de: ");
		}
		
		System.out.println(saldoConta);
		
	}

}

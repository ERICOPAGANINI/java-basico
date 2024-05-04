
import java.util.Scanner;
public class ContaTerminal {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Por favor, digite o numero da Conta !");
		int numeroDaConta = sc.nextInt();
		sc.nextLine();
		System.out.println("Por favor, digite o numero da Agencia !");
		String numeroDaAgencia = sc.nextLine();
		System.out.println("Por favor, digite o nome do Cliente !");
		String nomeDoCliente = sc.nextLine();
		System.out.println("Por favor, digite o saldo do Conta !\n");
		String saldoDaConta = sc.next();
		System.out.println("Ola "+nomeDoCliente+ ", obrigado por criar uma conta em nosso banco, "
				+ "sua agencia e "+ numeroDaAgencia+", conta " +numeroDaConta + " e seu saldo "+
				saldoDaConta+ " ja esta disponível para saque.");
	
		
		
		sc.close();
	}

}

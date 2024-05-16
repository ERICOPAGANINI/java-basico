import java.util.Scanner;

public class SimulacaoBancaria {
    public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
		  double saldo = 0;
		  while (true) {
			  int opcao = scanner.nextInt();
			  switch (opcao) {
			    case 1:
				    double valorDeposito = scanner.nextDouble();
				    saldo += valorDeposito;
            System.out.println(saldoToString(saldo));
				  break;
			    case 2:
				    double valorSaque = scanner.nextDouble();
				    saqueValor(saldo, valorSaque);
				  break;
			    case 3:
            System.out.println(saldoToString(saldo));
				  break;
			    case 0:
				    System.out.println("Programa encerrado.");
				    scanner.close();
				  return;
			    default:
				    System.out.println("Opção inválida. Tente novamente.");
			}

		}
	}
	
	    public static String saldoToString(double saldo) {
		    return ("Saldo atual: " + saldo);
	    }
	
	    public static void saqueValor(double saldo, double valorSaque) {
		      if (saldo >= valorSaque) {
			    saldo -= valorSaque;
          System.out.println(saldoToString(saldo));
		    }else System.out.println("Saldo insuficiente.");
	}

}


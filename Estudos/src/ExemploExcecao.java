import java.util.InputMismatchException;
import java.util.Scanner;

public class ExemploExcecao {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		while (true) {
			try {
				System.out.println("Digite um numero: ");
				Double numero = sc.nextDouble();
				Number valor = Double.valueOf(numero);

				System.out.println(valor);
				break;
				
			} catch (NumberFormatException e) {
				System.out.println("Digite apenas numeros.");
				sc.next();

			} catch (InputMismatchException e ) {
				System.out.println("Digite apenas numeros.");
				sc.next();
				
			}
		}
	sc.close();
	}

}

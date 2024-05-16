import java.util.Scanner;

public class ControleSimplesDeSaques {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        double limiteDiario = scanner.nextDouble();
        for(;;){
          double saque= scanner.nextDouble();
          
          if(saque>0 && saque<=limiteDiario){
            limiteDiario-=saque;
            System.out.println("Saque realizado. Limite restante: " + limiteDiario);
          }
          
          if(saque>limiteDiario){
            System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
            break;
          }
          
          if(saque==0) {
            System.out.println("Transacoes encerradas.");
            break;
          }          
        }
        scanner.close(); 
    }
}

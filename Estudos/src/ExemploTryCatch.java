import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ExemploTryCatch {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        
        String nome = null;
        String sobrenome = null;
        Integer idade = null;
        Double altura = null;
        
        while (true) {
            try {
                if (nome == null) {
                    System.out.println("Digite seu nome: ");
                    nome = scanner.next();
                }
                if (sobrenome == null) {
                    System.out.println("Digite seu sobrenome: ");
                    sobrenome = scanner.next();
                }
                if (idade == null) {
                    System.out.println("Digite a sua idade: ");
                    idade = scanner.nextInt();
                }
                if (altura == null) {
                    System.out.println("Digite a sua altura: ");
                    altura = scanner.nextDouble();
                }
                
                System.out.println("Ola me chamo " + nome + " " + sobrenome);
                System.out.println("Tenho " + idade + " anos de idade");
                System.out.println("Minha altura e: " + altura + " m");
                
                break; // Se não ocorreu exceção, sair do loop
            } catch (InputMismatchException e) {
                System.out.println("A idade e altura devem ser valores numéricos. Tente novamente.");
                scanner.nextLine(); // Limpar o buffer do scanner
                // Resetar os valores que causaram o erro para permitir que sejam digitados novamente
                idade = null;
                altura = null;
            }
        }
        
        scanner.close();
    }
}
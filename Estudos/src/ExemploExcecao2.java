import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao2 {
	public static void main(String[] args) {
		try{
		Number valor = NumberFormat.getInstance().parse("a1.75"); // neste caso o Java obriga a tratar o erro 
		
		System.out.println(valor);
		}catch(ParseException e ) {
			System.out.println("Digite apenas numeros");
			
		}catch(NumberFormatException e ) {
			System.out.println("Digite apenas numeros");
		}
	}
}

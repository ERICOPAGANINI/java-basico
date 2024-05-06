
public class ExemploPilhaExecução {
	public static void main (String[] args) {
		
		System.out.println("Aqui inicia o metodo main");
		metodoA();
		System.out.println("Aqui termina o metodo main");
		
	}
	
	static void metodoA() { // quando não colocamos modificador public protected ou private em uma classe por padrão é public
		System.out.println("Aqui inicia o metodoA");
		metodoB();
		System.out.println("Aqui termina o metodoA");
	}
	
	public static void metodoB() {
		System.out.println("Aqui inicia o metodoB");
		for (int i =0; i<=5; i++) {System.out.println(i);}
		metodoC();
		System.out.println("Aqui termina o metodoB");
	}
	
	public static void metodoC() {
		System.out.println("Aqui inicia o metodoC");
		Thread.dumpStack();
		System.out.println("Aqui termina o metodoC");
	}

}

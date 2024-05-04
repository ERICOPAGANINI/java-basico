
public class PlanoOperadora {

	public static void main(String[] args) {

		/*
		 * magina que fomos requisitados a criar um sistema de plano telefônico onde: O
		 * sistema terá 03 planos: BASIC, MIDIA , TURBO; BASIC: 100 minutos de ligação;
		 * MÍDIA: 100 minutos de ligação + WhatsApp e Instagram grátis; TURBO: 100
		 * minutos de ligação + WhatsApp e Instagram grátis + 5 GB Youtube.
		 */
		String escolhaPlano = "B";

		switch (escolhaPlano) {
		case "T": {
			System.out.println("5 GB Youtube.");

		}
		case "M": {
			System.out.println("WhatsApp e Instagram grátis");

		}
		case "B": {
			System.out.println("100 minutos de ligação");
		}
		}
	}

}

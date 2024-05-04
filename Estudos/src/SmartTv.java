
public class SmartTv {
	boolean ligada =false;
	int canal = 1;
	int volume= 25;
	
	public void ligar() {
		ligada=true;
	}
	
	public void desligar() {
		ligada=false;
	}
	
	public void subirCanal() {
		canal++;
	}
	
	public void descerCanal() {
		canal--;
	}
	public void subirVolume() {
		volume++;
	}
	
	public void descerVolume() {
		volume--;
	}
	
	public void mudarCanalEscifico(int novoCanal) {
		canal = novoCanal;
	}
	
	

}

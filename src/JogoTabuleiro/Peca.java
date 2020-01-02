package JogoTabuleiro;

public class Peca {
 
	protected Posicao posicao;
	private Tabuleiro tabuleiro;//
	//Construtor
	public Peca( Tabuleiro tabuleiro) {
		
		
		this.tabuleiro = tabuleiro;
		this.posicao =null;
	}



	protected Tabuleiro getTabuleiro() {
		return tabuleiro;
	}
	
	
	
}

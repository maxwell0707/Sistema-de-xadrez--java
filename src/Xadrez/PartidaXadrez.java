package Xadrez;

import JogoTabuleiro.Tabuleiro;

public class PartidaXadrez {
	private Tabuleiro tabuleiro;
	
	
	//CONSTRORES
		public PartidaXadrez() {
			tabuleiro= new Tabuleiro(8,8);
		}
	
		public PecaDeXadrez[][] getPecas(){
			PecaDeXadrez[][] mat = new PecaDeXadrez[tabuleiro.getLinha()][tabuleiro.getColuna()];
			for(int i=0; i<tabuleiro.getLinha();i++) {
				for(int j=0;j<tabuleiro.getColuna();j++) {
					mat[i][j]= (PecaDeXadrez) tabuleiro.peca(i, j);
				}
				
			}
			return mat;
		}
}
	
	
	

package Xadrez;

import JogoTabuleiro.Posicao;
import JogoTabuleiro.Tabuleiro;
import Xadrez.pecas.Rei;
import Xadrez.pecas.Torre;

public class PartidaXadrez {
	private Tabuleiro tabuleiro;
	
	
	
		public PartidaXadrez() {
			tabuleiro= new Tabuleiro(8,8);
			configuracaoInicial();
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
		private void  configuracaoInicial() {
			
			tabuleiro.colocarPeca(new Torre(tabuleiro,Color.BRANCO), new Posicao(2,1));
			tabuleiro.colocarPeca(new Rei(tabuleiro,Color.PRETO), new Posicao(0,4));
			tabuleiro.colocarPeca(new Rei(tabuleiro,Color.BRANCO), new Posicao(7,4));
		}
}
	
	
	

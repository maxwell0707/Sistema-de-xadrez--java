package Xadrez;

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
		private void colocandoNovaPeca(char coluna,int linha,PecaDeXadrez  peca) {
			tabuleiro.colocarPeca(peca,new  XadrezPosicao (coluna,linha).toPosition());
			
		}
		private void  configuracaoInicial() {
			
			colocandoNovaPeca( 'b', 6, new Torre(tabuleiro,Color.BRANCO));
			colocandoNovaPeca('e' , 8 , new Rei(tabuleiro,Color.PRETO));
			colocandoNovaPeca('e' ,1 , new Rei(tabuleiro,Color.BRANCO));
		}
}
	
	
	

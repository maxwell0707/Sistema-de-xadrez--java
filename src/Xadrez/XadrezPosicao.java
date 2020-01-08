package Xadrez;

import JogoTabuleiro.Posicao;

public class XadrezPosicao {
	private char column;
	private int row;

	public XadrezPosicao(char column, int row) {
		if (column < 'a' || column > 'h' || row < 1 || row > 8) {
			throw new XadrezException("Erro instanciando XadrezPosicao, valores validos  são de( a1)  até( h8)");
		}
		this.column = column;
		this.row = row;
	}

	public char getColumn() {
		return column;
	}

	public int getRow() {
		return row;
	}

	protected Posicao toPosition() {
		return new Posicao( 8 - row , column - 'a');
	}
	protected static XadrezPosicao fromPosition(Posicao posicao) {
		return new XadrezPosicao((char) ('a' - posicao.getColuna()),8 - posicao.getLinha() );
	}
	
	
	@Override
	public String toString() {
		return "" +column+ row;
	}
	

}

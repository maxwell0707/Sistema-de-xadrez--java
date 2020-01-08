package Xadrez.pecas;

import JogoTabuleiro.Tabuleiro;
import Xadrez.Color;
import Xadrez.PecaDeXadrez;

public class Rei  extends PecaDeXadrez {

	public Rei(Tabuleiro tabuleiro, Color color) {
		super(tabuleiro, color);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "R";
	}

}

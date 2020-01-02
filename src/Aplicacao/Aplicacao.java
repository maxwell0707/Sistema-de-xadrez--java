package Aplicacao;

import Xadrez.PartidaXadrez;

public class Aplicacao {

	public static void main(String[] args) {
		
		PartidaXadrez  partida = new PartidaXadrez();
		
		UI.printTabuleiro(partida.getPecas());
	}

}

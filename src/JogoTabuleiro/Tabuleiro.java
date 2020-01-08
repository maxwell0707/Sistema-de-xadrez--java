package JogoTabuleiro;

public class Tabuleiro {
private int linha;
private int coluna;
private Peca[][] pecas;
public Tabuleiro(int linha, int coluna) {
	
	if(linha < 1 || coluna < 1) {
	throw new TabuleiroException("Erro Criando Tabuleiro:  é necessario que haja pelo menos 1 linha e 1 coluna.! ");
	
		
	}
	
	
	
	this.linha = linha;
	this.coluna = coluna;
	pecas = new Peca[linha][coluna];
}
public int getLinha() {
	return linha;
}

public int getColuna() {
	return coluna;
}


public Peca peca(int linha, int coluna) {
	if(!posicaoExistente(linha,coluna)) {
		throw new TabuleiroException(" Posição não existe");
		
	}
	return pecas[linha][coluna];
}

public Peca peca(Posicao posicao) {
	if(!posicaoExistente(posicao)) {
		throw new TabuleiroException(" Posição não existe");
		
	}
	return pecas[posicao.getLinha()][posicao.getColuna()];
}
public void  colocarPeca(Peca peca,Posicao posicao) {
	if(haPeca(posicao)) {
		throw new TabuleiroException("Já existe uma peça na posicao."+ posicao);
	}
	pecas[posicao.getLinha()][posicao.getColuna()] = peca;
	peca.posicao = posicao;
}

private boolean posicaoExistente(int Linha,int Coluna) {
	return Linha >=0&&Linha<linha &&Coluna>=0&&Coluna<coluna;
}

public boolean posicaoExistente(Posicao posicao) {
	return posicaoExistente(posicao.getLinha(), posicao.getColuna());
}
public boolean haPeca(Posicao posicao) {
	if(!posicaoExistente(posicao)) {
		throw new TabuleiroException(" Posição não existe");
		
	}	
return 	peca(posicao)!=null;
	
}



}

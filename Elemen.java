public class Elemento<TIPO> {

	private TIPO valor;
	private Elemen<TIPO> esquerda;
	private Elemen<TIPO> direita;

	public Elemen(TIPO NovoValor)	{
		this.valor = NovoValor;
		this.esquerda = null;
		this.direita = null;
	}

	public TIPO getValor() {
		return valor;
	}

	public void setValor(TIPO valor) {
		this.valor = valor;
	}

	public Elemen<TIPO> getEsquerda() {
		return esquerda;
	}

	public void setEsquerda(Elemen<TIPO> esquerda) {
		this.esquerda = esquerda;
	}

	public Elemen<TIPO> getDireita() {
		return direita;
	}

	public void setDireita(Elemen<TIPO> direita) {
		this.direita = direita;
	}
}

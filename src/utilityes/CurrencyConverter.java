package utilityes;

public class CurrencyConverter {
	
	
	
	private int qtdeDolar;

	public int qtdeDolar(int qtdeDolar) {
		return this.qtdeDolar = qtdeDolar;
	}
	
	public double conversao() {
		int reais = 0;
		return this.qtdeDolar(qtdeDolar) * reais;
	}
	
	public double iof () {
		int reais = 0;
		return (qtdeDolar * reais * 6.0 ) / 100.0;
	}

}

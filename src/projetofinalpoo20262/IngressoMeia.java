package projetofinalpoo20262;

public class IngressoMeia extends Ingresso {

	private String docEstudante;

	public IngressoMeia(String codigo, String evento, double valorBase, String docEstudante) {
		super(codigo, evento, valorBase);
		this.docEstudante = docEstudante;
	}

	public double calcularValorFinal() {
		return getValorBase() * 0.50;
	}

	@Override
	public String toString() {
		return super.toString() + "\nDocumento do estudante: " + docEstudante + "\nValor Final() : "
				+ calcularValorFinal();
	}

}

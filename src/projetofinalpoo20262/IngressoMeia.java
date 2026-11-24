package projetofinalpoo20262;

public class IngressoMeia extends Ingresso {
	private String docEstudante;
	
	public IngressoMeia(String codigo, String evento, double valorBase, String docEstudante) {
		super(codigo, evento, valorBase);
		this.docEstudante=docEstudante;
	}
	
	@Override
	public double calcularValorFinal() {
		return getValorBase() * 0.50;
	}
	
	@Override
	public String toString() {
		String dadosBasicos = super.toString();
		double valorFinal = calcularValorFinal();
		return dadosBasicos + "\n | Documento: " + docEstudante + "\n | Valor final: R$ " + valorFinal;
	}
}
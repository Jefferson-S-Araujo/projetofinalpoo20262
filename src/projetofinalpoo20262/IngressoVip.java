package projetofinalpoo20262;

public class IngressoVip extends Ingresso {
	private double taxaOpenBar;
	
	public IngressoVip(String codigo, String evento, double valorBase, double taxaOpenBar) {
			super(codigo, evento, valorBase);
			this.taxaOpenBar = taxaOpenBar;
	}
		
	@Override
	public double calcularValorFinal() {
		return getValorBase() + taxaOpenBar;
	}
		
	@Override
	public String toString() {
		String dadosBasicos = super.toString();
		double valorFinal = calcularValorFinal();
		return dadosBasicos + " | Valor da taxa Open Bar: R$ " + taxaOpenBar + " | Valor final: R$ " + valorFinal;
		}
	
}

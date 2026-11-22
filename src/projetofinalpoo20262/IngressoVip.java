package projetofinalpoo20262;

public class IngressoVip extends Ingresso {
	private double taxaOpenBar;
	
	public IngressoVip(String codigo, String evento, double valorBase, double taxaOpenBar) {
		super(codigo, evento, valorBase);
		
		this.taxaOpenBar = taxaOpenBar;
	}
	
	public double calcularValorFinal() {
		return getValorBase() + taxaOpenBar;
	}
	@Override
	public String toString(){
		return super.toString() + "Taxa Open Bar: " + taxaOpenBar + "\nValor total do ingresso: " + calcularValorFinal();
		
	}
}

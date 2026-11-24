package projetofinalpoo20262;

public abstract class Ingresso {

	private String codigo;
	private String evento;
	private double valorBase;

	public Ingresso(String codigo, String evento, double valorBase) {
		setCodigo(codigo);
		setEvento(evento);
		setValorBase(valorBase);
	}

	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		if (codigo == null || codigo.isBlank()) {
			throw new IllegalArgumentException("Código inválido!");
		}
		this.codigo = codigo;
	}

	public String getEvento() {
		return this.evento;
	}

	public void setEvento(String evento) {
		if (evento == null || evento.isBlank()) {
			throw new IllegalArgumentException("Evento inválido!");
		}
		this.evento = evento;
	}

	public double getValorBase() {
		return this.valorBase;
	}

	public void setValorBase(double valorBase) {
		try {
			if (!Double.isFinite(valorBase) || valorBase <= 0) {
				throw new IllegalArgumentException("O valor dever maior que zero!");
			}

			this.valorBase = valorBase;

		} catch (IllegalArgumentException erro) {
			System.err.println(erro.getMessage());

		}
	}
	public abstract double calcularValorFinal();
	

	@Override
	public String toString() {
		return "Código: " + codigo + "\nEvento: " + evento + "\nValor Base: " + valorBase;
	}

}

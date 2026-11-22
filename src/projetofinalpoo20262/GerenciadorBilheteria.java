package projetofinalpoo20262;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorBilheteria {
	private List<Ingresso> ingressos = new ArrayList<>();
	
	public void adcionar(Ingresso ingresso) {
		ingressos.add(ingresso);
		
	}
	public void listarTodos() {
		if (ingressos.isEmpty()) {
			System.out.println("Nenhum ingresso foi adicionado a lista.");
			return;
		}
		for (Ingresso ingresso : ingressos) {
			System.out.println(ingresso);
			
		}
	}
	
	
	public double calcularTotalGeral() {
		double total = 0;
		for (Ingresso ingresso : ingressos) {
			total += ingresso.calcularValorFinal();
		}
		return total;
	}
	
}

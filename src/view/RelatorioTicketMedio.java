package view;

import model.RelatorioVendas;

public class RelatorioTicketMedio implements RelatorioVendasObserver {
	private RelatorioVendas relatorio;

	public RelatorioTicketMedio(RelatorioVendas relatorio) {
		this.relatorio = relatorio;
		this.relatorio.adicionarObservador(this);
	}

	@Override
	public void update() {
		System.out.println("Relatório de Ticket Médio atualizado: " + relatorio.getDadosVendas());
	}

	public void changeData(String valor) {
		relatorio.setDadosVendas(valor);
	}
}

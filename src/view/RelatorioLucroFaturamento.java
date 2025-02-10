package view;

import model.RelatorioVendas;

public class RelatorioLucroFaturamento implements RelatorioVendasObserver {
	private RelatorioVendas relatorio;

	public RelatorioLucroFaturamento(RelatorioVendas relatorio) {
		this.relatorio = relatorio;
		this.relatorio.adicionarObservador(this);
	}

	@Override
	public void update() {
		System.out.println("Relatório de Lucro/Faturamento atualizado: " + relatorio.getDadosVendas());
	}

	public void changeData(String valor) {
		relatorio.setDadosVendas(valor);
	}
}

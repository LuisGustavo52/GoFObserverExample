package view;

import model.RelatorioVendas;

public class RankingVendedores implements RelatorioVendasObserver {
	private RelatorioVendas relatorio;

	public RankingVendedores(RelatorioVendas relatorio) {
		this.relatorio = relatorio;	
		this.relatorio.adicionarObservador(this);
	
	}

	@Override
	public void update() {
		System.out.println("Ranking de Vendedores atualizado: " + relatorio.getDadosVendas());
	}

	public void changeData(String valor) {
		relatorio.setDadosVendas(valor);
	}
}

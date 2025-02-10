package model;

class RelatorioVendas extends RelatorioVendasSubject {
    private String estadoRelatorioVendas;

    public String getDadosVendas() {
		return estadoRelatorioVendas;
	}

	public void setDadosVendas(String dadosVendas) {
		this.estadoRelatorioVendas = dadosVendas;
	}

}

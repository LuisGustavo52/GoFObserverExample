package view;

import model.*;

public class Main {
	public static void main(String[] args) {
        relatorioVendas relatorioVendas = new RelatorioVendas();

        RelatorioTicketMedio ticketMedio = new RelatorioTicketMedio();
        RelatorioLucroFaturamento lucroFaturamento = new RelatorioLucroFaturamento();
        RankingVendedores rankingVendedores = new RankingVendedores();

        relatorioVendas.adicionarObservador(ticketMedio);
        relatorioVendas.adicionarObservador(lucroFaturamento);
        relatorioVendas.adicionarObservador(rankingVendedores);

        relatorioVendas.gerarRelatorio("Vendas: R$ 50.000 | Ticket Médio: R$ 500 | Lucro: R$ 20.000");
    }
}

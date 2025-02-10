package view;

import model.*;

public class Main {
	public static void main(String[] args) {
        RelatorioVendas relatorio = new RelatorioVendas();
        RankingVendedores rank = new RankingVendedores(relatorio);
        new RelatorioTicketMedio(relatorio);
        new RelatorioLucroFaturamento(relatorio);
        
        relatorio.setDadosVendas("Valor representativo");
        System.out.println();
        
        rank.changeData("Valor representativo 2.0");
        System.out.println();
	}
}

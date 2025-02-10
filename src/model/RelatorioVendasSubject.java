package model;
import java.util.ArrayList;
import java.util.List;

import view.RelatorioVendasObserver;

abstract class RelatorioVendasSubject {
    private final List<RelatorioVendasObserver> objList = new ArrayList<>();

    public void adicionarObservador(RelatorioVendasObserver observer) {
        objList.add(observer);
    }

    public void removerObservador(RelatorioVendasObserver observer) {
        objList.remove(observer);
    }

    public void notify(String dados) {
        for (RelatorioVendasObserver observer : objList) {
            observer.update(dados);
        }
    }
}
package c214.strategy.impl;

import java.util.List;

import c214.Strategy;

public class BubbleSort implements Strategy {

    @Override
    public List<Integer> ordena(List<Integer> lista) {
        boolean troca = true;
        int aux;

        while (troca) {
            troca = false;
            for (int i = 0; i < lista.size() - 1; i++) {
                if (lista.get(i) > lista.get(i + 1)) {
                    aux = lista.get(i);
                    lista.set(i, lista.get(i + 1));
                    lista.set(i + 1, aux);
                    troca = true;
                }
            }
        }
        return lista;
    }

}

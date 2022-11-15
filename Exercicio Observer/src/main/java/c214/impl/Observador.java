package c214.impl;

import c214.interfaces.iObservador;

public class Observador implements iObservador {

    int id;

    public Observador(int id) {
        this.id = id;
    }

    @Override
    public void update(Observavel observavel) {
        System.out.println("Observador " + id + " foi notificado");
        System.out.println("Numero de palavras: " + observavel.contarPalavras(observavel.getFrase()));
        System.out.println("Numero de palavras pares: " + observavel.contarPalavrasPares(observavel.getFrase()));
        System.out.println("Numero de palavras comecadas com maiuscula: " + observavel.contarPalavrasComecadasComMaiuscula(observavel.getFrase()));
    }
}

package c214.impl;

import c214.interfaces.iObservavel;

import java.util.ArrayList;
import java.util.List;

public class Observavel implements iObservavel {

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public List<Observador> getObservadores() {
        return observadores;
    }

    public void setObservadores(List<Observador> observadores) {
        this.observadores = observadores;
    }

    private String frase;
    private List<Observador> observadores;

    public Observavel() {
        observadores = new ArrayList<Observador>();
    }

    @Override
    public void adicionarObservador(Observador observador) {
        observadores.add(observador);
    }

    @Override
    public void removerObservador(Observador observador) {
        if(observadores.contains(observador)) {
            observadores.remove(observador);
        }
    }

    @Override
    public void notificarObservadores() {
        for(Observador observador : observadores) {
            observador.update(this);
        }
    }

    public int contarPalavras(String frase) {
        this.frase = frase;
        int numPalavras = frase.split(" ").length;
        return numPalavras;
    }

    public int contarPalavrasPares(String frase) {
        this.frase = frase;
        int numPalavras = 0;
        for(String palavra : frase.split(" ")) {
            if(palavra.length() % 2 == 0) {
                numPalavras++;
            }
        }
        return numPalavras;
    }

    public int contarPalavrasComecadasComMaiuscula(String frase) {
        this.frase = frase;
        String regex = "^([A-Z])$";
        int numPalavras = 0;
        for(String palavra : frase.split(" ")) {
            if(palavra.charAt(0) >= 'A' && palavra.charAt(0) <= 'Z') {
                numPalavras++;
            }
        }
        return numPalavras;
    }

}

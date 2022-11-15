package c214;

import c214.impl.Observador;
import c214.impl.Observavel;

public class Main {
    public static void main(String[] args) {
        Observavel observavel = new Observavel();

        Observador observador1 = new Observador(1);
        Observador observador2 = new Observador(2);
        Observador observador3 = new Observador(3);

        observavel.adicionarObservador(observador1);
        observavel.adicionarObservador(observador2);
        observavel.adicionarObservador(observador3);

        String frase = "Somos quase 8 bilhoes de pessoas";

        observavel.contarPalavras(frase);
        observavel.contarPalavrasPares(frase);
        observavel.contarPalavrasComecadasComMaiuscula(frase);

        System.out.println("\n\nNotificando observadores");
        observavel.notificarObservadores();

        observavel.removerObservador(observador1);

        System.out.println("\n\nNotificando observadores");
        observavel.notificarObservadores();

        observavel.removerObservador(observador2);

        System.out.println("\n\nNotificando observadores");
        observavel.notificarObservadores();
    }
}

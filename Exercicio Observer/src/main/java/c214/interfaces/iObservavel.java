package c214.interfaces;

import c214.impl.Observador;

public interface iObservavel {

    public void adicionarObservador(Observador observador);

    public void removerObservador(Observador observador);

    public void notificarObservadores();

}

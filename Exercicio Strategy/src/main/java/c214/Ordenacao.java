package c214;

import java.util.List;

public class Ordenacao {
    
    protected Strategy strategy;

    public List<Integer> ordena(List<Integer> lista) {
        return strategy.ordena(lista);
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public Strategy getStrategy() {
        return strategy;
    }

}

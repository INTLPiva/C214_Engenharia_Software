package c214;

import c214.strategy.impl.BubbleSort;

public class OrdenaBubbleSort extends Ordenacao {
    
    public OrdenaBubbleSort() {
        this.strategy = new BubbleSort();
    }
}

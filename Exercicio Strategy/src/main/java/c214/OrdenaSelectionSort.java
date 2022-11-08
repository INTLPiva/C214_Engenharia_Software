package c214;

import c214.strategy.impl.SelectionSort;

public class OrdenaSelectionSort extends Ordenacao {
    
    public OrdenaSelectionSort() {
        this.strategy = new SelectionSort();
    }
}

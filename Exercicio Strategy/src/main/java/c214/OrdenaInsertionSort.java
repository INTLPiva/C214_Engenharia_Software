package c214;

import c214.strategy.impl.InsertionSort;

public class OrdenaInsertionSort extends Ordenacao {
    
    public OrdenaInsertionSort() {
        this.strategy = new InsertionSort();
    }
}

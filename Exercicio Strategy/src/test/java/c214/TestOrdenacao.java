package c214;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.*;

import c214.OrdenaBubbleSort;
import c214.OrdenaInsertionSort;
import c214.OrdenaSelectionSort;
import c214.Ordenacao;
import c214.strategy.impl.BubbleSort;
import c214.strategy.impl.InsertionSort;
import c214.strategy.impl.SelectionSort;

public class TestOrdenacao {
    Ordenacao ordenacao;
    List<Integer> lista;
    List<Integer> esperado;

    @Before
    public void init() {
        lista = Arrays.asList(5, 2, 3, 1, 4);
        esperado = Arrays.asList(1, 2, 3, 4, 5);
    }

    @Test
    public void testBubbleSort() {
        ordenacao = new OrdenaBubbleSort();
        assertTrue(ordenacao.getStrategy() instanceof BubbleSort);
    }

    @Test
    public void testOrdenaBubbleSort() {
        ordenacao = new OrdenaBubbleSort();

        List<Integer> resultado = ordenacao.ordena(lista);
        assertEquals(esperado, resultado);
    }

    @Test
    public void testSelectionSort() {
        ordenacao = new OrdenaSelectionSort();
        assertTrue(ordenacao.getStrategy() instanceof SelectionSort);
    }

    @Test
    public void testOrdenaSelectionSort() {
        ordenacao = new OrdenaSelectionSort();

        List<Integer> resultado = ordenacao.ordena(lista);
        assertEquals(esperado, resultado);
    }

    @Test
    public void testInsertionSort() {
        ordenacao = new OrdenaInsertionSort();
        assertTrue(ordenacao.getStrategy() instanceof InsertionSort);
    }

    @Test
    public void testOrdenaInsertionSort() {
        ordenacao = new OrdenaInsertionSort();

        List<Integer> resultado = ordenacao.ordena(lista);
        assertEquals(esperado, resultado);
    }
}
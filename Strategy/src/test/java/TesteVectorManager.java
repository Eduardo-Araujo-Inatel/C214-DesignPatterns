import OrdenacaoStrategy.OrdenaBubble;
import OrdenacaoStrategy.OrdenaInsertion;
import OrdenacaoStrategy.OrdenaSelection;
import OrdenacaoStrategy.VectorManager;
import OrdenacaoStrategy.algoritmos.Ord_BubbleSort;

import OrdenacaoStrategy.algoritmos.Ord_InsertionSort;
import OrdenacaoStrategy.algoritmos.Ord_Selection;
import org.junit.Test;

import static org.junit.Assert.*;

public class TesteVectorManager {
    VectorManager vectorManager;

    @Test
    public void testeOrdenaBubbleSort() {
        vectorManager = new OrdenaBubble();
        assertTrue(vectorManager.getOrdena() instanceof Ord_BubbleSort);
    }

    @Test
    public void testeOrdenaInsertionSort() {
        vectorManager = new OrdenaInsertion();
        assertTrue(vectorManager.getOrdena() instanceof Ord_InsertionSort);
    }

    @Test
    public void testeOrdenaSelectionSort() {
        vectorManager = new OrdenaSelection();
        assertTrue(vectorManager.getOrdena() instanceof Ord_Selection);
    }

    @Test
    public void testeOrdenaCertoVetorBubbleSort() {
        vectorManager = new OrdenaBubble();
        int vetor[] = {5, 2, 9, 1, 10, 4, 8};
        vetor = vectorManager.Ordenada(vetor);
        int vetorResult[] = {1, 2, 4, 5, 8, 9, 10};
        assertArrayEquals(vetor, vetorResult);
    }

    @Test
    public void testeOrdenaCertoVetorInsertionSort() {
        vectorManager = new OrdenaInsertion();
        int vetor[] = {5, 2, 9, 1, 10, 4, 8};
        vetor = vectorManager.Ordenada(vetor);
        int vetorResult[] = {1, 2, 4, 5, 8, 9, 10};
        assertArrayEquals(vetor, vetorResult);
    }

    @Test
    public void testeOrdenaCertoVetorSelectionSort() {
        vectorManager = new OrdenaSelection();
        int vetor[] = {5, 2, 9, 1, 10, 4, 8};
        vetor = vectorManager.Ordenada(vetor);
        int vetorResult[] = {1, 2, 4, 5, 8, 9, 10};
        assertArrayEquals(vetor, vetorResult);
    }

}

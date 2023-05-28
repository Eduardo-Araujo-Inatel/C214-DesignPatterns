package OrdenacaoStrategy;

public abstract class VectorManager {

    protected Ordenacao ordena;

    public int[] Ordenada(int vetor[]) {
        return ordena.OrdenaVetor(vetor);
    }

    public Ordenacao getOrdena() {
        return ordena;
    }

    public void setOrdena(Ordenacao ordena) {
        this.ordena = ordena;
    }
}

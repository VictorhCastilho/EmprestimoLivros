import java.util.ArrayList;
import java.util.List;

public class ListaGenerica<T> {
    private List<T> lista;

    public ListaGenerica() {
        lista = new ArrayList<>();
    }

    public void adicionar(T item) {
        lista.add(item);
    }

    public void remover(T item) {
        lista.remove(item);
    }

    public boolean verificar(T item) {
        return lista.contains(item);
    }

    public List<T> getLista() {
        return new ArrayList<>(lista);
    }

    public void setLista(List<T> lista) {
        this.lista = lista;
    }
}
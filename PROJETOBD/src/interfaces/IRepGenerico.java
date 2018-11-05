package interfaces;

public interface IRepGenerico<E> {

    public abstract void inserir(E e) throws Exception;

    public abstract void atualizar(E e) throws Exception;

    public abstract void remover(E e) throws Exception;

    public abstract E procurar(String key) throws Exception;
}

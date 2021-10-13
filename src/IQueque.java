public interface IQueque<E> {
    int size();
    boolean isEmpty();
    void enqueue(E e);
    E dequeue();
    E first();
}

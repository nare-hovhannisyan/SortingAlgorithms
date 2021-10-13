public interface IDequeue<E> {
    int size();
    boolean isEmpty();
    E first();
    E last();
    void addFirst(E el);
    void addLast(E el);
    E removeFirst();
    E removeLast();
}

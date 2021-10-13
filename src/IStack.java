public interface IStack<E> {
    int size();
    boolean isEmpty();
    void push(E el) ;
    E pop();
    E top();

}
